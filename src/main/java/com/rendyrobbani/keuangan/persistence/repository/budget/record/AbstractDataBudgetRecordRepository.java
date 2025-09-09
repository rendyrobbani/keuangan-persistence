package com.rendyrobbani.keuangan.persistence.repository.budget.record;

import com.rendyrobbani.keuangan.core.domain.entity.DataEntity;
import com.rendyrobbani.keuangan.core.domain.entity.budget.jadwal.DataBudgetJadwal;
import com.rendyrobbani.keuangan.core.domain.entity.budget.record.DataBudgetRecordEntity;
import com.rendyrobbani.keuangan.core.domain.repository.budget.record.DataBudgetRecordRepository;
import com.rendyrobbani.keuangan.persistence.entity.AbstractBaseEntity;
import com.rendyrobbani.keuangan.persistence.entity.budget.record.AbstractDataBudgetRecordEntity;
import com.rendyrobbani.keuangan.persistence.repository.budget.AbstractDataBudgetRepository;
import com.rendyrobbani.keuangan.persistence.repository.budget.DataBudgetJpaRepository;
import jakarta.persistence.Column;
import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractDataBudgetRecordRepository<
		ENTITY extends AbstractDataBudgetRecordEntity<DOMAIN, COMMON, COMMONID>,
		DOMAIN extends DataBudgetRecordEntity<COMMON, COMMONID>,
		COMMON extends DataEntity<COMMONID>,
		COMMONID
		>
		extends AbstractDataBudgetRepository<ENTITY, DOMAIN, String>
		implements DataBudgetRecordRepository<DOMAIN, COMMON, COMMONID> {

	protected abstract DataBudgetRecordJpaRepository<ENTITY, DOMAIN, COMMON, COMMONID> repositoryOfBudgetRecord();

	@Override
	protected DataBudgetJpaRepository<ENTITY, DOMAIN, String> repositoryOfBudget() {
		return this.repositoryOfBudgetRecord();
	}

	@Override
	public List<DOMAIN> findByJadwalId(Long jadwalId) {
		if (jadwalId == null) return List.of();
		return this.repositoryOfBudgetRecord().findByJadwalId(jadwalId).stream().map(AbstractBaseEntity::toDomain).toList();
	}

	@Override
	public List<DOMAIN> findByJadwalIdAndIsDeletedFalse(Long jadwalId) {
		if (jadwalId == null) return List.of();
		return this.repositoryOfBudgetRecord().findByJadwalIdAndIsDeleted(jadwalId, false).stream().map(AbstractBaseEntity::toDomain).toList();
	}

	@Override
	public List<DOMAIN> findByJadwalIdAndIsDeletedTrue(Long jadwalId) {
		if (jadwalId == null) return List.of();
		return this.repositoryOfBudgetRecord().findByJadwalIdAndIsDeleted(jadwalId, true).stream().map(AbstractBaseEntity::toDomain).toList();
	}

	@Override
	public List<DOMAIN> findByJadwal(DataBudgetJadwal jadwal) {
		return this.findByJadwalId(jadwal == null ? null : jadwal.id());
	}

	@Override
	public List<DOMAIN> findByJadwalAndIsDeletedFalse(DataBudgetJadwal jadwal) {
		return this.findByJadwalIdAndIsDeletedFalse(jadwal == null ? null : jadwal.id());
	}

	@Override
	public List<DOMAIN> findByJadwalAndIsDeletedTrue(DataBudgetJadwal jadwal) {
		return this.findByJadwalIdAndIsDeletedTrue(jadwal == null ? null : jadwal.id());
	}

	@Override
	@SneakyThrows
	public void deleteByJadwal(Connection connection, DataBudgetJadwal jadwal) {
		List<String> sql = new ArrayList<>();
		sql.add("delete from " + ENTITY.TABLE_NAME);
		sql.add("where jadwal_id = ?");

		try (PreparedStatement statement = connection.prepareStatement(String.join(System.lineSeparator(), sql))) {
			statement.setLong(1, jadwal.id());
			statement.execute();
		}
	}

	@Override
	@SneakyThrows
	public void saveByJadwal(Connection connection, DataBudgetJadwal jadwal) {
		List<String> into = new ArrayList<>();
		List<String> from = new ArrayList<>();
		for (Field field : this.entityFields()) {
			Column column = field.getAnnotation(Column.class);
			into.add(column.name());
			switch (column.name()) {
				case "id" -> from.add(this.idValue());
				case "jadwal_id" -> from.add("?");
				case "common_id" -> from.add("t.id");
				default -> from.add("t." + column.name());
			}
		}

		List<String> sql = new ArrayList<>();
		sql.add("insert into " + this.domainClass.getDeclaredField("TABLE_NAME").get(null) + " (" + String.join(", ", into) + ")");
		sql.add("select " + String.join(", ", from));
		sql.add("from " + this.commonClass.getDeclaredField("TABLE_NAME").get(null) + " t");

		String query = String.join(System.lineSeparator(), sql);
		try (PreparedStatement statement = connection.prepareStatement(query)) {
			for (int i = 0; i < query.chars().filter(c -> c == '?').count(); i++) {
				System.out.println("Index : " + (i + 1));
				statement.setLong(i + 1, jadwal.id());
			}
			statement.execute();
		}
	}

	protected Class<COMMON> commonClass;

	protected Class<COMMONID> commonIdClass;

	@Override
	@SuppressWarnings("unchecked")
	protected void initClass() {
		super.initClass();
		if (this.commonClass == null || this.commonIdClass == null) {
			ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
			this.commonClass = (Class<COMMON>) type.getActualTypeArguments()[2];
			this.commonIdClass = (Class<COMMONID>) type.getActualTypeArguments()[3];
		}
	}

	private String idValue() {
		this.initClass();
		String value = "t.id";
		if (List.of(byte.class, Byte.class).contains(this.commonIdClass)) value = "lpad(t.id, 4, '0')";
		if (List.of(short.class, Short.class).contains(this.commonIdClass)) value = "lpad(t.id, 7, '0')";
		if (List.of(int.class, Integer.class).contains(this.commonIdClass)) value = "lpad(t.id, 11, '0')";
		if (List.of(long.class, Long.class).contains(this.commonIdClass)) value = "lpad(t.id, 20, '0')";
		return "concat_ws('|', ?, " + value + ")";
	}

	protected List<Method> commonMethods() {
		initClass();
		Map<String, Method> methods = new HashMap<>();
		Class<?> commonClass = this.commonClass;
		while (commonClass != null) {
			for (Method method : commonClass.getDeclaredMethods()) if (!methods.containsKey(method.getName()) && method.getParameterCount() == 0) methods.put(method.getName(), method);
			commonClass = commonClass.getSuperclass();
		}
		return List.copyOf(methods.values());
	}

}
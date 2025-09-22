package com.rendyrobbani.keuangan.persistence.repository.budget.common.ie;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.DataBudgetCommonBidangEntity;
import com.rendyrobbani.keuangan.core.domain.repository.budget.common.ie.DataBudgetCommonBidangRepository;
import com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.AbstractDataBudgetCommonBidangEntity;
import com.rendyrobbani.keuangan.persistence.repository.budget.AbstractDataBudgetRepository;
import jakarta.persistence.Column;
import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.sql.Types;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractDataBudgetCommonBidangRepository<
		ENTITY extends AbstractDataBudgetCommonBidangEntity<DOMAIN>,
		DOMAIN extends DataBudgetCommonBidangEntity
		>
		extends AbstractDataBudgetRepository<ENTITY, DOMAIN, String>
		implements DataBudgetCommonBidangRepository<DOMAIN> {

	@Override
	@SneakyThrows
	public void deleteAll(Connection connection, LocalDateTime deletedAt, String deletedBy) {
		try (PreparedStatement statement = connection.prepareStatement(String.join(System.lineSeparator(), this.deleteSql()))) {
			int index = 1;

			if (deletedAt == null) statement.setNull(index++, Types.NULL);
			else statement.setTimestamp(index++, Timestamp.valueOf(deletedAt));

			if (deletedBy == null) statement.setNull(index++, Types.NULL);
			else statement.setString(index++, deletedBy);

			statement.execute();
		}
	}

	@Override
	@SneakyThrows
	public void updateAll(Connection connection, LocalDateTime updatedAt, String updatedBy) {
		try (PreparedStatement statement = connection.prepareStatement(String.join(System.lineSeparator(), this.updateSql()))) {
			int index = 1;

			if (updatedAt == null) statement.setNull(index++, Types.NULL);
			else statement.setTimestamp(index++, Timestamp.valueOf(updatedAt));

			if (updatedBy == null) statement.setNull(index++, Types.NULL);
			else statement.setString(index++, updatedBy);

			statement.execute();
		}
	}

	@Override
	@SneakyThrows
	public void deleteBySkpdId(Connection connection, LocalDateTime deletedAt, String deletedBy, String skpdId) {
		List<String> params = List.of("skpd_id = ?");
		try (PreparedStatement statement = connection.prepareStatement(String.join(System.lineSeparator(), this.deleteSql(params)))) {
			int index = 1;

			if (deletedAt == null) statement.setNull(index++, Types.NULL);
			else statement.setTimestamp(index++, Timestamp.valueOf(deletedAt));

			if (deletedBy == null) statement.setNull(index++, Types.NULL);
			else statement.setString(index++, deletedBy);

			if (skpdId == null) statement.setNull(index++, Types.NULL);
			else statement.setString(index++, skpdId);

			statement.execute();
		}
	}

	@Override
	@SneakyThrows
	public void updateBySkpdId(Connection connection, LocalDateTime updatedAt, String updatedBy, String skpdId) {
		List<String> params = List.of("skpd_id = ?");
		try (PreparedStatement statement = connection.prepareStatement(String.join(System.lineSeparator(), this.updateSql(params)))) {
			int index = 1;

			if (updatedAt == null) statement.setNull(index++, Types.NULL);
			else statement.setTimestamp(index++, Timestamp.valueOf(updatedAt));

			if (updatedBy == null) statement.setNull(index++, Types.NULL);
			else statement.setString(index++, updatedBy);

			if (skpdId == null) statement.setNull(index++, Types.NULL);
			else statement.setString(index++, skpdId);

			statement.execute();
		}
	}

	@Override
	@SneakyThrows
	public void deleteByUnitId(Connection connection, LocalDateTime deletedAt, String deletedBy, String unitId) {
		List<String> params = List.of("unit_id = ?");
		try (PreparedStatement statement = connection.prepareStatement(String.join(System.lineSeparator(), this.deleteSql(params)))) {
			int index = 1;

			if (deletedAt == null) statement.setNull(index++, Types.NULL);
			else statement.setTimestamp(index++, Timestamp.valueOf(deletedAt));

			if (deletedBy == null) statement.setNull(index++, Types.NULL);
			else statement.setString(index++, deletedBy);

			if (unitId == null) statement.setNull(index++, Types.NULL);
			else statement.setString(index++, unitId);

			statement.execute();
		}
	}

	@Override
	@SneakyThrows
	public void updateByUnitId(Connection connection, LocalDateTime updatedAt, String updatedBy, String unitId) {
		List<String> params = List.of("unit_id = ?");
		try (PreparedStatement statement = connection.prepareStatement(String.join(System.lineSeparator(), this.updateSql(params)))) {
			int index = 1;

			if (updatedAt == null) statement.setNull(index++, Types.NULL);
			else statement.setTimestamp(index++, Timestamp.valueOf(updatedAt));

			if (updatedBy == null) statement.setNull(index++, Types.NULL);
			else statement.setString(index++, updatedBy);

			if (unitId == null) statement.setNull(index++, Types.NULL);
			else statement.setString(index++, unitId);

			statement.execute();
		}
	}

	@Override
	@SneakyThrows
	public void deleteByUnitIdAndBidangId(Connection connection, LocalDateTime deletedAt, String deletedBy, String unitId, String bidangId) {
		List<String> params = List.of("unit_id = ?");
		try (PreparedStatement statement = connection.prepareStatement(String.join(System.lineSeparator(), this.deleteSql(params)))) {
			int index = 1;

			if (deletedAt == null) statement.setNull(index++, Types.NULL);
			else statement.setTimestamp(index++, Timestamp.valueOf(deletedAt));

			if (deletedBy == null) statement.setNull(index++, Types.NULL);
			else statement.setString(index++, deletedBy);

			if (unitId == null) statement.setNull(index++, Types.NULL);
			else statement.setString(index++, unitId);

			if (bidangId == null) statement.setNull(index++, Types.NULL);
			else statement.setString(index++, bidangId);

			statement.execute();
		}
	}

	@Override
	@SneakyThrows
	public void updateByUnitIdAndBidangId(Connection connection, LocalDateTime updatedAt, String updatedBy, String unitId, String bidangId) {
		List<String> params = List.of("unit_id = ?");
		try (PreparedStatement statement = connection.prepareStatement(String.join(System.lineSeparator(), this.updateSql(params)))) {
			int index = 1;

			if (updatedAt == null) statement.setNull(index++, Types.NULL);
			else statement.setTimestamp(index++, Timestamp.valueOf(updatedAt));

			if (updatedBy == null) statement.setNull(index++, Types.NULL);
			else statement.setString(index++, updatedBy);

			if (unitId == null) statement.setNull(index++, Types.NULL);
			else statement.setString(index++, unitId);

			if (bidangId == null) statement.setNull(index++, Types.NULL);
			else statement.setString(index++, bidangId);

			statement.execute();
		}
	}

	protected abstract String tableSource();

	private String deleteSql;

	private String updateSql;

	@SneakyThrows
	private String deleteSql(List<String> params) {
		if (this.deleteSql == null) {
			this.initClass();
			List<String> sql = new ArrayList<>();
			sql.add("update " + this.domainClass.getDeclaredField("TABLE_NAME").get(null));
			sql.add("set is_deleted = true");
			sql.add("    deleted_at = ?");
			sql.add("    deleted_by = ?");
			this.deleteSql = String.join(System.lineSeparator(), sql);
		}
		return (params == null || params.isEmpty()) ? this.deleteSql : (this.deleteSql + "where " + String.join(" and ", params));
	}

	@SneakyThrows
	private String deleteSql() {
		return this.deleteSql(null);
	}

	@SneakyThrows
	private String updateSql(List<String> params) {
		if (this.updateSql == null) {
			this.initClass();
			List<String> targetCols = new ArrayList<>();
			List<String> targetVals = new ArrayList<>();
			List<String> updateCols = new ArrayList<>();
			List<String> updateVals = new ArrayList<>();
			List<String> groups = new ArrayList<>();

			for (Field field : this.entityFields()) {
				Column column = field.getAnnotation(Column.class);

				switch (column.name()) {
					case "id" -> {
						targetCols.add(column.name());
						targetVals.add("concat_ws('|', a.unit_id)");
					}
					case "created_at", "created_by" -> {
						targetCols.add(column.name());
						targetVals.add("?");
					}
					case "updated_at", "updated_by" -> {
						updateCols.add(column.name());
						updateVals.add("t." + column.name().replace("updated", "created"));
					}
					case "is_locked" -> {
						targetCols.add(column.name());
						targetVals.add("false");
					}
					case "is_deleted" -> {
						targetCols.add(column.name());
						targetVals.add("false");
						updateCols.add(column.name());
						updateVals.add("t." + column.name());
					}
					case "locked_at", "locked_by", "deleted_at", "deleted_by" -> {
						targetCols.add(column.name());
						targetVals.add("null");
					}
					case "sebelum", "total" -> {
						targetCols.add(column.name());
						targetVals.add("sum(" + column.name() + ")");
						updateCols.add(column.name());
						updateVals.add("t." + column.name());
					}
					default -> {
						groups.add(column.name());
						targetCols.add(column.name());
						targetVals.add("a." + column.name());
						updateCols.add(column.name());
						updateVals.add("t." + column.name());
					}
				}
			}

			List<String> sql = new ArrayList<>();
			sql.add("insert into " + this.domainClass.getDeclaredField("TABLE_NAME").get(null) + " (" + String.join(", ", targetCols) + ")");

			{
				sql.add("select *");
				sql.add("from (");

				int max = 0;
				for (String col : targetVals) max = Math.max(max, col.length());

				String command = "select";
				for (int i = 0; i < targetVals.size(); i++) {
					List<String> row = new ArrayList<>();
					row.add("\t" + (i == 0 ? command : (" ".repeat(command.length() - 1) + ",")));
					row.add(targetVals.get(i));
					if (targetVals.get(i).length() < max) row.add(" ".repeat(max - targetVals.get(i).length() - 1));
					row.add("as");
					row.add(targetCols.get(i));
					sql.add(String.join(" ", row));
				}

				sql.add("\t" + "from " + this.tableSource() + " a");
				sql.add("\t" + "where !a.is_deleted");
				sql.add("\t" + "group by " + String.join(", ", groups));
				sql.add(") t");
			}
			{
				int max = 0;
				for (String col : updateVals) max = Math.max(max, col.length());

				String command = "on duplicate key update";
				for (int i = 0; i < updateVals.size(); i++) {
					List<String> row = new ArrayList<>();
					row.add((i == 0 ? command : (" ".repeat(command.length() - 1) + ",")));
					row.add(updateCols.get(i));
					if (updateVals.get(i).length() < max) row.add(" ".repeat(max - updateVals.get(i).length() - 1));
					row.add("=");
					row.add(updateVals.get(i));
					sql.add(String.join(" ", row));
				}
			}

			this.updateSql = String.join(System.lineSeparator(), sql);
		}
		return (params == null || params.isEmpty()) ? this.updateSql : this.updateSql.replace("where !a.is_deleted", "where !a.is_deleted and " + String.join(" and ", params));
	}

	@SneakyThrows
	private String updateSql() {
		return this.updateSql(null);
	}

}
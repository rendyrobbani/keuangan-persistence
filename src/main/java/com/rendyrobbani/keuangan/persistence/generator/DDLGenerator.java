package com.rendyrobbani.keuangan.persistence.generator;

import com.rendyrobbani.keuangan.core.domain.vo.Gender;
import com.rendyrobbani.keuangan.core.domain.vo.JabatanStatus;
import com.rendyrobbani.keuangan.core.domain.vo.Pangkat;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.bidang.DataMasterBidangEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.bidang.SipdMasterBidangEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.fungsi.DataMasterFungsiEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.kabupaten.DataMasterKabupatenEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.kabupaten.SipdMasterKabupatenEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.kecamatan.DataMasterKecamatanEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.kecamatan.SipdMasterKecamatanEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.kegiatan.DataMasterKegiatanEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.kegiatan.SipdMasterKegiatanEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.kelurahan.DataMasterKelurahanEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.kelurahan.SipdMasterKelurahanEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.organisasi.DataMasterOrganisasiEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.organisasi.LogsMasterOrganisasiEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.organisasi.SipdMasterOrganisasiEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.program.DataMasterProgramEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.program.SipdMasterProgramEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.provinsi.DataMasterProvinsiEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.provinsi.SipdMasterProvinsiEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.subfungsi.DataMasterSubfungsiEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.subkegiatan.DataMasterSubkegiatanEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.subkegiatan.SipdMasterSubkegiatanEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.urusan.DataMasterUrusanEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.urusan.SipdMasterUrusanEntity;
import com.rendyrobbani.keuangan.persistence.entity.user.DataUserEntity;
import com.rendyrobbani.keuangan.persistence.entity.user.LogsUserEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;
import org.hibernate.annotations.Check;
import org.hibernate.annotations.Checks;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class DDLGenerator {

	private static List<Class<?>> entityClasses;

	private static List<Class<?>> entityClasses() {
		if (entityClasses == null) {
			entityClasses = new ArrayList<>();

			entityClasses.add(DataUserEntity.class);
			entityClasses.add(LogsUserEntity.class);

			entityClasses.add(DataMasterProvinsiEntity.class);
			entityClasses.add(SipdMasterProvinsiEntity.class);
			entityClasses.add(DataMasterKabupatenEntity.class);
			entityClasses.add(SipdMasterKabupatenEntity.class);
			entityClasses.add(DataMasterKecamatanEntity.class);
			entityClasses.add(SipdMasterKecamatanEntity.class);
			entityClasses.add(DataMasterKelurahanEntity.class);
			entityClasses.add(SipdMasterKelurahanEntity.class);

			entityClasses.add(DataMasterFungsiEntity.class);
			entityClasses.add(DataMasterSubfungsiEntity.class);

			entityClasses.add(DataMasterUrusanEntity.class);
			entityClasses.add(SipdMasterUrusanEntity.class);
			entityClasses.add(DataMasterBidangEntity.class);
			entityClasses.add(SipdMasterBidangEntity.class);
			entityClasses.add(DataMasterProgramEntity.class);
			entityClasses.add(SipdMasterProgramEntity.class);
			entityClasses.add(DataMasterKegiatanEntity.class);
			entityClasses.add(SipdMasterKegiatanEntity.class);
			entityClasses.add(DataMasterSubkegiatanEntity.class);
			entityClasses.add(SipdMasterSubkegiatanEntity.class);

			entityClasses.add(DataMasterOrganisasiEntity.class);
			entityClasses.add(LogsMasterOrganisasiEntity.class);
			entityClasses.add(SipdMasterOrganisasiEntity.class);

			entityClasses = entityClasses.stream().filter(entityClass -> entityClass.isAnnotationPresent(Table.class)).toList();
		}
		return entityClasses;
	}

	private static String type(Field field) {
		Column column = field.getAnnotation(Column.class);
		if (List.of(Long.class, long.class).contains(field.getType())) return "bigint";
		if (List.of(Integer.class, int.class).contains(field.getType())) return "int";
		if (List.of(Short.class, short.class).contains(field.getType())) return "smallint";
		if (List.of(Byte.class, byte.class, Gender.class, JabatanStatus.class).contains(field.getType())) return "tinyint";
		if (List.of(Boolean.class, boolean.class).contains(field.getType())) return "bit";
		if (List.of(Double.class, double.class).contains(field.getType())) return "double";
		if (List.of(Float.class, float.class).contains(field.getType())) return "float";
		if (field.getType() == LocalDate.class) return "date";
		if (field.getType() == LocalDateTime.class) return "datetime";
		if (field.getType() == BigDecimal.class) return "decimal(38, 2)";
		if (List.of(Character.class, char.class, Pangkat.class).contains(field.getType())) return "char(" + column.length() + ")";
		if (List.of(String.class).contains(field.getType())) return "varchar(" + column.length() + ")";
		throw new IllegalArgumentException("Type '" + field.getType().getName() + "' is not supported");
	}

	private static List<Field> fields(Class<?> entityClass) {
		List<String> names = new ArrayList<>();
		List<Field> fields = new ArrayList<>();
		Class<?> currentClass = entityClass;
		while (currentClass != null) {
			for (Field field : currentClass.getDeclaredFields()) {
				if ((field.isAnnotationPresent(Column.class) || field.isAnnotationPresent(JoinColumns.class)) && !names.contains(field.getName())) {
					fields.add(field);
					names.add(field.getName());
				}
			}
			currentClass = currentClass.getSuperclass();
		}
		return fields;
	}

	private static List<Field> fieldsOfColumn(Class<?> entityClass) {
		List<Field> fields = new ArrayList<>();
		for (Field field : fields(entityClass)) if (field.isAnnotationPresent(Column.class)) fields.add(field);
		return sortFieldsOfColumn(fields);
	}

	private static List<Field> fieldsOfJoinColumns(Class<?> entityClass) {
		return fields(entityClass).stream().filter(field -> field.isAnnotationPresent(JoinColumns.class)).toList();
	}

	private static List<Field> fieldsOfCheck(Class<?> entityClass) {
		return fields(entityClass).stream().filter(field -> field.isAnnotationPresent(Check.class)).toList();
	}

	private static List<Field> sortFieldsOfColumn(List<Field> fields) {
		Map<Field, Integer> indexes = new HashMap<>();
		for (int i = 0; i < fields.size(); i++) {
			int index = i + 1;
			Column column = fields.get(i).getAnnotation(Column.class);
			if (column.name().equals("id")) index = 0;
			else if (column.name().contains("locked")) index = 1000 + i;
			else if (column.name().contains("created")) index = 2000 + i;
			else if (column.name().contains("updated")) index = 2000 + i;
			else if (column.name().contains("deleted")) index = 2000 + i;
			else if (column.name().contains("logged")) index = 3000 + i;
			else if (column.name().endsWith("_id")) index = 9000 + i;
			indexes.put(fields.get(i), index);
		}
		fields.sort(Comparator.comparing(indexes::get));
		return fields;
	}

	private static String check(Table table, Check check, int index) {
		String name = "ck" + "_" + table.name();
		name = name.length() < 61 ? name : name.substring(0, 61);
		name = name + "_" + String.format("%02d", index);
		return String.join(" ", "constraint", name, "check", "(" + check.constraints() + ")");
	}

	private static String foreignKey(Table table, JoinColumns joinColumns, int index, Field field) {
		String name = "fk" + "_" + table.name();
		name = name.length() < 61 ? name : name.substring(0, 61);
		name = name + "_" + String.format("%02d", index);
		List<String> fromColumns = new ArrayList<>();
		List<String> intoColumns = new ArrayList<>();
		for (JoinColumn joinColumn : joinColumns.value()) {
			fromColumns.add(joinColumn.name());
			intoColumns.add(joinColumn.referencedColumnName());
		}
		return String.join(" ", "constraint", name, "foreign key", "(" + String.join(", ", fromColumns) + ")", "references", field.getType().getAnnotation(Table.class).name(), "(" + String.join(", ", intoColumns) + ")");
	}

	private static String uniqueKey(Table table, UniqueConstraint unique, int index) {
		String name = "uk" + "_" + table.name();
		name = name.length() < 61 ? name : name.substring(0, 61);
		name = name + "_" + String.format("%02d", index);
		return String.join(" ", "constraint", name, "unique key", "(" + String.join(", ", unique.columnNames()) + ")");
	}

	private static List<String> rowsOfColumn(Class<?> entityClass) {
		List<String> rows = new ArrayList<>();
		List<String> colNames = new ArrayList<>();
		List<String> colTypes = new ArrayList<>();
		List<String> colAttrs = new ArrayList<>();

		int maxNames = 0;
		int maxTypes = 0;

		for (Field field : fieldsOfColumn(entityClass)) {
			Column column = field.getAnnotation(Column.class);

			String name = column.name();
			colNames.add(name);
			maxNames = Math.max(maxNames, name.length());

			String type = type(field);
			colTypes.add(type);
			maxTypes = Math.max(maxTypes, type.length());

			boolean nullable = column.nullable();
			boolean increment = false;
			if ((field.getType() == Long.class || field.getType() == long.class) && field.isAnnotationPresent(GeneratedValue.class)) {
				GeneratedValue value = field.getAnnotation(GeneratedValue.class);
				if (value.strategy() == GenerationType.IDENTITY) increment = true;
			}
			colAttrs.add((nullable ? "null" : "not null") + (increment ? " auto_increment" : ""));
		}

		for (int i = 0; i < colNames.size(); i++) {
			List<String> row = new ArrayList<>();

			String colName = colNames.get(i);
			row.add(colName + " ".repeat(maxNames - colName.length()));

			String colType = colTypes.get(i);
			row.add(colType + " ".repeat(maxTypes - colType.length()));

			String colAttr = colAttrs.get(i);
			row.add(colAttr);

			rows.add(String.join(" ", row));
		}
		return rows;
	}

	private static List<String> rowsOfUnique(Class<?> entityClass) {
		List<String> rows = new ArrayList<>();

		Table table = entityClass.getAnnotation(Table.class);
		for (UniqueConstraint unique : table.uniqueConstraints()) rows.add(uniqueKey(table, unique, rows.size() + 1));

		return rows;
	}

	private static List<String> rowsOfForeignKey(Class<?> entityClass) {
		List<String> rows = new ArrayList<>();
		Table table = entityClass.getAnnotation(Table.class);
		for (Field field : fieldsOfJoinColumns(entityClass)) {
			JoinColumns joinColumns = field.getAnnotation(JoinColumns.class);
			rows.add(foreignKey(table, joinColumns, rows.size() + 1, field));
		}
		return rows;
	}

	private static List<String> rowsOfCheck(Class<?> entityClass) {
		Table table = entityClass.getAnnotation(Table.class);
		List<String> rows = new ArrayList<>();
		if (entityClass.isAnnotationPresent(Checks.class)) {
			Checks checks = entityClass.getAnnotation(Checks.class);
			for (Check check : checks.value()) rows.add(check(table, check, rows.size() + 1));
		}
		for (Field field : fieldsOfCheck(entityClass)) {
			Check check = field.getAnnotation(Check.class);
			rows.add(check(table, check, rows.size() + 1));
		}
		return rows;
	}

	@SneakyThrows
	private static String generateDDL(Class<?> entityClass) {
		List<String> ddl = new ArrayList<>();

		Table table = entityClass.getAnnotation(Table.class);

		ddl.add("drop table if exists " + table.name() + ";");
		ddl.add("");
		ddl.add("create or replace table " + table.name() + " (");
		for (String row : rowsOfColumn(entityClass)) ddl.add("\t" + row + ",");
		for (String row : rowsOfCheck(entityClass)) ddl.add("\t" + row + ",");
		for (String row : rowsOfForeignKey(entityClass)) ddl.add("\t" + row + ",");
		for (String row : rowsOfUnique(entityClass)) ddl.add("\t" + row + ",");
		ddl.add("\t" + "primary key (id)");
		ddl.add(") engine = innodb");
		ddl.add("  charset = utf8mb4");
		ddl.add("  collate = utf8mb4_unicode_ci;");
		return String.join(System.lineSeparator(), ddl);
	}

	public static List<String> generateDDLs() {
		List<String> ddl = new ArrayList<>();
		for (Class<?> entityClass : entityClasses()) ddl.add(generateDDL(entityClass));
		return ddl;
	}

	@SneakyThrows
	public static void generateDDLsToFile(File directory) {
		if (directory.exists() || directory.mkdirs()) {
			List<Class<?>> classes = entityClasses();
			for (int i = 0; i < classes.size(); i++) {
				Class<?> entityClass = classes.get(i);
				String ddl = generateDDL(entityClass);

				String fileName = String.format("%03d", i + 1) + "-" + entityClass.getAnnotation(Table.class).name() + ".sql";
				File file = new File(directory, fileName);
				try (FileOutputStream fos = new FileOutputStream(file)) {
					fos.write(ddl.getBytes());
				}
			}
		}
	}

}
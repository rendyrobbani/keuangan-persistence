package com.rendyrobbani.keuangan.persistence.generator;

import com.rendyrobbani.keuangan.core.domain.vo.Gender;
import com.rendyrobbani.keuangan.core.domain.vo.Pangkat;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.subkegiatan.DataMasterSubkegiatanEntity;
import com.rendyrobbani.keuangan.persistence.entity.user.LogsUserEntity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;

import java.io.File;
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

//			entityClasses.add(DataUserEntity.class);
//			entityClasses.add(LogsUserEntity.class);
//
//			entityClasses.add(DataMasterFungsiEntity.class);
//			entityClasses.add(DataMasterSubfungsiEntity.class);
//
//			entityClasses.add(DataMasterUrusanEntity.class);
//			entityClasses.add(SipdMasterUrusanEntity.class);
//			entityClasses.add(DataMasterBidangEntity.class);
//			entityClasses.add(SipdMasterBidangEntity.class);
//			entityClasses.add(DataMasterProgramEntity.class);
//			entityClasses.add(SipdMasterProgramEntity.class);
//			entityClasses.add(DataMasterKegiatanEntity.class);
//			entityClasses.add(SipdMasterKegiatanEntity.class);
			entityClasses.add(DataMasterSubkegiatanEntity.class);
//			entityClasses.add(SipdMasterSubkegiatanEntity.class);

			entityClasses = entityClasses.stream().filter(entityClass -> entityClass.isAnnotationPresent(Table.class)).toList();
		}
		return entityClasses;
	}

	private static String type(Field field) {
		Column column = field.getAnnotation(Column.class);
		if (List.of(Long.class, long.class).contains(field.getType())) return "bigint";
		if (List.of(Integer.class, int.class).contains(field.getType())) return "int";
		if (List.of(Short.class, short.class).contains(field.getType())) return "smallint";
		if (List.of(Byte.class, byte.class).contains(field.getType())) return "tinyint";
		if (List.of(Boolean.class, boolean.class).contains(field.getType())) return "bit";
		if (List.of(Double.class, double.class).contains(field.getType())) return "double";
		if (List.of(Float.class, float.class).contains(field.getType())) return "float";
		if (field.getType() == LocalDate.class) return "date";
		if (field.getType() == LocalDateTime.class) return "datetime";
		if (field.getType() == BigDecimal.class) return "decimal(38, 2)";
		if (List.of(Character.class, char.class, Pangkat.class).contains(field.getType())) return "char(" + column.length() + ")";
		if (List.of(String.class, Gender.class).contains(field.getType())) return "varchar(" + column.length() + ")";
		throw new IllegalArgumentException("Type '" + field.getType().getName() + "' is not supported");
	}

	private static List<Field> sortFields(List<Field> fields) {
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

	private static List<Field> fields(Class<?> entityClass) {
		List<String> names = new ArrayList<>();
		List<Field> fields = new ArrayList<>();
		Class<?> currentClass = entityClass;
		while (currentClass != null) {
			for (Field field : currentClass.getDeclaredFields()) {
				if (field.isAnnotationPresent(Column.class) && !names.contains(field.getName())) {
					fields.add(field);
					names.add(field.getName());
				}
			}
			currentClass = currentClass.getSuperclass();
		}
		return sortFields(fields);
	}

	private static List<String> rowsOfColumn(Class<?> entityClass) {
		List<String> rows = new ArrayList<>();
		List<String> colNames = new ArrayList<>();
		List<String> colTypes = new ArrayList<>();
		List<String> colAttrs = new ArrayList<>();

		int maxNames = 0;
		int maxTypes = 0;

		for (Field field : fields(entityClass)) {
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

	@SneakyThrows
	public static String generateDDL(Class<?> entityClass) {
		List<String> ddl = new ArrayList<>();

		Table table = entityClass.getAnnotation(Table.class);
		List<String> rowsOfColumn = rowsOfColumn(entityClass);

		ddl.add("drop table if exists " + table.name() + ";");
		ddl.add("");
		ddl.add("create or replace table " + table.name() + " (");
		for (String row : rowsOfColumn) {
			boolean endsWithComma = false;
			ddl.add("\t" + row);
		}
		ddl.add("\t" + "primary key (id)");
		ddl.add(") engine = innodb");
		ddl.add("  charset = utf8mb4");
		ddl.add("  collate = utf8mb4_unicode_ci;");
		return String.join(System.lineSeparator(), ddl);
	}

	@SneakyThrows
	public static void generateDDLToFile(File directory) {
		for (Class<?> entityClass : entityClasses()) {
			String ddl = generateDDL(entityClass);
			System.out.println(ddl);
		}
	}

}
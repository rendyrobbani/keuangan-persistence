package com.rendyrobbani.keuangan.persistence.migration;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record Column(String name,
                     String type,
                     boolean isPrimaryKey) {

	public Class<?> clazz() {
		String type = this.type;
		if (type.contains("(")) type = type.substring(0, type.indexOf("("));
		return switch (type) {
			case "bigint" -> Long.class;
			case "int" -> Integer.class;
			case "smallint" -> Short.class;
			case "tinyint" -> Byte.class;
			case "bit" -> Boolean.class;
			case "double" -> Double.class;
			case "float" -> Float.class;
			case "date" -> LocalDate.class;
			case "datetime" -> LocalDateTime.class;
			case "decimal" -> BigDecimal.class;
			case "char", "varchar" -> String.class;
			default -> throw new RuntimeException("Invalid type: " + type);
		};
	}

}
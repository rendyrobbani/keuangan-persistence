package com.rendyrobbani.keuangan.persistence.migration;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class Columns {

	private static Map<String, List<Column>> columns;

	@SneakyThrows
	public static List<Column> columns(String tableName) {
		if (columns == null) columns = new HashMap<>();
		if (!columns.containsKey(tableName)) {
			try (Statement statement = ConnectionConfig.connection().createStatement()) {
				try (ResultSet rs = statement.executeQuery("show columns from " + tableName)) {
					List<Column> data = new ArrayList<>();
					while (rs.next()) data.add(new Column(rs.getString("Field"),
					                                      rs.getString("Type"),
					                                      rs.getString("Key").equals("PRI")));
					columns.put(tableName, data);
				}
			}
		}
		return columns.getOrDefault(tableName, null);
	}

}
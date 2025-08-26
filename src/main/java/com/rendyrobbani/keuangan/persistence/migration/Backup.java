package com.rendyrobbani.keuangan.persistence.migration;

import com.rendyrobbani.keuangan.persistence.generator.DDLGenerator;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;

import java.io.File;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class Backup {

	@SneakyThrows
	public static void backup() {
		try (Statement statement = ConnectionConfig.connection().createStatement()) {
			for (String tableName : DDLGenerator.tableNames()) {
				List<Column> columns = Columns.columns(tableName);
				try (ResultSet rs = statement.executeQuery("select * from " + tableName)) {
					ResultSetMetaData rsmd = rs.getMetaData();
					int columnCount = rsmd.getColumnCount();

					List<Map<String, Object>> rows = new ArrayList<>();

					while (rs.next()) {
						Map<String, Object> row = new HashMap<>();
						for (int i = 1; i <= columnCount; i++) {
							row.put(rsmd.getColumnLabel(i), rs.getObject(i));
						}
						rows.add(row);
					}

					File file = new File("C:\\Users\\rendy\\Downloads\\test.json");
					ObjectMapperConfig.objectMapper().writerWithDefaultPrettyPrinter().writeValue(file, rows);
					return;
				}
			}
		}
	}

}
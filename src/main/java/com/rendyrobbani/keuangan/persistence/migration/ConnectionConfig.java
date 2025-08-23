package com.rendyrobbani.keuangan.persistence.migration;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ConnectionConfig {

	private static Connection connection;

	@SneakyThrows
	public static Connection connection() {
		if (connection == null) {
			try (var inputStream = ConnectionConfig.class.getResourceAsStream("/application.properties")) {
				Properties properties = new Properties();
				properties.load(inputStream);
				connection = DriverManager.getConnection(properties.getProperty("spring.datasource.url"), properties.getProperty("spring.datasource.username"), properties.getProperty("spring.datasource.password"));
			}
		}
		return connection;
	}

}
package com.rendyrobbani.keuangan.persistence.migration;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ObjectMapperConfig {

	private static ObjectMapper objectMapper;

	public static ObjectMapper objectMapper() {
		if (objectMapper == null) objectMapper = new ObjectMapper();
		return objectMapper;
	}

}
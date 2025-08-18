package com.rendyrobbani.keuangan.persistence.converter;

import com.rendyrobbani.keuangan.core.domain.vo.Pangkat;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class PangkatConverter implements AttributeConverter<Pangkat, String> {

	@Override
	public String convertToDatabaseColumn(Pangkat pangkat) {
		if (pangkat != null) return pangkat.value();
		return null;
	}

	@Override
	public Pangkat convertToEntityAttribute(String value) {
		return Pangkat.fromValue(value);
	}

}
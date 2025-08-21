package com.rendyrobbani.keuangan.persistence.converter;

import com.rendyrobbani.keuangan.core.domain.vo.KomponenType;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class KomponenTypeConverter implements AttributeConverter<KomponenType, Byte> {

	@Override
	public Byte convertToDatabaseColumn(KomponenType type) {
		if (type != null) return type.value();
		return null;
	}

	@Override
	public KomponenType convertToEntityAttribute(Byte value) {
		return KomponenType.fromValue(value);
	}

}
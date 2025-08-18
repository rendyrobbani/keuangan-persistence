package com.rendyrobbani.keuangan.persistence.converter;

import com.rendyrobbani.keuangan.core.domain.vo.Gender;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class GenderConverter implements AttributeConverter<Gender, Byte> {

	@Override
	public Byte convertToDatabaseColumn(Gender gender) {
		if (gender != null) return gender.value();
		return null;
	}

	@Override
	public Gender convertToEntityAttribute(Byte value) {
		return Gender.fromValue(value);
	}

}
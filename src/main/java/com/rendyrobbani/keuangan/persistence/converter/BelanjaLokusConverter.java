package com.rendyrobbani.keuangan.persistence.converter;

import com.rendyrobbani.keuangan.core.domain.vo.BelanjaLokus;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class BelanjaLokusConverter implements AttributeConverter<BelanjaLokus, String> {

	@Override
	public String convertToDatabaseColumn(BelanjaLokus lokus) {
		if (lokus != null) return lokus.value();
		return null;
	}

	@Override
	public BelanjaLokus convertToEntityAttribute(String value) {
		return BelanjaLokus.fromValue(value);
	}

}
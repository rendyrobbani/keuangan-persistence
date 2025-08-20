package com.rendyrobbani.keuangan.persistence.converter;

import com.rendyrobbani.keuangan.core.domain.vo.BelanjaJenis;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class BelanjaJenisConverter implements AttributeConverter<BelanjaJenis, String> {

	@Override
	public String convertToDatabaseColumn(BelanjaJenis jenis) {
		if (jenis != null) return jenis.value();
		return null;
	}

	@Override
	public BelanjaJenis convertToEntityAttribute(String value) {
		return BelanjaJenis.fromValue(value);
	}

}
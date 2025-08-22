package com.rendyrobbani.keuangan.persistence.converter;

import com.rendyrobbani.keuangan.core.domain.vo.PenerimaJenis;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class PenerimaJenisConverter implements AttributeConverter<PenerimaJenis, Byte> {

	@Override
	public Byte convertToDatabaseColumn(PenerimaJenis jenis) {
		if (jenis != null) return jenis.value();
		return null;
	}

	@Override
	public PenerimaJenis convertToEntityAttribute(Byte value) {
		return PenerimaJenis.fromValue(value);
	}

}
package com.rendyrobbani.keuangan.persistence.converter;

import com.rendyrobbani.keuangan.core.domain.vo.JabatanStatus;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class JabatanStatusConverter implements AttributeConverter<JabatanStatus, Byte> {

	@Override
	public Byte convertToDatabaseColumn(JabatanStatus status) {
		if (status != null) return status.value();
		return null;
	}

	@Override
	public JabatanStatus convertToEntityAttribute(Byte value) {
		return JabatanStatus.fromValue(value);
	}

}
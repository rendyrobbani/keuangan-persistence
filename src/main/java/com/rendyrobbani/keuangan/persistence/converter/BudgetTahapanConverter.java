package com.rendyrobbani.keuangan.persistence.converter;

import com.rendyrobbani.keuangan.core.domain.vo.BudgetTahapan;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class BudgetTahapanConverter implements AttributeConverter<BudgetTahapan, Long> {

	@Override
	public Long convertToDatabaseColumn(BudgetTahapan tahapan) {
		if (tahapan != null) return tahapan.id();
		return null;
	}

	@Override
	public BudgetTahapan convertToEntityAttribute(Long value) {
		return BudgetTahapan.fromId(value);
	}

}
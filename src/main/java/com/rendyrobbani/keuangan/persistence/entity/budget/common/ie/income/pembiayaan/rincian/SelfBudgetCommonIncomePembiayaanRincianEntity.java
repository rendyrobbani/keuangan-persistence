package com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.income.pembiayaan.rincian;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.income.pembiayaan.rincian.SelfBudgetCommonIncomePembiayaanRincian;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.experimental.Accessors;

@Data
@Setter(AccessLevel.NONE)
@Accessors(fluent = true)
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = SelfBudgetCommonIncomePembiayaanRincian.TABLE_NAME)
public class SelfBudgetCommonIncomePembiayaanRincianEntity extends AbstractSelfBudgetCommonIncomePembiayaanRincianEntity {

	@Override
	public SelfBudgetCommonIncomePembiayaanRincianEntity toDomain() {
		return this;
	}

}
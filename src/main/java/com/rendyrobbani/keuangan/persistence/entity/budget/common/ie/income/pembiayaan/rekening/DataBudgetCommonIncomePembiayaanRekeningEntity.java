package com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.income.pembiayaan.rekening;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.DataBudgetCommonRekeningEntity;
import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.income.pembiayaan.rekening.DataBudgetCommonIncomePembiayaanRekening;
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
@Table(name = DataBudgetCommonIncomePembiayaanRekening.TABLE_NAME)
public class DataBudgetCommonIncomePembiayaanRekeningEntity extends AbstractDataBudgetCommonIncomePembiayaanRekeningEntity {

	@Override
	public DataBudgetCommonIncomePembiayaanRekeningEntity toDomain() {
		return this;
	}

}
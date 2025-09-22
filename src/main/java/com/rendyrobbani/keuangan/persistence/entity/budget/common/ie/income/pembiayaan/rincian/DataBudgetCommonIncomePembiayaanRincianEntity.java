package com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.income.pembiayaan.rincian;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.income.pembiayaan.rincian.DataBudgetCommonIncomePembiayaanRincian;
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
@Table(name = DataBudgetCommonIncomePembiayaanRincian.TABLE_NAME)
public class DataBudgetCommonIncomePembiayaanRincianEntity extends AbstractDataBudgetCommonIncomePembiayaanRincianEntity {

	@Override
	public DataBudgetCommonIncomePembiayaanRincianEntity toDomain() {
		return this;
	}

}
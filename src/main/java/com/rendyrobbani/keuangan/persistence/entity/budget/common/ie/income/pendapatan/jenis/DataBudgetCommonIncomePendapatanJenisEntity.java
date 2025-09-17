package com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.income.pendapatan.jenis;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.DataBudgetCommonJenisEntity;
import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.income.pendapatan.jenis.DataBudgetCommonIncomePendapatanJenis;
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
@Table(name = DataBudgetCommonIncomePendapatanJenis.TABLE_NAME)
public class DataBudgetCommonIncomePendapatanJenisEntity extends AbstractDataBudgetCommonIncomePendapatanJenisEntity {

	@Override
	public DataBudgetCommonJenisEntity toDomain() {
		return this;
	}

}
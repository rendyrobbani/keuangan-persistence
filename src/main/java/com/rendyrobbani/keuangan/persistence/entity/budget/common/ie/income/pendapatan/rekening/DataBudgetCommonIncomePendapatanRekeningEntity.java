package com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.income.pendapatan.rekening;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.DataBudgetCommonRekeningEntity;
import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.income.pendapatan.rekening.DataBudgetCommonIncomePendapatanRekening;
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
@Table(name = DataBudgetCommonIncomePendapatanRekening.TABLE_NAME)
public class DataBudgetCommonIncomePendapatanRekeningEntity extends AbstractDataBudgetCommonIncomePendapatanRekeningEntity {

	@Override
	public DataBudgetCommonIncomePendapatanRekeningEntity toDomain() {
		return this;
	}

}
package com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.income.pendapatan.rincian;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.income.pendapatan.rincian.SelfBudgetCommonIncomePendapatanRincian;
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
@Table(name = SelfBudgetCommonIncomePendapatanRincian.TABLE_NAME)
public class SelfBudgetCommonIncomePendapatanRincianEntity extends AbstractSelfBudgetCommonIncomePendapatanRincianEntity {

	@Override
	public SelfBudgetCommonIncomePendapatanRincianEntity toDomain() {
		return this;
	}

}
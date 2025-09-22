package com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.income.pendapatan.bidang;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.DataBudgetCommonBidangEntity;
import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.income.pendapatan.bidang.DataBudgetCommonIncomePendapatanBidang;
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
@Table(name = DataBudgetCommonIncomePendapatanBidang.TABLE_NAME)
public class DataBudgetCommonIncomePendapatanBidangEntity extends AbstractDataBudgetCommonIncomePendapatanBidangEntity {

	@Override
	public DataBudgetCommonIncomePendapatanBidangEntity toDomain() {
		return this;
	}

}
package com.rendyrobbani.keuangan.persistence.repository.budget.common.ie.income.pendapatan.bidang;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.income.pendapatan.bidang.DataBudgetCommonIncomePendapatanBidang;
import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.income.pendapatan.jenis.DataBudgetCommonIncomePendapatanJenis;
import com.rendyrobbani.keuangan.core.domain.repository.budget.common.ie.income.pendapatan.bidang.DataBudgetCommonIncomePendapatanBidangRepository;
import com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.income.pendapatan.bidang.DataBudgetCommonIncomePendapatanBidangEntity;
import com.rendyrobbani.keuangan.persistence.repository.budget.common.ie.AbstractDataBudgetCommonBidangRepository;
import com.rendyrobbani.keuangan.persistence.repository.budget.common.ie.DataBudgetCommonBidangJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataBudgetCommonIncomePendapatanBidangRepositoryImpl extends AbstractDataBudgetCommonBidangRepository<DataBudgetCommonIncomePendapatanBidangEntity, DataBudgetCommonIncomePendapatanBidang> implements DataBudgetCommonIncomePendapatanBidangRepository {

	private final DataBudgetCommonIncomePendapatanBidangJpaRepository repository;

	@Override
	protected String tableSource() {
		return DataBudgetCommonIncomePendapatanJenis.TABLE_NAME;
	}

	@Override
	protected DataBudgetCommonBidangJpaRepository<DataBudgetCommonIncomePendapatanBidangEntity, DataBudgetCommonIncomePendapatanBidang> repositoryOfBudgetBidang() {
		return this.repository;
	}

}
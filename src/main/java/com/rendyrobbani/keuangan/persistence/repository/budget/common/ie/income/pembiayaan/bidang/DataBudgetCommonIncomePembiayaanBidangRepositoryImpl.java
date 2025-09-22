package com.rendyrobbani.keuangan.persistence.repository.budget.common.ie.income.pembiayaan.bidang;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.income.pembiayaan.bidang.DataBudgetCommonIncomePembiayaanBidang;
import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.income.pembiayaan.jenis.DataBudgetCommonIncomePembiayaanJenis;
import com.rendyrobbani.keuangan.core.domain.repository.budget.common.ie.income.pembiayaan.bidang.DataBudgetCommonIncomePembiayaanBidangRepository;
import com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.income.pembiayaan.bidang.DataBudgetCommonIncomePembiayaanBidangEntity;
import com.rendyrobbani.keuangan.persistence.repository.budget.common.ie.AbstractDataBudgetCommonBidangRepository;
import com.rendyrobbani.keuangan.persistence.repository.budget.common.ie.DataBudgetCommonBidangJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataBudgetCommonIncomePembiayaanBidangRepositoryImpl extends AbstractDataBudgetCommonBidangRepository<DataBudgetCommonIncomePembiayaanBidangEntity, DataBudgetCommonIncomePembiayaanBidang> implements DataBudgetCommonIncomePembiayaanBidangRepository {

	private final DataBudgetCommonIncomePembiayaanBidangJpaRepository repository;

	@Override
	protected String tableSource() {
		return DataBudgetCommonIncomePembiayaanJenis.TABLE_NAME;
	}

	@Override
	protected DataBudgetCommonBidangJpaRepository<DataBudgetCommonIncomePembiayaanBidangEntity, DataBudgetCommonIncomePembiayaanBidang> repositoryOfBudgetBidang() {
		return this.repository;
	}

}
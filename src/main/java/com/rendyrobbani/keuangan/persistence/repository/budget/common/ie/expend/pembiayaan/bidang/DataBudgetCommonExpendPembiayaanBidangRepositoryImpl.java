package com.rendyrobbani.keuangan.persistence.repository.budget.common.ie.expend.pembiayaan.bidang;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.expend.pembiayaan.bidang.DataBudgetCommonExpendPembiayaanBidang;
import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.expend.pembiayaan.jenis.DataBudgetCommonExpendPembiayaanJenis;
import com.rendyrobbani.keuangan.core.domain.repository.budget.common.ie.expend.pembiayaan.bidang.DataBudgetCommonExpendPembiayaanBidangRepository;
import com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.expend.pembiayaan.bidang.DataBudgetCommonExpendPembiayaanBidangEntity;
import com.rendyrobbani.keuangan.persistence.repository.budget.common.ie.AbstractDataBudgetCommonBidangRepository;
import com.rendyrobbani.keuangan.persistence.repository.budget.common.ie.DataBudgetCommonBidangJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataBudgetCommonExpendPembiayaanBidangRepositoryImpl extends AbstractDataBudgetCommonBidangRepository<DataBudgetCommonExpendPembiayaanBidangEntity, DataBudgetCommonExpendPembiayaanBidang> implements DataBudgetCommonExpendPembiayaanBidangRepository {

	private final DataBudgetCommonExpendPembiayaanBidangJpaRepository repository;

	@Override
	protected String tableSource() {
		return DataBudgetCommonExpendPembiayaanJenis.TABLE_NAME;
	}

	@Override
	protected DataBudgetCommonBidangJpaRepository<DataBudgetCommonExpendPembiayaanBidangEntity, DataBudgetCommonExpendPembiayaanBidang> repositoryOfBudgetBidang() {
		return this.repository;
	}

}
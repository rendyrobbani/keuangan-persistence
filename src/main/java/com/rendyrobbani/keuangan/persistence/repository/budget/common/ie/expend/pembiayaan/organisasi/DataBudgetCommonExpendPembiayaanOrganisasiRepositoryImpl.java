package com.rendyrobbani.keuangan.persistence.repository.budget.common.ie.expend.pembiayaan.organisasi;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.expend.pembiayaan.bidang.DataBudgetCommonExpendPembiayaanBidang;
import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.expend.pembiayaan.organisasi.DataBudgetCommonExpendPembiayaanOrganisasi;
import com.rendyrobbani.keuangan.core.domain.repository.budget.common.ie.expend.pembiayaan.organisasi.DataBudgetCommonExpendPembiayaanOrganisasiRepository;
import com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.expend.pembiayaan.organisasi.DataBudgetCommonExpendPembiayaanOrganisasiEntity;
import com.rendyrobbani.keuangan.persistence.repository.budget.common.ie.AbstractDataBudgetCommonOrganisasiRepository;
import com.rendyrobbani.keuangan.persistence.repository.budget.common.ie.DataBudgetCommonOrganisasiJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataBudgetCommonExpendPembiayaanOrganisasiRepositoryImpl extends AbstractDataBudgetCommonOrganisasiRepository<DataBudgetCommonExpendPembiayaanOrganisasiEntity, DataBudgetCommonExpendPembiayaanOrganisasi> implements DataBudgetCommonExpendPembiayaanOrganisasiRepository {

	private final DataBudgetCommonExpendPembiayaanOrganisasiJpaRepository repository;

	@Override
	protected String tableSource() {
		return DataBudgetCommonExpendPembiayaanBidang.TABLE_NAME;
	}

	@Override
	protected DataBudgetCommonOrganisasiJpaRepository<DataBudgetCommonExpendPembiayaanOrganisasiEntity, DataBudgetCommonExpendPembiayaanOrganisasi> repositoryOfBudgetOrganisasi() {
		return this.repository;
	}

}
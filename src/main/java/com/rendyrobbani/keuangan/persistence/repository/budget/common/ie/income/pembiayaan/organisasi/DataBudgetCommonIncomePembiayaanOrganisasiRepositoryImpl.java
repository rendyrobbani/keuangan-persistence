package com.rendyrobbani.keuangan.persistence.repository.budget.common.ie.income.pembiayaan.organisasi;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.income.pembiayaan.bidang.DataBudgetCommonIncomePembiayaanBidang;
import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.income.pembiayaan.organisasi.DataBudgetCommonIncomePembiayaanOrganisasi;
import com.rendyrobbani.keuangan.core.domain.repository.budget.common.ie.income.pembiayaan.organisasi.DataBudgetCommonIncomePembiayaanOrganisasiRepository;
import com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.income.pembiayaan.organisasi.DataBudgetCommonIncomePembiayaanOrganisasiEntity;
import com.rendyrobbani.keuangan.persistence.repository.budget.common.ie.AbstractDataBudgetCommonOrganisasiRepository;
import com.rendyrobbani.keuangan.persistence.repository.budget.common.ie.DataBudgetCommonOrganisasiJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataBudgetCommonIncomePembiayaanOrganisasiRepositoryImpl extends AbstractDataBudgetCommonOrganisasiRepository<DataBudgetCommonIncomePembiayaanOrganisasiEntity, DataBudgetCommonIncomePembiayaanOrganisasi> implements DataBudgetCommonIncomePembiayaanOrganisasiRepository {

	private final DataBudgetCommonIncomePembiayaanOrganisasiJpaRepository repository;

	@Override
	protected String tableSource() {
		return DataBudgetCommonIncomePembiayaanBidang.TABLE_NAME;
	}

	@Override
	protected DataBudgetCommonOrganisasiJpaRepository<DataBudgetCommonIncomePembiayaanOrganisasiEntity, DataBudgetCommonIncomePembiayaanOrganisasi> repositoryOfBudgetOrganisasi() {
		return this.repository;
	}

}
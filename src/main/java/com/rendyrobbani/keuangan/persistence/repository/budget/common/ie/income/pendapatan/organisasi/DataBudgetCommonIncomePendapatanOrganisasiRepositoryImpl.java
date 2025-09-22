package com.rendyrobbani.keuangan.persistence.repository.budget.common.ie.income.pendapatan.organisasi;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.income.pendapatan.bidang.DataBudgetCommonIncomePendapatanBidang;
import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.income.pendapatan.organisasi.DataBudgetCommonIncomePendapatanOrganisasi;
import com.rendyrobbani.keuangan.core.domain.repository.budget.common.ie.income.pendapatan.organisasi.DataBudgetCommonIncomePendapatanOrganisasiRepository;
import com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.income.pendapatan.organisasi.DataBudgetCommonIncomePendapatanOrganisasiEntity;
import com.rendyrobbani.keuangan.persistence.repository.budget.common.ie.AbstractDataBudgetCommonOrganisasiRepository;
import com.rendyrobbani.keuangan.persistence.repository.budget.common.ie.DataBudgetCommonOrganisasiJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataBudgetCommonIncomePendapatanOrganisasiRepositoryImpl extends AbstractDataBudgetCommonOrganisasiRepository<DataBudgetCommonIncomePendapatanOrganisasiEntity, DataBudgetCommonIncomePendapatanOrganisasi> implements DataBudgetCommonIncomePendapatanOrganisasiRepository {

	private final DataBudgetCommonIncomePendapatanOrganisasiJpaRepository repository;

	@Override
	protected String tableSource() {
		return DataBudgetCommonIncomePendapatanBidang.TABLE_NAME;
	}

	@Override
	protected DataBudgetCommonOrganisasiJpaRepository<DataBudgetCommonIncomePendapatanOrganisasiEntity, DataBudgetCommonIncomePendapatanOrganisasi> repositoryOfBudgetOrganisasi() {
		return this.repository;
	}

}
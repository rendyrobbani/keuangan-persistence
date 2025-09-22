package com.rendyrobbani.keuangan.persistence.repository.budget.common.ie.income.pendapatan.jenis;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.income.pendapatan.jenis.DataBudgetCommonIncomePendapatanJenis;
import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.income.pendapatan.rekening.DataBudgetCommonIncomePendapatanRekening;
import com.rendyrobbani.keuangan.core.domain.repository.budget.common.ie.income.pendapatan.jenis.DataBudgetCommonIncomePendapatanJenisRepository;
import com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.income.pendapatan.jenis.DataBudgetCommonIncomePendapatanJenisEntity;
import com.rendyrobbani.keuangan.persistence.repository.budget.common.ie.AbstractDataBudgetCommonJenisRepository;
import com.rendyrobbani.keuangan.persistence.repository.budget.common.ie.DataBudgetCommonJenisJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataBudgetCommonIncomePendapatanJenisRepositoryImpl extends AbstractDataBudgetCommonJenisRepository<DataBudgetCommonIncomePendapatanJenisEntity, DataBudgetCommonIncomePendapatanJenis> implements DataBudgetCommonIncomePendapatanJenisRepository {

	private final DataBudgetCommonIncomePendapatanJenisJpaRepository repository;

	@Override
	protected String tableSource() {
		return DataBudgetCommonIncomePendapatanRekening.TABLE_NAME;
	}

	@Override
	protected DataBudgetCommonJenisJpaRepository<DataBudgetCommonIncomePendapatanJenisEntity, DataBudgetCommonIncomePendapatanJenis> repositoryOfBudgetJenis() {
		return this.repository;
	}

}
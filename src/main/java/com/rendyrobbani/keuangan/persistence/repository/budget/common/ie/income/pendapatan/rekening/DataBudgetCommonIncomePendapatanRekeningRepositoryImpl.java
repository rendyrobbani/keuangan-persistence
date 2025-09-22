package com.rendyrobbani.keuangan.persistence.repository.budget.common.ie.income.pendapatan.rekening;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.income.pendapatan.rekening.DataBudgetCommonIncomePendapatanRekening;
import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.income.pendapatan.rincian.DataBudgetCommonIncomePendapatanRincian;
import com.rendyrobbani.keuangan.core.domain.repository.budget.common.ie.income.pendapatan.rekening.DataBudgetCommonIncomePendapatanRekeningRepository;
import com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.income.pendapatan.rekening.DataBudgetCommonIncomePendapatanRekeningEntity;
import com.rendyrobbani.keuangan.persistence.repository.budget.common.ie.AbstractDataBudgetCommonRekeningRepository;
import com.rendyrobbani.keuangan.persistence.repository.budget.common.ie.DataBudgetCommonRekeningJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataBudgetCommonIncomePendapatanRekeningRepositoryImpl extends AbstractDataBudgetCommonRekeningRepository<DataBudgetCommonIncomePendapatanRekeningEntity, DataBudgetCommonIncomePendapatanRekening> implements DataBudgetCommonIncomePendapatanRekeningRepository {

	private final DataBudgetCommonIncomePendapatanRekeningJpaRepository repository;

	@Override
	protected String tableSource() {
		return DataBudgetCommonIncomePendapatanRincian.TABLE_NAME;
	}

	@Override
	protected DataBudgetCommonRekeningJpaRepository<DataBudgetCommonIncomePendapatanRekeningEntity, DataBudgetCommonIncomePendapatanRekening> repositoryOfBudgetRekening() {
		return this.repository;
	}

}
package com.rendyrobbani.keuangan.persistence.repository.budget.common.ie.income.pembiayaan.rekening;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.income.pembiayaan.rekening.DataBudgetCommonIncomePembiayaanRekening;
import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.income.pembiayaan.rincian.DataBudgetCommonIncomePembiayaanRincian;
import com.rendyrobbani.keuangan.core.domain.repository.budget.common.ie.income.pembiayaan.rekening.DataBudgetCommonIncomePembiayaanRekeningRepository;
import com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.income.pembiayaan.rekening.DataBudgetCommonIncomePembiayaanRekeningEntity;
import com.rendyrobbani.keuangan.persistence.repository.budget.common.ie.AbstractDataBudgetCommonRekeningRepository;
import com.rendyrobbani.keuangan.persistence.repository.budget.common.ie.DataBudgetCommonRekeningJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataBudgetCommonIncomePembiayaanRekeningRepositoryImpl extends AbstractDataBudgetCommonRekeningRepository<DataBudgetCommonIncomePembiayaanRekeningEntity, DataBudgetCommonIncomePembiayaanRekening> implements DataBudgetCommonIncomePembiayaanRekeningRepository {

	private final DataBudgetCommonIncomePembiayaanRekeningJpaRepository repository;

	@Override
	protected String tableSource() {
		return DataBudgetCommonIncomePembiayaanRincian.TABLE_NAME;
	}

	@Override
	protected DataBudgetCommonRekeningJpaRepository<DataBudgetCommonIncomePembiayaanRekeningEntity, DataBudgetCommonIncomePembiayaanRekening> repositoryOfBudgetRekening() {
		return this.repository;
	}

}
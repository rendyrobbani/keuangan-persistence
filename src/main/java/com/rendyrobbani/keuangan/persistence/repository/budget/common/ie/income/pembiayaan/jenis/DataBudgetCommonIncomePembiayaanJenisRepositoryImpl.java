package com.rendyrobbani.keuangan.persistence.repository.budget.common.ie.income.pembiayaan.jenis;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.income.pembiayaan.jenis.DataBudgetCommonIncomePembiayaanJenis;
import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.income.pembiayaan.rekening.DataBudgetCommonIncomePembiayaanRekening;
import com.rendyrobbani.keuangan.core.domain.repository.budget.common.ie.income.pembiayaan.jenis.DataBudgetCommonIncomePembiayaanJenisRepository;
import com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.income.pembiayaan.jenis.DataBudgetCommonIncomePembiayaanJenisEntity;
import com.rendyrobbani.keuangan.persistence.repository.budget.common.ie.AbstractDataBudgetCommonJenisRepository;
import com.rendyrobbani.keuangan.persistence.repository.budget.common.ie.DataBudgetCommonJenisJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataBudgetCommonIncomePembiayaanJenisRepositoryImpl extends AbstractDataBudgetCommonJenisRepository<DataBudgetCommonIncomePembiayaanJenisEntity, DataBudgetCommonIncomePembiayaanJenis> implements DataBudgetCommonIncomePembiayaanJenisRepository {

	private final DataBudgetCommonIncomePembiayaanJenisJpaRepository repository;

	@Override
	protected String tableSource() {
		return DataBudgetCommonIncomePembiayaanRekening.TABLE_NAME;
	}

	@Override
	protected DataBudgetCommonJenisJpaRepository<DataBudgetCommonIncomePembiayaanJenisEntity, DataBudgetCommonIncomePembiayaanJenis> repositoryOfBudgetJenis() {
		return this.repository;
	}

}
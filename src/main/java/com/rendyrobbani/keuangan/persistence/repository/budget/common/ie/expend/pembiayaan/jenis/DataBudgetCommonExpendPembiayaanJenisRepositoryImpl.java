package com.rendyrobbani.keuangan.persistence.repository.budget.common.ie.expend.pembiayaan.jenis;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.expend.pembiayaan.jenis.DataBudgetCommonExpendPembiayaanJenis;
import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.expend.pembiayaan.rekening.DataBudgetCommonExpendPembiayaanRekening;
import com.rendyrobbani.keuangan.core.domain.repository.budget.common.ie.expend.pembiayaan.jenis.DataBudgetCommonExpendPembiayaanJenisRepository;
import com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.expend.pembiayaan.jenis.DataBudgetCommonExpendPembiayaanJenisEntity;
import com.rendyrobbani.keuangan.persistence.repository.budget.common.ie.AbstractDataBudgetCommonJenisRepository;
import com.rendyrobbani.keuangan.persistence.repository.budget.common.ie.DataBudgetCommonJenisJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataBudgetCommonExpendPembiayaanJenisRepositoryImpl extends AbstractDataBudgetCommonJenisRepository<DataBudgetCommonExpendPembiayaanJenisEntity, DataBudgetCommonExpendPembiayaanJenis> implements DataBudgetCommonExpendPembiayaanJenisRepository {

	private final DataBudgetCommonExpendPembiayaanJenisJpaRepository repository;

	@Override
	protected String tableSource() {
		return DataBudgetCommonExpendPembiayaanRekening.TABLE_NAME;
	}

	@Override
	protected DataBudgetCommonJenisJpaRepository<DataBudgetCommonExpendPembiayaanJenisEntity, DataBudgetCommonExpendPembiayaanJenis> repositoryOfBudgetJenis() {
		return this.repository;
	}

}
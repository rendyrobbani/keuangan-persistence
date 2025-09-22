package com.rendyrobbani.keuangan.persistence.repository.budget.common.ie.expend.pembiayaan.rekening;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.expend.pembiayaan.rekening.DataBudgetCommonExpendPembiayaanRekening;
import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.expend.pembiayaan.rincian.DataBudgetCommonExpendPembiayaanRincian;
import com.rendyrobbani.keuangan.core.domain.repository.budget.common.ie.expend.pembiayaan.rekening.DataBudgetCommonExpendPembiayaanRekeningRepository;
import com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.expend.pembiayaan.rekening.DataBudgetCommonExpendPembiayaanRekeningEntity;
import com.rendyrobbani.keuangan.persistence.repository.budget.common.ie.AbstractDataBudgetCommonRekeningRepository;
import com.rendyrobbani.keuangan.persistence.repository.budget.common.ie.DataBudgetCommonRekeningJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataBudgetCommonExpendPembiayaanRekeningRepositoryImpl extends AbstractDataBudgetCommonRekeningRepository<DataBudgetCommonExpendPembiayaanRekeningEntity, DataBudgetCommonExpendPembiayaanRekening> implements DataBudgetCommonExpendPembiayaanRekeningRepository {

	private final DataBudgetCommonExpendPembiayaanRekeningJpaRepository repository;

	@Override
	protected String tableSource() {
		return DataBudgetCommonExpendPembiayaanRincian.TABLE_NAME;
	}

	@Override
	protected DataBudgetCommonRekeningJpaRepository<DataBudgetCommonExpendPembiayaanRekeningEntity, DataBudgetCommonExpendPembiayaanRekening> repositoryOfBudgetRekening() {
		return this.repository;
	}

}
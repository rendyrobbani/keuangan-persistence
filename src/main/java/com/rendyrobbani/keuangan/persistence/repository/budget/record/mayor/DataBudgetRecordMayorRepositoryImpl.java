package com.rendyrobbani.keuangan.persistence.repository.budget.record.mayor;

import com.rendyrobbani.keuangan.core.domain.entity.budget.record.mayor.DataBudgetRecordMayor;
import com.rendyrobbani.keuangan.core.domain.entity.master.mayor.DataMasterMayor;
import com.rendyrobbani.keuangan.core.domain.repository.budget.record.mayor.DataBudgetRecordMayorRepository;
import com.rendyrobbani.keuangan.persistence.entity.budget.record.mayor.DataBudgetRecordMayorEntity;
import com.rendyrobbani.keuangan.persistence.repository.budget.record.AbstractDataBudgetRecordRepository;
import com.rendyrobbani.keuangan.persistence.repository.budget.record.DataBudgetRecordJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataBudgetRecordMayorRepositoryImpl extends AbstractDataBudgetRecordRepository<DataBudgetRecordMayorEntity, DataBudgetRecordMayor, DataMasterMayor, Byte> implements DataBudgetRecordMayorRepository {

	private final DataBudgetRecordMayorJpaRepository repository;

	@Override
	protected DataBudgetRecordJpaRepository<DataBudgetRecordMayorEntity, DataBudgetRecordMayor, DataMasterMayor, Byte> repositoryOfBudgetRecord() {
		return this.repository;
	}

}
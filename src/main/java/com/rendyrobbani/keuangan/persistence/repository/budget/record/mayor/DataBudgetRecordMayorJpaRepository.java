package com.rendyrobbani.keuangan.persistence.repository.budget.record.mayor;

import com.rendyrobbani.keuangan.core.domain.entity.budget.record.mayor.DataBudgetRecordMayor;
import com.rendyrobbani.keuangan.core.domain.entity.master.mayor.DataMasterMayor;
import com.rendyrobbani.keuangan.persistence.entity.budget.record.mayor.DataBudgetRecordMayorEntity;
import com.rendyrobbani.keuangan.persistence.repository.budget.record.DataBudgetRecordJpaRepository;

public interface DataBudgetRecordMayorJpaRepository extends DataBudgetRecordJpaRepository<DataBudgetRecordMayorEntity, DataBudgetRecordMayor, DataMasterMayor, Byte> {

}
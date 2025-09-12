package com.rendyrobbani.keuangan.persistence.repository.budget.record.tapd.sign;

import com.rendyrobbani.keuangan.core.domain.entity.budget.record.tapd.sign.DataBudgetRecordTapdSign;
import com.rendyrobbani.keuangan.core.domain.entity.master.tapd.sign.DataMasterTapdSign;
import com.rendyrobbani.keuangan.persistence.entity.budget.record.tapd.sign.DataBudgetRecordTapdSignEntity;
import com.rendyrobbani.keuangan.persistence.repository.budget.record.DataBudgetRecordJpaRepository;

public interface DataBudgetRecordTapdSignJpaRepository extends DataBudgetRecordJpaRepository<DataBudgetRecordTapdSignEntity, DataBudgetRecordTapdSign, DataMasterTapdSign, String> {

}
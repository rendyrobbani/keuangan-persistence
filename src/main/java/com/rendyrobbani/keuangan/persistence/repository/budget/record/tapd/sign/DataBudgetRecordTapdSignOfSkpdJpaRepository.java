package com.rendyrobbani.keuangan.persistence.repository.budget.record.tapd.sign;

import com.rendyrobbani.keuangan.core.domain.entity.budget.record.tapd.sign.DataBudgetRecordTapdSignOfSkpd;
import com.rendyrobbani.keuangan.core.domain.entity.master.tapd.sign.DataMasterTapdSignOfSkpd;
import com.rendyrobbani.keuangan.persistence.entity.budget.record.tapd.sign.DataBudgetRecordTapdSignOfSkpdEntity;
import com.rendyrobbani.keuangan.persistence.repository.budget.record.DataBudgetRecordJpaRepository;

public interface DataBudgetRecordTapdSignOfSkpdJpaRepository extends DataBudgetRecordJpaRepository<DataBudgetRecordTapdSignOfSkpdEntity, DataBudgetRecordTapdSignOfSkpd, DataMasterTapdSignOfSkpd, String> {

}
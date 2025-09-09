package com.rendyrobbani.keuangan.persistence.repository.budget.record.organisasi;

import com.rendyrobbani.keuangan.core.domain.entity.budget.record.organisasi.DataBudgetRecordOrganisasi;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.organisasi.DataMasterOrganisasi;
import com.rendyrobbani.keuangan.persistence.entity.budget.record.organisasi.DataBudgetRecordOrganisasiEntity;
import com.rendyrobbani.keuangan.persistence.repository.budget.record.DataBudgetRecordJpaRepository;

public interface DataBudgetRecordOrganisasiJpaRepository extends DataBudgetRecordJpaRepository<DataBudgetRecordOrganisasiEntity, DataBudgetRecordOrganisasi, DataMasterOrganisasi, String> {

}
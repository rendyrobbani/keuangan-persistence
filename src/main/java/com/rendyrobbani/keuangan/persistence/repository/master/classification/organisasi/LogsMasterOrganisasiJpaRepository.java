package com.rendyrobbani.keuangan.persistence.repository.master.classification.organisasi;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.organisasi.DataMasterOrganisasi;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.organisasi.LogsMasterOrganisasi;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.organisasi.LogsMasterOrganisasiEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.LogsMasterClassificationJpaRepository;

public interface LogsMasterOrganisasiJpaRepository extends LogsMasterClassificationJpaRepository<LogsMasterOrganisasiEntity, LogsMasterOrganisasi, DataMasterOrganisasi> {

}
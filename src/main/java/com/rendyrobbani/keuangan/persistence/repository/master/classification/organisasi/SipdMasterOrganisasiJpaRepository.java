package com.rendyrobbani.keuangan.persistence.repository.master.classification.organisasi;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.organisasi.DataMasterOrganisasi;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.organisasi.SipdMasterOrganisasi;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.organisasi.SipdMasterOrganisasiEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.SipdMasterClassificationJpaRepository;

public interface SipdMasterOrganisasiJpaRepository extends SipdMasterClassificationJpaRepository<SipdMasterOrganisasiEntity, SipdMasterOrganisasi, DataMasterOrganisasi> {

}
package com.rendyrobbani.keuangan.persistence.repository.master.classification.provinsi;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.provinsi.DataMasterProvinsi;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.provinsi.SipdMasterProvinsi;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.provinsi.SipdMasterProvinsiEntity;

import com.rendyrobbani.keuangan.persistence.repository.master.classification.SipdMasterClassificationJpaRepository;

public interface SipdMasterProvinsiJpaRepository extends SipdMasterClassificationJpaRepository<SipdMasterProvinsiEntity, SipdMasterProvinsi, DataMasterProvinsi> {}
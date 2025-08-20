package com.rendyrobbani.keuangan.persistence.repository.master.classification.kelurahan;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kelurahan.DataMasterKelurahan;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kelurahan.SipdMasterKelurahan;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.kelurahan.SipdMasterKelurahanEntity;

import com.rendyrobbani.keuangan.persistence.repository.master.classification.SipdMasterClassificationJpaRepository;

public interface SipdMasterKelurahanJpaRepository extends SipdMasterClassificationJpaRepository<SipdMasterKelurahanEntity, SipdMasterKelurahan, DataMasterKelurahan> {}
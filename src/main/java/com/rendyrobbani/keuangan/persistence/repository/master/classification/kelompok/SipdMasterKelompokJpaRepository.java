package com.rendyrobbani.keuangan.persistence.repository.master.classification.kelompok;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kelompok.DataMasterKelompok;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kelompok.SipdMasterKelompok;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.kelompok.SipdMasterKelompokEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.SipdMasterClassificationJpaRepository;

public interface SipdMasterKelompokJpaRepository extends SipdMasterClassificationJpaRepository<SipdMasterKelompokEntity, SipdMasterKelompok, DataMasterKelompok> {

}
package com.rendyrobbani.keuangan.persistence.repository.master.classification.kabupaten;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kabupaten.DataMasterKabupaten;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kabupaten.SipdMasterKabupaten;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.kabupaten.SipdMasterKabupatenEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.SipdMasterClassificationJpaRepository;

public interface SipdMasterKabupatenJpaRepository extends SipdMasterClassificationJpaRepository<SipdMasterKabupatenEntity, SipdMasterKabupaten, DataMasterKabupaten> {

}
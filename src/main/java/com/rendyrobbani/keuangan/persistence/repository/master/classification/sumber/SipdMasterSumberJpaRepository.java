package com.rendyrobbani.keuangan.persistence.repository.master.classification.sumber;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.sumber.DataMasterSumber;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.sumber.SipdMasterSumber;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.sumber.SipdMasterSumberEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.SipdMasterClassificationJpaRepository;

public interface SipdMasterSumberJpaRepository extends SipdMasterClassificationJpaRepository<SipdMasterSumberEntity, SipdMasterSumber, DataMasterSumber> {

}
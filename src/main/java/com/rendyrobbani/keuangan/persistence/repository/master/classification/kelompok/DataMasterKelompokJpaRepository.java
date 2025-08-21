package com.rendyrobbani.keuangan.persistence.repository.master.classification.kelompok;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kelompok.DataMasterKelompok;
import com.rendyrobbani.keuangan.core.domain.vo.KomponenType;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.kelompok.DataMasterKelompokEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.DataMasterClassificationJpaRepository;

import java.util.List;

public interface DataMasterKelompokJpaRepository extends DataMasterClassificationJpaRepository<DataMasterKelompokEntity, DataMasterKelompok> {

	List<DataMasterKelompokEntity> findByType(KomponenType type);

	List<DataMasterKelompokEntity> findByTypeAndLevel(KomponenType type, Integer level);

}
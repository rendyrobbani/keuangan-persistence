package com.rendyrobbani.keuangan.persistence.repository.master.satuan;

import com.rendyrobbani.keuangan.core.domain.entity.master.satuan.DataMasterSatuan;
import com.rendyrobbani.keuangan.persistence.entity.master.satuan.DataMasterSatuanEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.DataMasterJpaRepository;

import java.util.List;

public interface DataMasterSatuanJpaRepository extends DataMasterJpaRepository<DataMasterSatuanEntity, DataMasterSatuan, Long> {

	List<DataMasterSatuanEntity> findByName(String name);

	List<DataMasterSatuanEntity> findByNameAndIsDeleted(String name, boolean isDeleted);

}
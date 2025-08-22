package com.rendyrobbani.keuangan.persistence.repository.master.komponen;

import com.rendyrobbani.keuangan.core.domain.entity.master.komponen.DataMasterKomponen;
import com.rendyrobbani.keuangan.core.domain.vo.KomponenType;
import com.rendyrobbani.keuangan.persistence.entity.master.komponen.DataMasterKomponenEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.DataMasterJpaRepository;

import java.util.List;

public interface DataMasterKomponenJpaRepository extends DataMasterJpaRepository<DataMasterKomponenEntity, DataMasterKomponen, Long> {

	List<DataMasterKomponenEntity> findByType(KomponenType type);

	List<DataMasterKomponenEntity> findByTypeAndIsDeleted(KomponenType type, boolean isDeleted);

	List<DataMasterKomponenEntity> findByRekeningIdContaining(String rekeningId);

	List<DataMasterKomponenEntity> findByRekeningIdContainingAndIsDeleted(String rekeningId, boolean isDeleted);

	List<DataMasterKomponenEntity> findByTypeAndRekeningIdContaining(KomponenType type, String rekeningId);

	List<DataMasterKomponenEntity> findByTypeAndRekeningIdContainingAndIsDeleted(KomponenType type, String rekeningId, boolean isDeleted);

}
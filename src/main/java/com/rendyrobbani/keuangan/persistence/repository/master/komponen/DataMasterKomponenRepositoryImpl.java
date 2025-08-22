package com.rendyrobbani.keuangan.persistence.repository.master.komponen;

import com.rendyrobbani.keuangan.core.domain.entity.master.komponen.DataMasterKomponen;
import com.rendyrobbani.keuangan.core.domain.repository.master.komponen.DataMasterKomponenRepository;
import com.rendyrobbani.keuangan.core.domain.vo.KomponenType;
import com.rendyrobbani.keuangan.persistence.entity.master.komponen.DataMasterKomponenEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.AbstractDataMasterRepository;
import com.rendyrobbani.keuangan.persistence.repository.master.DataMasterJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class DataMasterKomponenRepositoryImpl extends AbstractDataMasterRepository<DataMasterKomponenEntity, DataMasterKomponen, Long> implements DataMasterKomponenRepository {

	private final DataMasterKomponenJpaRepository repository;

	@Override
	protected DataMasterJpaRepository<DataMasterKomponenEntity, DataMasterKomponen, Long> repositoryOfMaster() {
		return this.repository;
	}

	@Override
	public List<DataMasterKomponen> findByRekeningId(String rekeningId) {
		return this.repository.findByRekeningIdContaining(rekeningId).stream().map(DataMasterKomponenEntity::toDomain).toList();
	}

	@Override
	public List<DataMasterKomponen> findByRekeningIdAndIsDeletedFalse(String rekeningId) {
		return this.repository.findByRekeningIdContainingAndIsDeleted(rekeningId, false).stream().map(DataMasterKomponenEntity::toDomain).toList();
	}

	@Override
	public List<DataMasterKomponen> findByRekeningIdAndIsDeletedTrue(String rekeningId) {
		return this.repository.findByRekeningIdContainingAndIsDeleted(rekeningId, true).stream().map(DataMasterKomponenEntity::toDomain).toList();
	}

	@Override
	public List<DataMasterKomponen> findByType(KomponenType type) {
		return this.repository.findByType(type).stream().map(DataMasterKomponenEntity::toDomain).toList();
	}

	@Override
	public List<DataMasterKomponen> findByTypeAndIsDeletedFalse(KomponenType type) {
		return this.repository.findByTypeAndIsDeleted(type, false).stream().map(DataMasterKomponenEntity::toDomain).toList();
	}

	@Override
	public List<DataMasterKomponen> findByTypeAndIsDeletedTrue(KomponenType type) {
		return this.repository.findByTypeAndIsDeleted(type, true).stream().map(DataMasterKomponenEntity::toDomain).toList();
	}

	@Override
	public List<DataMasterKomponen> findByTypeAndRekeningId(KomponenType type, String rekeningId) {
		return this.repository.findByTypeAndRekeningIdContaining(type, rekeningId).stream().map(DataMasterKomponenEntity::toDomain).toList();
	}

	@Override
	public List<DataMasterKomponen> findByTypeAndRekeningIdAndIsDeletedFalse(KomponenType type, String rekeningId) {
		return this.repository.findByTypeAndRekeningIdContainingAndIsDeleted(type, rekeningId, false).stream().map(DataMasterKomponenEntity::toDomain).toList();
	}

	@Override
	public List<DataMasterKomponen> findByTypeAndRekeningIdAndIsDeletedTrue(KomponenType type, String rekeningId) {
		return this.repository.findByTypeAndRekeningIdContainingAndIsDeleted(type, rekeningId, true).stream().map(DataMasterKomponenEntity::toDomain).toList();
	}

}
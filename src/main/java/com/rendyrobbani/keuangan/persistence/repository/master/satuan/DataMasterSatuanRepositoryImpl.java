package com.rendyrobbani.keuangan.persistence.repository.master.satuan;

import com.rendyrobbani.keuangan.core.domain.entity.master.satuan.DataMasterSatuan;
import com.rendyrobbani.keuangan.core.domain.repository.master.satuan.DataMasterSatuanRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.satuan.DataMasterSatuanEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.AbstractDataMasterRepository;
import com.rendyrobbani.keuangan.persistence.repository.master.DataMasterJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class DataMasterSatuanRepositoryImpl extends AbstractDataMasterRepository<DataMasterSatuanEntity, DataMasterSatuan, Long> implements DataMasterSatuanRepository {

	private final DataMasterSatuanJpaRepository repository;

	@Override
	protected DataMasterJpaRepository<DataMasterSatuanEntity, DataMasterSatuan, Long> repositoryOfMaster() {
		return this.repository;
	}

	@Override
	public List<DataMasterSatuan> findByName(String name) {
		return this.repository.findByName(name).stream().map(DataMasterSatuanEntity::toDomain).toList();
	}

	@Override
	public List<DataMasterSatuan> findByNameAndIsDeletedFalse(String name) {
		return this.repository.findByNameAndIsDeleted(name, false).stream().map(DataMasterSatuanEntity::toDomain).toList();
	}

	@Override
	public List<DataMasterSatuan> findByNameAndIsDeletedTrue(String name) {
		return this.repository.findByNameAndIsDeleted(name, true).stream().map(DataMasterSatuanEntity::toDomain).toList();
	}

}
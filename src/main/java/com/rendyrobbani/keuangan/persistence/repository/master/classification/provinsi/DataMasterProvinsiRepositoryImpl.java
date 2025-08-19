package com.rendyrobbani.keuangan.persistence.repository.master.classification.provinsi;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.provinsi.DataMasterProvinsi;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.provinsi.DataMasterProvinsiRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.provinsi.DataMasterProvinsiEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractDataMasterClassificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class DataMasterProvinsiRepositoryImpl extends AbstractDataMasterClassificationRepository<DataMasterProvinsiEntity, DataMasterProvinsi> implements DataMasterProvinsiRepository {

	private final DataMasterProvinsiJpaRepository repository;

	@Override
	protected JpaRepository<DataMasterProvinsiEntity, String> repository() {
		return repository;
	}

	@Override
	public List<DataMasterProvinsi> findByIsDeletedFalse() {
		return this.repository.findByIsDeleted(false).stream().map(DataMasterProvinsiEntity::toDomain).toList();
	}

	@Override
	public List<DataMasterProvinsi> findByIsDeletedTrue() {
		return this.repository.findByIsDeleted(true).stream().map(DataMasterProvinsiEntity::toDomain).toList();
	}

}
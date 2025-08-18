package com.rendyrobbani.keuangan.persistence.repository.master.classification.fungsi;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.fungsi.DataMasterFungsi;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.fungsi.DataMasterFungsiRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.fungsi.DataMasterFungsiEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractDataMasterClassificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class DataMasterFungsiRepositoryImpl extends AbstractDataMasterClassificationRepository<DataMasterFungsiEntity, DataMasterFungsi> implements DataMasterFungsiRepository {

	private final DataMasterFungsiJpaRepository repository;

	@Override
	protected JpaRepository<DataMasterFungsiEntity, String> repository() {
		return repository;
	}

	@Override
	public List<DataMasterFungsi> findByIsDeletedFalse() {
		return this.repository.findByIsDeleted(false).stream().map(DataMasterFungsiEntity::toDomain).toList();
	}

	@Override
	public List<DataMasterFungsi> findByIsDeletedTrue() {
		return this.repository.findByIsDeleted(true).stream().map(DataMasterFungsiEntity::toDomain).toList();
	}

}
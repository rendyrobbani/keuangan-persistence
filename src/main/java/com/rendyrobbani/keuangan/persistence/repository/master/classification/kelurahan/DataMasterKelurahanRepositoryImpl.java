package com.rendyrobbani.keuangan.persistence.repository.master.classification.kelurahan;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kelurahan.DataMasterKelurahan;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.kelurahan.DataMasterKelurahanRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.kelurahan.DataMasterKelurahanEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractDataMasterClassificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class DataMasterKelurahanRepositoryImpl extends AbstractDataMasterClassificationRepository<DataMasterKelurahanEntity, DataMasterKelurahan> implements DataMasterKelurahanRepository {

	private final DataMasterKelurahanJpaRepository repository;

	@Override
	protected JpaRepository<DataMasterKelurahanEntity, String> repository() {
		return repository;
	}

	@Override
	public List<DataMasterKelurahan> findByIsDeletedFalse() {
		return this.repository.findByIsDeleted(false).stream().map(DataMasterKelurahanEntity::toDomain).toList();
	}

	@Override
	public List<DataMasterKelurahan> findByIsDeletedTrue() {
		return this.repository.findByIsDeleted(true).stream().map(DataMasterKelurahanEntity::toDomain).toList();
	}

}
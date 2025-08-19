package com.rendyrobbani.keuangan.persistence.repository.master.classification.kabupaten;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kabupaten.DataMasterKabupaten;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.kabupaten.DataMasterKabupatenRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.kabupaten.DataMasterKabupatenEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractDataMasterClassificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class DataMasterKabupatenRepositoryImpl extends AbstractDataMasterClassificationRepository<DataMasterKabupatenEntity, DataMasterKabupaten> implements DataMasterKabupatenRepository {

	private final DataMasterKabupatenJpaRepository repository;

	@Override
	protected JpaRepository<DataMasterKabupatenEntity, String> repository() {
		return repository;
	}

	@Override
	public List<DataMasterKabupaten> findByIsDeletedFalse() {
		return this.repository.findByIsDeleted(false).stream().map(DataMasterKabupatenEntity::toDomain).toList();
	}

	@Override
	public List<DataMasterKabupaten> findByIsDeletedTrue() {
		return this.repository.findByIsDeleted(true).stream().map(DataMasterKabupatenEntity::toDomain).toList();
	}

}
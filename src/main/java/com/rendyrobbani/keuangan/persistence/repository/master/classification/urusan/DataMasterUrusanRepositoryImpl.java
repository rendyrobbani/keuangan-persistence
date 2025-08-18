package com.rendyrobbani.keuangan.persistence.repository.master.classification.urusan;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.urusan.DataMasterUrusan;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.urusan.DataMasterUrusanRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.urusan.DataMasterUrusanEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractDataMasterClassificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class DataMasterUrusanRepositoryImpl extends AbstractDataMasterClassificationRepository<DataMasterUrusanEntity, DataMasterUrusan> implements DataMasterUrusanRepository {

	private final DataMasterUrusanJpaRepository repository;

	@Override
	protected JpaRepository<DataMasterUrusanEntity, String> repository() {
		return repository;
	}

	@Override
	public List<DataMasterUrusan> findByIsDeletedFalse() {
		return this.repository.findByIsDeleted(false).stream().map(DataMasterUrusanEntity::toDomain).toList();
	}

	@Override
	public List<DataMasterUrusan> findByIsDeletedTrue() {
		return this.repository.findByIsDeleted(true).stream().map(DataMasterUrusanEntity::toDomain).toList();
	}

}
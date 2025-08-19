package com.rendyrobbani.keuangan.persistence.repository.master.classification.kecamatan;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kecamatan.DataMasterKecamatan;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.kecamatan.DataMasterKecamatanRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.kecamatan.DataMasterKecamatanEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractDataMasterClassificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class DataMasterKecamatanRepositoryImpl extends AbstractDataMasterClassificationRepository<DataMasterKecamatanEntity, DataMasterKecamatan> implements DataMasterKecamatanRepository {

	private final DataMasterKecamatanJpaRepository repository;

	@Override
	protected JpaRepository<DataMasterKecamatanEntity, String> repository() {
		return repository;
	}

	@Override
	public List<DataMasterKecamatan> findByIsDeletedFalse() {
		return this.repository.findByIsDeleted(false).stream().map(DataMasterKecamatanEntity::toDomain).toList();
	}

	@Override
	public List<DataMasterKecamatan> findByIsDeletedTrue() {
		return this.repository.findByIsDeleted(true).stream().map(DataMasterKecamatanEntity::toDomain).toList();
	}

}
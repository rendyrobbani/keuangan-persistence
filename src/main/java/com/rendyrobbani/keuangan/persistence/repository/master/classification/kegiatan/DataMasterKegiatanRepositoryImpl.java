package com.rendyrobbani.keuangan.persistence.repository.master.classification.kegiatan;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kegiatan.DataMasterKegiatan;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.kegiatan.DataMasterKegiatanRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.kegiatan.DataMasterKegiatanEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractDataMasterClassificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class DataMasterKegiatanRepositoryImpl extends AbstractDataMasterClassificationRepository<DataMasterKegiatanEntity, DataMasterKegiatan> implements DataMasterKegiatanRepository {

	private final DataMasterKegiatanJpaRepository repository;

	@Override
	protected JpaRepository<DataMasterKegiatanEntity, String> repository() {
		return repository;
	}

	@Override
	public List<DataMasterKegiatan> findByIsDeletedFalse() {
		return this.repository.findByIsDeleted(false).stream().map(DataMasterKegiatanEntity::toDomain).toList();
	}

	@Override
	public List<DataMasterKegiatan> findByIsDeletedTrue() {
		return this.repository.findByIsDeleted(true).stream().map(DataMasterKegiatanEntity::toDomain).toList();
	}

}
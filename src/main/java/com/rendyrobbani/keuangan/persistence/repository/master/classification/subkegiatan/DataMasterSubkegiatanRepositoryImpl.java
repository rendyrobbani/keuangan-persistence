package com.rendyrobbani.keuangan.persistence.repository.master.classification.subkegiatan;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.subkegiatan.DataMasterSubkegiatan;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.subkegiatan.DataMasterSubkegiatanRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.subkegiatan.DataMasterSubkegiatanEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractDataMasterClassificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class DataMasterSubkegiatanRepositoryImpl extends AbstractDataMasterClassificationRepository<DataMasterSubkegiatanEntity, DataMasterSubkegiatan> implements DataMasterSubkegiatanRepository {

	private final DataMasterSubkegiatanJpaRepository repository;

	@Override
	protected JpaRepository<DataMasterSubkegiatanEntity, String> repository() {
		return repository;
	}

	@Override
	public List<DataMasterSubkegiatan> findByIsDeletedFalse() {
		return this.repository.findByIsDeleted(false).stream().map(DataMasterSubkegiatanEntity::toDomain).toList();
	}

	@Override
	public List<DataMasterSubkegiatan> findByIsDeletedTrue() {
		return this.repository.findByIsDeleted(true).stream().map(DataMasterSubkegiatanEntity::toDomain).toList();
	}

}
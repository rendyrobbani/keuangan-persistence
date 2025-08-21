package com.rendyrobbani.keuangan.persistence.repository.master.classification.kelompok;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kelompok.DataMasterKelompok;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.kelompok.DataMasterKelompokRepository;
import com.rendyrobbani.keuangan.core.domain.vo.KomponenType;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.kelompok.DataMasterKelompokEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractDataMasterClassificationRepository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.DataMasterClassificationJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class DataMasterKelompokRepositoryImpl extends AbstractDataMasterClassificationRepository<DataMasterKelompokEntity, DataMasterKelompok> implements DataMasterKelompokRepository {

	private final DataMasterKelompokJpaRepository repository;

	@Override
	protected DataMasterClassificationJpaRepository<DataMasterKelompokEntity, DataMasterKelompok> repositoryOfMasterClassifcation() {
		return this.repository;
	}

	@Override
	public List<DataMasterKelompok> findByType(KomponenType type) {
		return this.repository.findByType(type).stream().map(DataMasterKelompokEntity::toDomain).toList();
	}

	@Override
	public List<DataMasterKelompok> findByTypeAndLevel(KomponenType type, Integer level) {
		return this.repository.findByTypeAndLevel(type, level).stream().map(DataMasterKelompokEntity::toDomain).toList();
	}

}
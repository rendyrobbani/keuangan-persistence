package com.rendyrobbani.keuangan.persistence.repository.master.classification.kelurahan;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kelurahan.DataMasterKelurahan;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.kelurahan.DataMasterKelurahanRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.kelurahan.DataMasterKelurahanEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractDataMasterClassificationRepository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.DataMasterClassificationJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor

public class DataMasterKelurahanRepositoryImpl extends AbstractDataMasterClassificationRepository<DataMasterKelurahanEntity, DataMasterKelurahan> implements DataMasterKelurahanRepository {

	private final DataMasterKelurahanJpaRepository repository;

	@Override
	protected DataMasterClassificationJpaRepository<DataMasterKelurahanEntity, DataMasterKelurahan> repositoryOfMasterClassifcation() {
		return this.repository;
	}

}
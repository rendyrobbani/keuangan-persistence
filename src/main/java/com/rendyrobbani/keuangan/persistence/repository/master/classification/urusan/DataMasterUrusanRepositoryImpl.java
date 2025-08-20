package com.rendyrobbani.keuangan.persistence.repository.master.classification.urusan;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.urusan.DataMasterUrusan;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.urusan.DataMasterUrusanRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.urusan.DataMasterUrusanEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractDataMasterClassificationRepository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.DataMasterClassificationJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor

public class DataMasterUrusanRepositoryImpl extends AbstractDataMasterClassificationRepository<DataMasterUrusanEntity, DataMasterUrusan> implements DataMasterUrusanRepository {

	private final DataMasterUrusanJpaRepository repository;

	@Override
	protected DataMasterClassificationJpaRepository<DataMasterUrusanEntity, DataMasterUrusan> repositoryOfMasterClassifcation() {
		return this.repository;
	}

}
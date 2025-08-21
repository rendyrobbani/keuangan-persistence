package com.rendyrobbani.keuangan.persistence.repository.master.classification.sumber;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.sumber.DataMasterSumber;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.sumber.DataMasterSumberRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.sumber.DataMasterSumberEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractDataMasterClassificationRepository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.DataMasterClassificationJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterSumberRepositoryImpl extends AbstractDataMasterClassificationRepository<DataMasterSumberEntity, DataMasterSumber> implements DataMasterSumberRepository {

	private final DataMasterSumberJpaRepository repository;

	@Override
	protected DataMasterClassificationJpaRepository<DataMasterSumberEntity, DataMasterSumber> repositoryOfMasterClassifcation() {
		return this.repository;
	}

}
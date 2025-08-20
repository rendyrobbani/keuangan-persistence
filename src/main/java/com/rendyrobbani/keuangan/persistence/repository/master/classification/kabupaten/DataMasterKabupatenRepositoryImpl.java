package com.rendyrobbani.keuangan.persistence.repository.master.classification.kabupaten;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kabupaten.DataMasterKabupaten;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.kabupaten.DataMasterKabupatenRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.kabupaten.DataMasterKabupatenEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractDataMasterClassificationRepository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.DataMasterClassificationJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterKabupatenRepositoryImpl extends AbstractDataMasterClassificationRepository<DataMasterKabupatenEntity, DataMasterKabupaten> implements DataMasterKabupatenRepository {

	private final DataMasterKabupatenJpaRepository repository;

	@Override
	protected DataMasterClassificationJpaRepository<DataMasterKabupatenEntity, DataMasterKabupaten> repositoryOfMasterClassifcation() {
		return this.repository;
	}

}
package com.rendyrobbani.keuangan.persistence.repository.master.classification.fungsi;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.fungsi.DataMasterFungsi;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.fungsi.DataMasterFungsiRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.fungsi.DataMasterFungsiEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractDataMasterClassificationRepository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.DataMasterClassificationJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor

public class DataMasterFungsiRepositoryImpl extends AbstractDataMasterClassificationRepository<DataMasterFungsiEntity, DataMasterFungsi> implements DataMasterFungsiRepository {

	private final DataMasterFungsiJpaRepository repository;

	@Override
	protected DataMasterClassificationJpaRepository<DataMasterFungsiEntity, DataMasterFungsi> repositoryOfMasterClassifcation() {
		return this.repository;
	}

}
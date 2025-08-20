package com.rendyrobbani.keuangan.persistence.repository.master.classification.provinsi;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.provinsi.DataMasterProvinsi;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.provinsi.DataMasterProvinsiRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.provinsi.DataMasterProvinsiEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractDataMasterClassificationRepository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.DataMasterClassificationJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor

public class DataMasterProvinsiRepositoryImpl extends AbstractDataMasterClassificationRepository<DataMasterProvinsiEntity, DataMasterProvinsi> implements DataMasterProvinsiRepository {

	private final DataMasterProvinsiJpaRepository repository;

	@Override
	protected DataMasterClassificationJpaRepository<DataMasterProvinsiEntity, DataMasterProvinsi> repositoryOfMasterClassifcation() {
		return this.repository;
	}

}
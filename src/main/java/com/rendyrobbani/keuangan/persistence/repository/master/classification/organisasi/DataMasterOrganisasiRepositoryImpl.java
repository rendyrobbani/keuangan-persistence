package com.rendyrobbani.keuangan.persistence.repository.master.classification.organisasi;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.organisasi.DataMasterOrganisasi;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.organisasi.DataMasterOrganisasiRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.organisasi.DataMasterOrganisasiEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractDataMasterClassificationRepository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.DataMasterClassificationJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterOrganisasiRepositoryImpl extends AbstractDataMasterClassificationRepository<DataMasterOrganisasiEntity, DataMasterOrganisasi> implements DataMasterOrganisasiRepository {

	private final DataMasterOrganisasiJpaRepository repository;

	@Override
	protected DataMasterClassificationJpaRepository<DataMasterOrganisasiEntity, DataMasterOrganisasi> repositoryOfMasterClassifcation() {
		return this.repository;
	}

}
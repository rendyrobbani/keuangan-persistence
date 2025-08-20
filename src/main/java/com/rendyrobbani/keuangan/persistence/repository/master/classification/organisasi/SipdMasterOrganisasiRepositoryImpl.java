package com.rendyrobbani.keuangan.persistence.repository.master.classification.organisasi;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.organisasi.DataMasterOrganisasi;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.organisasi.SipdMasterOrganisasi;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.organisasi.SipdMasterOrganisasiRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.organisasi.SipdMasterOrganisasiEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractSipdMasterClassificationRepository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.SipdMasterClassificationJpaRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Repository;



@Repository
@RequiredArgsConstructor

public class DataMasterOrganisasiRepositoryImpl extends AbstractSipdMasterClassificationRepository<SipdMasterOrganisasiEntity, SipdMasterOrganisasi, DataMasterOrganisasi> implements SipdMasterOrganisasiRepository {

	private final DataMasterOrganisasiJpaRepository repository;

	@Override
	protected SipdMasterClassificationJpaRepository<SipdMasterOrganisasiEntity, SipdMasterOrganisasi, DataMasterOrganisasi> repositoryOfMasterClassifcation() {
		return this.repository;
	}

}
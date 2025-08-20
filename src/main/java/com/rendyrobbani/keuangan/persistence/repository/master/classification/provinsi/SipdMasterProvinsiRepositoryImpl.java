package com.rendyrobbani.keuangan.persistence.repository.master.classification.provinsi;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.provinsi.DataMasterProvinsi;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.provinsi.SipdMasterProvinsi;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.provinsi.SipdMasterProvinsiRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.provinsi.SipdMasterProvinsiEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractSipdMasterClassificationRepository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.SipdMasterClassificationJpaRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Repository;



@Repository
@RequiredArgsConstructor

public class DataMasterProvinsiRepositoryImpl extends AbstractSipdMasterClassificationRepository<SipdMasterProvinsiEntity, SipdMasterProvinsi, DataMasterProvinsi> implements SipdMasterProvinsiRepository {

	private final DataMasterProvinsiJpaRepository repository;

	@Override
	protected SipdMasterClassificationJpaRepository<SipdMasterProvinsiEntity, SipdMasterProvinsi, DataMasterProvinsi> repositoryOfMasterClassifcation() {
		return this.repository;
	}

}
package com.rendyrobbani.keuangan.persistence.repository.master.classification.kelurahan;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kelurahan.DataMasterKelurahan;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kelurahan.SipdMasterKelurahan;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.kelurahan.SipdMasterKelurahanRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.kelurahan.SipdMasterKelurahanEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractSipdMasterClassificationRepository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.SipdMasterClassificationJpaRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Repository;



@Repository
@RequiredArgsConstructor

public class DataMasterKelurahanRepositoryImpl extends AbstractSipdMasterClassificationRepository<SipdMasterKelurahanEntity, SipdMasterKelurahan, DataMasterKelurahan> implements SipdMasterKelurahanRepository {

	private final DataMasterKelurahanJpaRepository repository;

	@Override
	protected SipdMasterClassificationJpaRepository<SipdMasterKelurahanEntity, SipdMasterKelurahan, DataMasterKelurahan> repositoryOfMasterClassifcation() {
		return this.repository;
	}

}
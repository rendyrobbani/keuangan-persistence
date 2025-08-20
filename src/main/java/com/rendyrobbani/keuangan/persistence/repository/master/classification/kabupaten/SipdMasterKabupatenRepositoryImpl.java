package com.rendyrobbani.keuangan.persistence.repository.master.classification.kabupaten;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kabupaten.DataMasterKabupaten;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kabupaten.SipdMasterKabupaten;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.kabupaten.SipdMasterKabupatenRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.kabupaten.SipdMasterKabupatenEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractSipdMasterClassificationRepository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.SipdMasterClassificationJpaRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Repository;



@Repository
@RequiredArgsConstructor

public class DataMasterKabupatenRepositoryImpl extends AbstractSipdMasterClassificationRepository<SipdMasterKabupatenEntity, SipdMasterKabupaten, DataMasterKabupaten> implements SipdMasterKabupatenRepository {

	private final DataMasterKabupatenJpaRepository repository;

	@Override
	protected SipdMasterClassificationJpaRepository<SipdMasterKabupatenEntity, SipdMasterKabupaten, DataMasterKabupaten> repositoryOfMasterClassifcation() {
		return this.repository;
	}

}
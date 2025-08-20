package com.rendyrobbani.keuangan.persistence.repository.master.classification;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.DataMasterClassificationEntity;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.DataMasterClassificationRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.AbstractDataMasterClassificationEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.AbstractDataMasterRepository;
import com.rendyrobbani.keuangan.persistence.repository.master.DataMasterJpaRepository;

public abstract class AbstractDataMasterClassificationRepository<
		ENTITY extends AbstractDataMasterClassificationEntity<DOMAIN>,
		DOMAIN extends DataMasterClassificationEntity
		>
		extends AbstractDataMasterRepository<ENTITY, DOMAIN, String>
		implements DataMasterClassificationRepository<DOMAIN> {

	@Override
	protected DataMasterJpaRepository<ENTITY, DOMAIN, String> repositoryOfMaster() {
		return repositoryOfMasterClassifcation();
	}

	protected abstract DataMasterClassificationJpaRepository<ENTITY, DOMAIN> repositoryOfMasterClassifcation();

}
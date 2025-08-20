package com.rendyrobbani.keuangan.persistence.repository.master.classification;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.DataMasterClassificationEntity;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.LogsMasterClassificationEntity;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.LogsMasterClassificationRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.AbstractLogsMasterClassificationEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.AbstractLogsMasterRepository;
import com.rendyrobbani.keuangan.persistence.repository.master.LogsMasterJpaRepository;

public abstract class AbstractLogsMasterClassificationRepository<
		ENTITY extends AbstractLogsMasterClassificationEntity<DOMAIN, SUBJECT>,
		DOMAIN extends LogsMasterClassificationEntity<SUBJECT>,
		SUBJECT extends DataMasterClassificationEntity
		>
		extends AbstractLogsMasterRepository<ENTITY, DOMAIN, SUBJECT, String>
		implements LogsMasterClassificationRepository<DOMAIN, SUBJECT> {

	@Override
	protected LogsMasterJpaRepository<ENTITY, DOMAIN, SUBJECT, String> repositoryOfMaster() {
		return this.repositoryOfMasterClassifcation();
	}

	protected abstract LogsMasterClassificationJpaRepository<ENTITY, DOMAIN, SUBJECT> repositoryOfMasterClassifcation();

}
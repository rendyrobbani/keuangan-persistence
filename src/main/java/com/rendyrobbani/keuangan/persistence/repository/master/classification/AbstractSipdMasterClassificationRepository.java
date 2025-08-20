package com.rendyrobbani.keuangan.persistence.repository.master.classification;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.DataMasterClassificationEntity;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.SipdMasterClassificationEntity;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.SipdMasterClassificationRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.AbstractSipdMasterClassificationEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.AbstractSipdMasterRepository;
import com.rendyrobbani.keuangan.persistence.repository.master.SipdMasterJpaRepository;

public abstract class AbstractSipdMasterClassificationRepository<
		ENTITY extends AbstractSipdMasterClassificationEntity<DOMAIN, SUBJECT>,
		DOMAIN extends SipdMasterClassificationEntity<SUBJECT>,
		SUBJECT extends DataMasterClassificationEntity
		>
		extends AbstractSipdMasterRepository<ENTITY, DOMAIN, SUBJECT, String, Long>
		implements SipdMasterClassificationRepository<DOMAIN, SUBJECT> {

	@Override
	protected SipdMasterJpaRepository<ENTITY, DOMAIN, SUBJECT, String, Long> repositoryOfMaster() {
		return this.repositoryOfMasterClassification();
	}

	protected abstract SipdMasterClassificationJpaRepository<ENTITY, DOMAIN, SUBJECT> repositoryOfMasterClassification();

}
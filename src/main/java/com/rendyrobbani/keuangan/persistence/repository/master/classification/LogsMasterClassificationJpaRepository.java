package com.rendyrobbani.keuangan.persistence.repository.master.classification;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.DataMasterClassificationEntity;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.LogsMasterClassificationEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.AbstractLogsMasterClassificationEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.LogsMasterJpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface LogsMasterClassificationJpaRepository<
		ENTITY extends AbstractLogsMasterClassificationEntity<DOMAIN, SUBJECT>,
		DOMAIN extends LogsMasterClassificationEntity<SUBJECT>,
		SUBJECT extends DataMasterClassificationEntity
		>
		extends LogsMasterJpaRepository<ENTITY, DOMAIN, SUBJECT, String> {

}
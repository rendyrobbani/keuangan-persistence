package com.rendyrobbani.keuangan.persistence.repository.master.classification;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.DataMasterClassificationEntity;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.SipdMasterClassificationEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.AbstractSipdMasterClassificationEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.SipdMasterJpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface SipdMasterClassificationJpaRepository<
		ENTITY extends AbstractSipdMasterClassificationEntity<DOMAIN, SUBJECT>,
		DOMAIN extends SipdMasterClassificationEntity<SUBJECT>,
		SUBJECT extends DataMasterClassificationEntity
		>
		extends SipdMasterJpaRepository<ENTITY, DOMAIN, SUBJECT, String, Long> {

}
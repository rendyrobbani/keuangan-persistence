package com.rendyrobbani.keuangan.persistence.repository.master.classification;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.DataMasterClassificationEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.AbstractDataMasterClassificationEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.DataMasterJpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface DataMasterClassificationJpaRepository<
		ENTITY extends AbstractDataMasterClassificationEntity<DOMAIN>,
		DOMAIN extends DataMasterClassificationEntity
		>
		extends DataMasterJpaRepository<ENTITY, DOMAIN, String> {

}
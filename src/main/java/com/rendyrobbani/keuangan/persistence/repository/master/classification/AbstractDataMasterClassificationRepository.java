package com.rendyrobbani.keuangan.persistence.repository.master.classification;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.DataMasterClassificationEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.AbstractDataMasterClassifcationEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.AbstractDataMasterRepository;

public abstract class AbstractDataMasterClassificationRepository<ENTITY extends AbstractDataMasterClassifcationEntity<DOMAIN>, DOMAIN extends DataMasterClassificationEntity> extends AbstractDataMasterRepository<ENTITY, DOMAIN, String> {

}
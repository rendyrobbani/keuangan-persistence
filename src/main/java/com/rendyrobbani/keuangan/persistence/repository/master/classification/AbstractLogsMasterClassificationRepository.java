package com.rendyrobbani.keuangan.persistence.repository.master.classification;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.DataMasterClassificationEntity;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.LogsMasterClassificationEntity;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.LogsMasterClassificationRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.AbstractLogsMasterClassifcationEntity;
import com.rendyrobbani.keuangan.persistence.repository.AbstractRepository;

public abstract class AbstractLogsMasterClassificationRepository<ENTITY extends AbstractLogsMasterClassifcationEntity<DOMAIN, SUBJECT>, DOMAIN extends LogsMasterClassificationEntity<SUBJECT>, SUBJECT extends DataMasterClassificationEntity> extends AbstractRepository<ENTITY, DOMAIN, Long> implements LogsMasterClassificationRepository<DOMAIN, SUBJECT> {

}
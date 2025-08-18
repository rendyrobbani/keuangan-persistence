package com.rendyrobbani.keuangan.persistence.repository.master.classification;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.DataMasterClassificationEntity;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.SipdMasterClassificationEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.AbstractSipdMasterClassifcationEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.AbstractSipdMasterRepository;

public abstract class AbstractSipdMasterClassificationRepository<ENTITY extends AbstractSipdMasterClassifcationEntity<DOMAIN, SUBJECT>, DOMAIN extends SipdMasterClassificationEntity<SUBJECT>, SUBJECT extends DataMasterClassificationEntity> extends AbstractSipdMasterRepository<ENTITY, DOMAIN, SUBJECT, String, Long> {

}
package com.rendyrobbani.keuangan.persistence.repository.master;

import com.rendyrobbani.keuangan.core.domain.entity.master.DataMasterEntity;
import com.rendyrobbani.keuangan.core.domain.entity.master.LogsMasterEntity;
import com.rendyrobbani.keuangan.core.domain.repository.master.LogsMasterRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.AbstractLogsMasterEntity;
import com.rendyrobbani.keuangan.persistence.repository.AbstractRepository;

public abstract class AbstractLogsMasterRepository<ENTITY extends AbstractLogsMasterEntity<DOMAIN, SUBJECT, SUBJECTID>, DOMAIN extends LogsMasterEntity<SUBJECT, SUBJECTID>, SUBJECT extends DataMasterEntity<SUBJECTID>, SUBJECTID> extends AbstractRepository<ENTITY, DOMAIN, Long> implements LogsMasterRepository<DOMAIN, SUBJECT, SUBJECTID> {

}
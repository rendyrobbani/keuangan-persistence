package com.rendyrobbani.keuangan.persistence.repository.master;

import com.rendyrobbani.keuangan.core.domain.entity.master.DataMasterEntity;
import com.rendyrobbani.keuangan.core.domain.entity.master.SipdMasterEntity;
import com.rendyrobbani.keuangan.core.domain.repository.master.SipdMasterRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.AbstractSipdMasterEntity;
import com.rendyrobbani.keuangan.persistence.repository.AbstractRepository;

public abstract class AbstractSipdMasterRepository<ENTITY extends AbstractSipdMasterEntity<DOMAIN, SUBJECT, SUBJECTID, ID>, DOMAIN extends SipdMasterEntity<SUBJECT, SUBJECTID, ID>, SUBJECT extends DataMasterEntity<SUBJECTID>, SUBJECTID, ID> extends AbstractRepository<ENTITY, DOMAIN, ID> implements SipdMasterRepository<DOMAIN, SUBJECT, SUBJECTID, ID> {

}
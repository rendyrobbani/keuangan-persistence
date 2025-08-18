package com.rendyrobbani.keuangan.persistence.repository.master;

import com.rendyrobbani.keuangan.core.domain.entity.master.DataMasterEntity;
import com.rendyrobbani.keuangan.core.domain.repository.master.DataMasterRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.AbstractDataMasterEntity;
import com.rendyrobbani.keuangan.persistence.repository.AbstractRepository;

public abstract class AbstractDataMasterRepository<ENTITY extends AbstractDataMasterEntity<DOMAIN, ID>, DOMAIN extends DataMasterEntity<ID>, ID> extends AbstractRepository<ENTITY, DOMAIN, ID> implements DataMasterRepository<DOMAIN, ID> {

}
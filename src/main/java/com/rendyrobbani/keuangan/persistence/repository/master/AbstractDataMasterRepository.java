package com.rendyrobbani.keuangan.persistence.repository.master;

import com.rendyrobbani.keuangan.core.domain.entity.master.DataMasterEntity;
import com.rendyrobbani.keuangan.core.domain.repository.master.DataMasterRepository;
import com.rendyrobbani.keuangan.persistence.entity.AbstractBaseEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.AbstractDataMasterEntity;
import com.rendyrobbani.keuangan.persistence.repository.AbstractRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public abstract class AbstractDataMasterRepository<
		ENTITY extends AbstractDataMasterEntity<DOMAIN, ID>,
		DOMAIN extends DataMasterEntity<ID>,
		ID
		>
		extends AbstractRepository<ENTITY, DOMAIN, ID>
		implements DataMasterRepository<DOMAIN, ID> {

	@Override
	protected JpaRepository<ENTITY, ID> repository() {
		return this.repositoryOfMaster();
	}

	protected abstract DataMasterJpaRepository<ENTITY, DOMAIN, ID> repositoryOfMaster();

	@Override
	public List<DOMAIN> findByIsDeletedFalse() {
		return this.repositoryOfMaster().findByIsDeleted(false).stream().map(AbstractBaseEntity::toDomain).toList();
	}

	@Override
	public List<DOMAIN> findByIsDeletedTrue() {
		return this.repositoryOfMaster().findByIsDeleted(true).stream().map(AbstractBaseEntity::toDomain).toList();
	}

}
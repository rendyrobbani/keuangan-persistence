package com.rendyrobbani.keuangan.persistence.repository.master.priority;

import com.rendyrobbani.keuangan.core.domain.entity.master.priority.DataMasterPriorityEntity;
import com.rendyrobbani.keuangan.core.domain.repository.master.priority.DataMasterPriorityRepository;
import com.rendyrobbani.keuangan.persistence.entity.AbstractBaseEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.priority.AbstractDataMasterPriorityEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.AbstractDataMasterRepository;
import com.rendyrobbani.keuangan.persistence.repository.master.DataMasterJpaRepository;

import java.util.List;

public abstract class AbstractDataMasterPriorityRepository<
		ENTITY extends AbstractDataMasterPriorityEntity<DOMAIN>,
		DOMAIN extends DataMasterPriorityEntity
		>
		extends AbstractDataMasterRepository<ENTITY, DOMAIN, Long>
		implements DataMasterPriorityRepository<DOMAIN> {

	@Override
	protected DataMasterJpaRepository<ENTITY, DOMAIN, Long> repositoryOfMaster() {
		return this.repositoryOfMasterPriority();
	}

	protected abstract DataMasterPriorityJpaRepository<ENTITY, DOMAIN> repositoryOfMasterPriority();

	@Override
	public List<DOMAIN> findByYear(Short year) {
		return this.repositoryOfMasterPriority().findByYear(year).stream().map(AbstractBaseEntity::toDomain).toList();
	}

	@Override
	public List<DOMAIN> findByYearAndIsDeletedFalse(Short year) {
		return this.repositoryOfMasterPriority().findByYearAndIsDeleted(year, false).stream().map(AbstractBaseEntity::toDomain).toList();
	}

	@Override
	public List<DOMAIN> findByYearAndIsDeletedTrue(Short year) {
		return this.repositoryOfMasterPriority().findByYearAndIsDeleted(year, true).stream().map(AbstractBaseEntity::toDomain).toList();
	}

}
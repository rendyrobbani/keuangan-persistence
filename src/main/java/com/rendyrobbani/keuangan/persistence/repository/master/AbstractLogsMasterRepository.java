package com.rendyrobbani.keuangan.persistence.repository.master;

import com.rendyrobbani.keuangan.core.domain.entity.master.DataMasterEntity;
import com.rendyrobbani.keuangan.core.domain.entity.master.LogsMasterEntity;
import com.rendyrobbani.keuangan.core.domain.repository.master.LogsMasterRepository;
import com.rendyrobbani.keuangan.persistence.entity.AbstractBaseEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.AbstractLogsMasterEntity;
import com.rendyrobbani.keuangan.persistence.repository.AbstractRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public abstract class AbstractLogsMasterRepository<
		ENTITY extends AbstractLogsMasterEntity<DOMAIN, SUBJECT, SUBJECTID>,
		DOMAIN extends LogsMasterEntity<SUBJECT, SUBJECTID>,
		SUBJECT extends DataMasterEntity<SUBJECTID>,
		SUBJECTID
		>
		extends AbstractRepository<ENTITY, DOMAIN, Long>
		implements LogsMasterRepository<DOMAIN, SUBJECT, SUBJECTID> {

	@Override
	protected JpaRepository<ENTITY, Long> repository() {
		return this.repositoryOfMaster();
	}

	protected abstract LogsMasterJpaRepository<ENTITY, DOMAIN, SUBJECT, SUBJECTID> repositoryOfMaster();

	@Override
	public List<DOMAIN> findBySubjectId(SUBJECTID subjectId) {
		return this.repositoryOfMaster().findBySubjectId(subjectId).stream().map(AbstractBaseEntity::toDomain).toList();
	}

	@Override
	public List<DOMAIN> findBySubjectIdAndIsDeletedFalse(SUBJECTID subjectId) {
		return this.repositoryOfMaster().findBySubjectIdAndIsDeleted(subjectId, false).stream().map(AbstractBaseEntity::toDomain).toList();
	}

	@Override
	public List<DOMAIN> findBySubjectIdAndIsDeletedTrue(SUBJECTID subjectId) {
		return this.repositoryOfMaster().findBySubjectIdAndIsDeleted(subjectId, true).stream().map(AbstractBaseEntity::toDomain).toList();
	}

}
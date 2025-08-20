package com.rendyrobbani.keuangan.persistence.repository.master;

import com.rendyrobbani.keuangan.core.domain.entity.master.DataMasterEntity;
import com.rendyrobbani.keuangan.core.domain.entity.master.SipdMasterEntity;
import com.rendyrobbani.keuangan.core.domain.repository.master.SipdMasterRepository;
import com.rendyrobbani.keuangan.persistence.entity.AbstractBaseEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.AbstractSipdMasterEntity;
import com.rendyrobbani.keuangan.persistence.repository.AbstractRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public abstract class AbstractSipdMasterRepository<
		ENTITY extends AbstractSipdMasterEntity<DOMAIN, SUBJECT, SUBJECTID, ID>,
		DOMAIN extends SipdMasterEntity<SUBJECT, SUBJECTID, ID>,
		SUBJECT extends DataMasterEntity<SUBJECTID>,
		SUBJECTID,
		ID
		>
		extends AbstractRepository<ENTITY, DOMAIN, ID>
		implements SipdMasterRepository<DOMAIN, SUBJECT, SUBJECTID, ID> {

	@Override
	protected JpaRepository<ENTITY, ID> repository() {
		return this.repositoryOfMaster();
	}

	protected abstract SipdMasterJpaRepository<ENTITY, DOMAIN, SUBJECT, SUBJECTID, ID> repositoryOfMaster();

	@Override
	public List<DOMAIN> findByIsDeletedFalse() {
		return this.repositoryOfMaster().findByIsDeleted(false).stream().map(AbstractBaseEntity::toDomain).toList();
	}

	@Override
	public List<DOMAIN> findByIsDeletedTrue() {
		return this.repositoryOfMaster().findByIsDeleted(true).stream().map(AbstractBaseEntity::toDomain).toList();
	}

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
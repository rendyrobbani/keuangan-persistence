package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening6.DataMasterRekening6;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.base.rekening6.DataMasterRekening6Repository;
import com.rendyrobbani.keuangan.persistence.entity.AbstractBaseEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.base.rekening6.AbstractDataMasterRekening6Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractDataMasterClassificationRepository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.DataMasterClassificationJpaRepository;

import java.util.List;

public abstract class AbstractDataMasterRekening6Repository<
		ENTITY extends AbstractDataMasterRekening6Entity<DOMAIN>,
		DOMAIN extends DataMasterRekening6
		>
		extends AbstractDataMasterClassificationRepository<ENTITY, DOMAIN>
		implements DataMasterRekening6Repository<DOMAIN> {

	@Override
	protected DataMasterClassificationJpaRepository<ENTITY, DOMAIN> repositoryOfMasterClassifcation() {
		return this.repositoryOfMasterRekening();
	}

	protected abstract DataMasterRekening6JpaRepository<ENTITY, DOMAIN> repositoryOfMasterRekening();

	@Override
	public List<DOMAIN> findByRekening1Id(String rekening1Id) {
		return this.repositoryOfMasterRekening().findByRekening1Id(rekening1Id).stream().map(AbstractBaseEntity::toDomain).toList();
	}

	@Override
	public List<DOMAIN> findByRekening1IdAndIsDeletedFalse(String rekening1Id) {
		return this.repositoryOfMasterRekening().findByRekening1IdAndIsDeleted(rekening1Id, false).stream().map(AbstractBaseEntity::toDomain).toList();
	}

	@Override
	public List<DOMAIN> findByRekening1IdAndIsDeletedTrue(String rekening1Id) {
		return this.repositoryOfMasterRekening().findByRekening1IdAndIsDeleted(rekening1Id, true).stream().map(AbstractBaseEntity::toDomain).toList();
	}

	@Override
	public List<DOMAIN> findByRekening2Id(String rekening2Id) {
		return this.repositoryOfMasterRekening().findByRekening2Id(rekening2Id).stream().map(AbstractBaseEntity::toDomain).toList();
	}

	@Override
	public List<DOMAIN> findByRekening2IdAndIsDeletedFalse(String rekening2Id) {
		return this.repositoryOfMasterRekening().findByRekening2IdAndIsDeleted(rekening2Id, false).stream().map(AbstractBaseEntity::toDomain).toList();
	}

	@Override
	public List<DOMAIN> findByRekening2IdAndIsDeletedTrue(String rekening2Id) {
		return this.repositoryOfMasterRekening().findByRekening2IdAndIsDeleted(rekening2Id, true).stream().map(AbstractBaseEntity::toDomain).toList();
	}

	@Override
	public List<DOMAIN> findByRekening3Id(String rekening3Id) {
		return this.repositoryOfMasterRekening().findByRekening3Id(rekening3Id).stream().map(AbstractBaseEntity::toDomain).toList();
	}

	@Override
	public List<DOMAIN> findByRekening3IdAndIsDeletedFalse(String rekening3Id) {
		return this.repositoryOfMasterRekening().findByRekening3IdAndIsDeleted(rekening3Id, false).stream().map(AbstractBaseEntity::toDomain).toList();
	}

	@Override
	public List<DOMAIN> findByRekening3IdAndIsDeletedTrue(String rekening3Id) {
		return this.repositoryOfMasterRekening().findByRekening3IdAndIsDeleted(rekening3Id, true).stream().map(AbstractBaseEntity::toDomain).toList();
	}

	@Override
	public List<DOMAIN> findByRekening4Id(String rekening4Id) {
		return this.repositoryOfMasterRekening().findByRekening4Id(rekening4Id).stream().map(AbstractBaseEntity::toDomain).toList();
	}

	@Override
	public List<DOMAIN> findByRekening4IdAndIsDeletedFalse(String rekening4Id) {
		return this.repositoryOfMasterRekening().findByRekening4IdAndIsDeleted(rekening4Id, false).stream().map(AbstractBaseEntity::toDomain).toList();
	}

	@Override
	public List<DOMAIN> findByRekening4IdAndIsDeletedTrue(String rekening4Id) {
		return this.repositoryOfMasterRekening().findByRekening4IdAndIsDeleted(rekening4Id, true).stream().map(AbstractBaseEntity::toDomain).toList();
	}

	@Override
	public List<DOMAIN> findByRekening5Id(String rekening5Id) {
		return this.repositoryOfMasterRekening().findByRekening5Id(rekening5Id).stream().map(AbstractBaseEntity::toDomain).toList();
	}

	@Override
	public List<DOMAIN> findByRekening5IdAndIsDeletedFalse(String rekening5Id) {
		return this.repositoryOfMasterRekening().findByRekening5IdAndIsDeleted(rekening5Id, false).stream().map(AbstractBaseEntity::toDomain).toList();
	}

	@Override
	public List<DOMAIN> findByRekening5IdAndIsDeletedTrue(String rekening5Id) {
		return this.repositoryOfMasterRekening().findByRekening5IdAndIsDeleted(rekening5Id, true).stream().map(AbstractBaseEntity::toDomain).toList();
	}

}
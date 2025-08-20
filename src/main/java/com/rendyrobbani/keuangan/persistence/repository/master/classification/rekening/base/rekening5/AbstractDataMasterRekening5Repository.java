package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening5.DataMasterRekening5;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.base.rekening5.DataMasterRekening5Repository;
import com.rendyrobbani.keuangan.persistence.entity.AbstractBaseEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.base.rekening5.AbstractDataMasterRekening5Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractDataMasterClassificationRepository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.DataMasterClassificationJpaRepository;

import java.util.List;

public abstract class AbstractDataMasterRekening5Repository<
		ENTITY extends AbstractDataMasterRekening5Entity<DOMAIN>,
		DOMAIN extends DataMasterRekening5
		>
		extends AbstractDataMasterClassificationRepository<ENTITY, DOMAIN>
		implements DataMasterRekening5Repository<DOMAIN> {

	@Override
	protected DataMasterClassificationJpaRepository<ENTITY, DOMAIN> repositoryOfMasterClassifcation() {
		return this.repositoryOfMasterRekening();
	}

	protected abstract DataMasterRekening5JpaRepository<ENTITY, DOMAIN> repositoryOfMasterRekening();

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

}
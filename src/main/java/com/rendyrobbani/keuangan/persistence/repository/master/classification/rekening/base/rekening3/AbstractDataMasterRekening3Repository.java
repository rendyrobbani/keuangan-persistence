package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening3.DataMasterRekening3;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.base.rekening3.DataMasterRekening3Repository;
import com.rendyrobbani.keuangan.persistence.entity.AbstractBaseEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.base.rekening3.AbstractDataMasterRekening3Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractDataMasterClassificationRepository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.DataMasterClassificationJpaRepository;

import java.util.List;

public abstract class AbstractDataMasterRekening3Repository<
		ENTITY extends AbstractDataMasterRekening3Entity<DOMAIN>,
		DOMAIN extends DataMasterRekening3
		>
		extends AbstractDataMasterClassificationRepository<ENTITY, DOMAIN>
		implements DataMasterRekening3Repository<DOMAIN> {

	@Override
	protected DataMasterClassificationJpaRepository<ENTITY, DOMAIN> repositoryOfMasterClassifcation() {
		return this.repositoryOfMasterRekening();
	}

	protected abstract DataMasterRekening3JpaRepository<ENTITY, DOMAIN> repositoryOfMasterRekening();

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

}
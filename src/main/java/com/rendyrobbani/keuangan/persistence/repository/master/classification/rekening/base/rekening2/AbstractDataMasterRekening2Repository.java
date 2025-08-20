package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening2.DataMasterRekening2;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.base.rekening2.DataMasterRekening2Repository;
import com.rendyrobbani.keuangan.persistence.entity.AbstractBaseEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.base.rekening2.AbstractDataMasterRekening2Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractDataMasterClassificationRepository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.DataMasterClassificationJpaRepository;

import java.util.List;

public abstract class AbstractDataMasterRekening2Repository<
		ENTITY extends AbstractDataMasterRekening2Entity<DOMAIN>,
		DOMAIN extends DataMasterRekening2
		>
		extends AbstractDataMasterClassificationRepository<ENTITY, DOMAIN>
		implements DataMasterRekening2Repository<DOMAIN> {

	@Override
	protected DataMasterClassificationJpaRepository<ENTITY, DOMAIN> repositoryOfMasterClassifcation() {
		return this.repositoryOfMasterRekening();
	}

	protected abstract DataMasterRekening2JpaRepository<ENTITY, DOMAIN> repositoryOfMasterRekening();

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

}
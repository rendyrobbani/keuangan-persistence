package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.rekening1;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening1.DataMasterRekening1;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.base.rekening1.DataMasterRekening1Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.rekening1.AbstractDataMasterRekening1Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractDataMasterClassificationRepository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.DataMasterClassificationJpaRepository;

public abstract class AbstractDataMasterRekening1Repository<
		ENTITY extends AbstractDataMasterRekening1Entity<DOMAIN>,
		DOMAIN extends DataMasterRekening1
		>
		extends AbstractDataMasterClassificationRepository<ENTITY, DOMAIN>
		implements DataMasterRekening1Repository<DOMAIN> {

	@Override
	protected DataMasterClassificationJpaRepository<ENTITY, DOMAIN> repositoryOfMasterClassifcation() {
		return this.repositoryOfMasterRekening();
	}

	protected abstract DataMasterRekening1JpaRepository<ENTITY, DOMAIN> repositoryOfMasterRekening();

}
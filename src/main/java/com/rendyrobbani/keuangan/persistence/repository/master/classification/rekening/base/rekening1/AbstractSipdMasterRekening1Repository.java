package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening1.DataMasterRekening1;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening1.SipdMasterRekening1;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.base.rekening1.SipdMasterRekening1Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.base.rekening1.AbstractSipdMasterRekening1Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractSipdMasterClassificationRepository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.SipdMasterClassificationJpaRepository;

public abstract class AbstractSipdMasterRekening1Repository<
		ENTITY extends AbstractSipdMasterRekening1Entity<DOMAIN, SUBJECT>,
		DOMAIN extends SipdMasterRekening1<SUBJECT>,
		SUBJECT extends DataMasterRekening1
		>
		extends AbstractSipdMasterClassificationRepository<ENTITY, DOMAIN, SUBJECT>
		implements SipdMasterRekening1Repository<DOMAIN, SUBJECT> {

	@Override
	protected SipdMasterClassificationJpaRepository<ENTITY, DOMAIN, SUBJECT> repositoryOfMasterClassification() {
		return this.repositoryOfMasterRekening();
	}

	protected abstract SipdMasterRekening1JpaRepository<ENTITY, DOMAIN, SUBJECT> repositoryOfMasterRekening();

}
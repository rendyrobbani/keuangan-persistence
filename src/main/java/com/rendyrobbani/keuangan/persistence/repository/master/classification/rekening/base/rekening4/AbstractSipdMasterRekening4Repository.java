package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening4.DataMasterRekening4;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening4.SipdMasterRekening4;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.base.rekening4.SipdMasterRekening4Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.base.rekening4.AbstractSipdMasterRekening4Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractSipdMasterClassificationRepository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.SipdMasterClassificationJpaRepository;

public abstract class AbstractSipdMasterRekening4Repository<
		ENTITY extends AbstractSipdMasterRekening4Entity<DOMAIN, SUBJECT>,
		DOMAIN extends SipdMasterRekening4<SUBJECT>,
		SUBJECT extends DataMasterRekening4
		>
		extends AbstractSipdMasterClassificationRepository<ENTITY, DOMAIN, SUBJECT>
		implements SipdMasterRekening4Repository<DOMAIN, SUBJECT> {

	@Override
	protected SipdMasterClassificationJpaRepository<ENTITY, DOMAIN, SUBJECT> repositoryOfMasterClassification() {
		return this.repositoryOfMasterRekening();
	}

	protected abstract SipdMasterRekening4JpaRepository<ENTITY, DOMAIN, SUBJECT> repositoryOfMasterRekening();

}
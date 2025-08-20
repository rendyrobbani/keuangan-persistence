package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening6.DataMasterRekening6;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening6.SipdMasterRekening6;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.base.rekening6.SipdMasterRekening6Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.base.rekening6.AbstractSipdMasterRekening6Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractSipdMasterClassificationRepository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.SipdMasterClassificationJpaRepository;

public abstract class AbstractSipdMasterRekening6Repository<
		ENTITY extends AbstractSipdMasterRekening6Entity<DOMAIN, SUBJECT>,
		DOMAIN extends SipdMasterRekening6<SUBJECT>,
		SUBJECT extends DataMasterRekening6
		>
		extends AbstractSipdMasterClassificationRepository<ENTITY, DOMAIN, SUBJECT>
		implements SipdMasterRekening6Repository<DOMAIN, SUBJECT> {

	@Override
	protected SipdMasterClassificationJpaRepository<ENTITY, DOMAIN, SUBJECT> repositoryOfMasterClassification() {
		return this.repositoryOfMasterRekening();
	}

	protected abstract SipdMasterRekening6JpaRepository<ENTITY, DOMAIN, SUBJECT> repositoryOfMasterRekening();

}
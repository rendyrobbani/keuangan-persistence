package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening2.DataMasterRekening2;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening2.SipdMasterRekening2;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.base.rekening2.SipdMasterRekening2Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.base.rekening2.AbstractSipdMasterRekening2Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractSipdMasterClassificationRepository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.SipdMasterClassificationJpaRepository;

public abstract class AbstractSipdMasterRekening2Repository<
		ENTITY extends AbstractSipdMasterRekening2Entity<DOMAIN, SUBJECT>,
		DOMAIN extends SipdMasterRekening2<SUBJECT>,
		SUBJECT extends DataMasterRekening2
		>
		extends AbstractSipdMasterClassificationRepository<ENTITY, DOMAIN, SUBJECT>
		implements SipdMasterRekening2Repository<DOMAIN, SUBJECT> {

	@Override
	protected SipdMasterClassificationJpaRepository<ENTITY, DOMAIN, SUBJECT> repositoryOfMasterClassification() {
		return this.repositoryOfMasterRekening();
	}

	protected abstract SipdMasterRekening2JpaRepository<ENTITY, DOMAIN, SUBJECT> repositoryOfMasterRekening();

}
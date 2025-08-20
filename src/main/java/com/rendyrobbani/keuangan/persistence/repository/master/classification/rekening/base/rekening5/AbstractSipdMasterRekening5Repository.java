package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening5.DataMasterRekening5;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening5.SipdMasterRekening5;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.base.rekening5.SipdMasterRekening5Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.base.rekening5.AbstractSipdMasterRekening5Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractSipdMasterClassificationRepository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.SipdMasterClassificationJpaRepository;

public abstract class AbstractSipdMasterRekening5Repository<
		ENTITY extends AbstractSipdMasterRekening5Entity<DOMAIN, SUBJECT>,
		DOMAIN extends SipdMasterRekening5<SUBJECT>,
		SUBJECT extends DataMasterRekening5
		>
		extends AbstractSipdMasterClassificationRepository<ENTITY, DOMAIN, SUBJECT>
		implements SipdMasterRekening5Repository<DOMAIN, SUBJECT> {

	@Override
	protected SipdMasterClassificationJpaRepository<ENTITY, DOMAIN, SUBJECT> repositoryOfMasterClassification() {
		return this.repositoryOfMasterRekening();
	}

	protected abstract SipdMasterRekening5JpaRepository<ENTITY, DOMAIN, SUBJECT> repositoryOfMasterRekening();

}
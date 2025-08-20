package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening3.DataMasterRekening3;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening3.SipdMasterRekening3;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.base.rekening3.SipdMasterRekening3Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.base.rekening3.AbstractSipdMasterRekening3Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractSipdMasterClassificationRepository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.SipdMasterClassificationJpaRepository;

public abstract class AbstractSipdMasterRekening3Repository<
		ENTITY extends AbstractSipdMasterRekening3Entity<DOMAIN, SUBJECT>,
		DOMAIN extends SipdMasterRekening3<SUBJECT>,
		SUBJECT extends DataMasterRekening3
		>
		extends AbstractSipdMasterClassificationRepository<ENTITY, DOMAIN, SUBJECT>
		implements SipdMasterRekening3Repository<DOMAIN, SUBJECT> {

	@Override
	protected SipdMasterClassificationJpaRepository<ENTITY, DOMAIN, SUBJECT> repositoryOfMasterClassification() {
		return this.repositoryOfMasterRekening();
	}

	protected abstract SipdMasterRekening3JpaRepository<ENTITY, DOMAIN, SUBJECT> repositoryOfMasterRekening();

}
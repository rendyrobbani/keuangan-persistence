package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening1.DataMasterRekening1;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening1.SipdMasterRekening1;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.base.rekening1.AbstractSipdMasterRekening1Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.SipdMasterClassificationJpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface SipdMasterRekening1JpaRepository<
		ENTITY extends AbstractSipdMasterRekening1Entity<DOMAIN, SUBJECT>,
		DOMAIN extends SipdMasterRekening1<SUBJECT>,
		SUBJECT extends DataMasterRekening1
		>
		extends SipdMasterClassificationJpaRepository<ENTITY, DOMAIN, SUBJECT> {

}
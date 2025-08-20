package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening4.DataMasterRekening4;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening4.SipdMasterRekening4;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.base.rekening4.AbstractSipdMasterRekening4Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.SipdMasterClassificationJpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface SipdMasterRekening4JpaRepository<
		ENTITY extends AbstractSipdMasterRekening4Entity<DOMAIN, SUBJECT>,
		DOMAIN extends SipdMasterRekening4<SUBJECT>,
		SUBJECT extends DataMasterRekening4
		>
		extends SipdMasterClassificationJpaRepository<ENTITY, DOMAIN, SUBJECT> {

}
package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening6.DataMasterRekening6;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening6.SipdMasterRekening6;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.base.rekening6.AbstractSipdMasterRekening6Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.SipdMasterClassificationJpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface SipdMasterRekening6JpaRepository<
		ENTITY extends AbstractSipdMasterRekening6Entity<DOMAIN, SUBJECT>,
		DOMAIN extends SipdMasterRekening6<SUBJECT>,
		SUBJECT extends DataMasterRekening6
		>
		extends SipdMasterClassificationJpaRepository<ENTITY, DOMAIN, SUBJECT> {

}
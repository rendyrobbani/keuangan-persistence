package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening2.DataMasterRekening2;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening2.SipdMasterRekening2;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.base.rekening2.AbstractSipdMasterRekening2Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.SipdMasterClassificationJpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface SipdMasterRekening2JpaRepository<
		ENTITY extends AbstractSipdMasterRekening2Entity<DOMAIN, SUBJECT>,
		DOMAIN extends SipdMasterRekening2<SUBJECT>,
		SUBJECT extends DataMasterRekening2
		>
		extends SipdMasterClassificationJpaRepository<ENTITY, DOMAIN, SUBJECT> {

}
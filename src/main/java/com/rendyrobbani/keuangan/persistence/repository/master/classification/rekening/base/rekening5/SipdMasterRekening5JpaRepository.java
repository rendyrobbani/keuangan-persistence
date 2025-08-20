package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening5.DataMasterRekening5;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening5.SipdMasterRekening5;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.base.rekening5.AbstractSipdMasterRekening5Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.SipdMasterClassificationJpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface SipdMasterRekening5JpaRepository<
		ENTITY extends AbstractSipdMasterRekening5Entity<DOMAIN, SUBJECT>,
		DOMAIN extends SipdMasterRekening5<SUBJECT>,
		SUBJECT extends DataMasterRekening5
		>
		extends SipdMasterClassificationJpaRepository<ENTITY, DOMAIN, SUBJECT> {

}
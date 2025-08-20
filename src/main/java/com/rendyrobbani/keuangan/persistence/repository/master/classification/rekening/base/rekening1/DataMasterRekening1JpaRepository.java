package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening1.DataMasterRekening1;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.base.rekening1.AbstractDataMasterRekening1Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.DataMasterClassificationJpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface DataMasterRekening1JpaRepository<
		ENTITY extends AbstractDataMasterRekening1Entity<DOMAIN>,
		DOMAIN extends DataMasterRekening1
		>
		extends DataMasterClassificationJpaRepository<ENTITY, DOMAIN> {

}
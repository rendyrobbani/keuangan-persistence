package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening2.DataMasterRekening2;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.base.rekening2.AbstractDataMasterRekening2Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.DataMasterClassificationJpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface DataMasterRekening2JpaRepository<
		ENTITY extends AbstractDataMasterRekening2Entity<DOMAIN>,
		DOMAIN extends DataMasterRekening2
		>
		extends DataMasterClassificationJpaRepository<ENTITY, DOMAIN> {

	List<ENTITY> findByRekening1Id(String rekening1Id);

	List<ENTITY> findByRekening1IdAndIsDeleted(String rekening1Id, boolean isDeleted);

}
package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening3.DataMasterRekening3;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.base.rekening3.AbstractDataMasterRekening3Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.DataMasterClassificationJpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface DataMasterRekening3JpaRepository<
		ENTITY extends AbstractDataMasterRekening3Entity<DOMAIN>,
		DOMAIN extends DataMasterRekening3
		>
		extends DataMasterClassificationJpaRepository<ENTITY, DOMAIN> {

	List<ENTITY> findByRekening1Id(String rekening1Id);

	List<ENTITY> findByRekening1IdAndIsDeleted(String rekening1Id, boolean isDeleted);

}
package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening4.DataMasterRekening4;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.base.rekening4.AbstractDataMasterRekening4Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.DataMasterClassificationJpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface DataMasterRekening4JpaRepository<
		ENTITY extends AbstractDataMasterRekening4Entity<DOMAIN>,
		DOMAIN extends DataMasterRekening4
		>
		extends DataMasterClassificationJpaRepository<ENTITY, DOMAIN> {

	List<ENTITY> findByRekening1Id(String rekening1Id);

	List<ENTITY> findByRekening1IdAndIsDeleted(String rekening1Id, boolean isDeleted);

	List<ENTITY> findByRekening2Id(String rekening2Id);

	List<ENTITY> findByRekening2IdAndIsDeleted(String rekening2Id, boolean isDeleted);

	List<ENTITY> findByRekening3Id(String rekening3Id);

	List<ENTITY> findByRekening3IdAndIsDeleted(String rekening3Id, boolean isDeleted);

}
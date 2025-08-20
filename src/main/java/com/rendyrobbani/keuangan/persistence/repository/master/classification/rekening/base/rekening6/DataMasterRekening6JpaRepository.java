package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening6.DataMasterRekening6;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.base.rekening6.AbstractDataMasterRekening6Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.DataMasterClassificationJpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface DataMasterRekening6JpaRepository<
		ENTITY extends AbstractDataMasterRekening6Entity<DOMAIN>,
		DOMAIN extends DataMasterRekening6
		>
		extends DataMasterClassificationJpaRepository<ENTITY, DOMAIN> {

	List<ENTITY> findByRekening1Id(String rekening1Id);

	List<ENTITY> findByRekening1IdAndIsDeleted(String rekening1Id, boolean isDeleted);

	List<ENTITY> findByRekening2Id(String rekening2Id);

	List<ENTITY> findByRekening2IdAndIsDeleted(String rekening2Id, boolean isDeleted);

	List<ENTITY> findByRekening3Id(String rekening3Id);

	List<ENTITY> findByRekening3IdAndIsDeleted(String rekening3Id, boolean isDeleted);

	List<ENTITY> findByRekening4Id(String rekening4Id);

	List<ENTITY> findByRekening4IdAndIsDeleted(String rekening4Id, boolean isDeleted);

	List<ENTITY> findByRekening5Id(String rekening5Id);

	List<ENTITY> findByRekening5IdAndIsDeleted(String rekening5Id, boolean isDeleted);

}
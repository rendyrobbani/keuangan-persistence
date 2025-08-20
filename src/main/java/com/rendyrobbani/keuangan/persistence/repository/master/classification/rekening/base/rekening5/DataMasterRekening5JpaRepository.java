package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening5.DataMasterRekening5;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.base.rekening5.AbstractDataMasterRekening5Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.DataMasterClassificationJpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface DataMasterRekening5JpaRepository<
		ENTITY extends AbstractDataMasterRekening5Entity<DOMAIN>,
		DOMAIN extends DataMasterRekening5
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

}
package com.rendyrobbani.keuangan.persistence.repository.master.priority;

import com.rendyrobbani.keuangan.core.domain.entity.master.priority.DataMasterPriorityEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.priority.AbstractDataMasterPriorityEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.DataMasterJpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface DataMasterPriorityJpaRepository<
		ENTITY extends AbstractDataMasterPriorityEntity<DOMAIN>,
		DOMAIN extends DataMasterPriorityEntity
		>
		extends DataMasterJpaRepository<ENTITY, DOMAIN, Long> {

	List<ENTITY> findByYear(Short year);

	List<ENTITY> findByYearAndIsDeleted(Short year, boolean isDeleted);

}
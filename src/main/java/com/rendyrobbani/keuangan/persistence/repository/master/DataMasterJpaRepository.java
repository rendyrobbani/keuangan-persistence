package com.rendyrobbani.keuangan.persistence.repository.master;

import com.rendyrobbani.keuangan.core.domain.entity.master.DataMasterEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.AbstractDataMasterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface DataMasterJpaRepository<
		ENTITY extends AbstractDataMasterEntity<DOMAIN, ID>,
		DOMAIN extends DataMasterEntity<ID>,
		ID
		>
		extends JpaRepository<ENTITY, ID> {

	List<ENTITY> findByIsDeleted(boolean isDeleted);

}
package com.rendyrobbani.keuangan.persistence.repository;

import com.rendyrobbani.keuangan.core.domain.entity.SelfEntity;
import com.rendyrobbani.keuangan.persistence.entity.AbstractSelfEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface SelfJpaRepository<
		ENTITY extends AbstractSelfEntity<DOMAIN>,
		DOMAIN extends SelfEntity
		>
		extends JpaRepository<ENTITY, Long> {

}
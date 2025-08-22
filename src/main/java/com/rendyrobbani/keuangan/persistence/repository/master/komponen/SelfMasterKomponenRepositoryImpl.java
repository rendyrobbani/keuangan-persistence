package com.rendyrobbani.keuangan.persistence.repository.master.komponen;

import com.rendyrobbani.keuangan.core.domain.entity.master.komponen.SelfMasterKomponen;
import com.rendyrobbani.keuangan.core.domain.repository.master.komponen.SelfMasterKomponenRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.komponen.SelfMasterKomponenEntity;
import com.rendyrobbani.keuangan.persistence.repository.AbstractRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SelfMasterKomponenRepositoryImpl extends AbstractRepository<SelfMasterKomponenEntity, SelfMasterKomponen, Long> implements SelfMasterKomponenRepository {

	private final SelfMasterKomponenJpaRepository repository;

	@Override
	protected JpaRepository<SelfMasterKomponenEntity, Long> repository() {
		return this.repository;
	}

}
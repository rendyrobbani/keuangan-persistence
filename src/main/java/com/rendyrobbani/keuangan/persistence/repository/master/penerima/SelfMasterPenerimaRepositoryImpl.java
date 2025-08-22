package com.rendyrobbani.keuangan.persistence.repository.master.penerima;

import com.rendyrobbani.keuangan.core.domain.entity.master.penerima.SelfMasterPenerima;
import com.rendyrobbani.keuangan.core.domain.repository.master.penerima.SelfMasterPenerimaRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.penerima.SelfMasterPenerimaEntity;
import com.rendyrobbani.keuangan.persistence.repository.AbstractRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SelfMasterPenerimaRepositoryImpl extends AbstractRepository<SelfMasterPenerimaEntity, SelfMasterPenerima, Long> implements SelfMasterPenerimaRepository {

	private final SelfMasterPenerimaJpaRepository repository;

	@Override
	protected JpaRepository<SelfMasterPenerimaEntity, Long> repository() {
		return this.repository;
	}

}
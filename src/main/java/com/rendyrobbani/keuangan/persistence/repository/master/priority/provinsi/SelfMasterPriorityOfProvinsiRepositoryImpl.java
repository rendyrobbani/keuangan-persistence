package com.rendyrobbani.keuangan.persistence.repository.master.priority.provinsi;

import com.rendyrobbani.keuangan.core.domain.entity.master.priority.provinsi.SelfMasterPriorityOfProvinsi;
import com.rendyrobbani.keuangan.core.domain.repository.master.priority.provinsi.SelfMasterPriorityOfProvinsiRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.priority.provinsi.SelfMasterPriorityOfProvinsiEntity;
import com.rendyrobbani.keuangan.persistence.repository.AbstractRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SelfMasterPriorityOfProvinsiRepositoryImpl extends AbstractRepository<SelfMasterPriorityOfProvinsiEntity, SelfMasterPriorityOfProvinsi, Long> implements SelfMasterPriorityOfProvinsiRepository {

	private final SelfMasterPriorityOfProvinsiJpaRepository repository;

	@Override
	protected JpaRepository<SelfMasterPriorityOfProvinsiEntity, Long> repository() {
		return this.repository;
	}

}
package com.rendyrobbani.keuangan.persistence.repository.master.priority.kabupaten;

import com.rendyrobbani.keuangan.core.domain.entity.master.priority.kabupaten.SelfMasterPriorityOfKabupaten;
import com.rendyrobbani.keuangan.core.domain.repository.master.priority.kabupaten.SelfMasterPriorityOfKabupatenRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.priority.kabupaten.SelfMasterPriorityOfKabupatenEntity;
import com.rendyrobbani.keuangan.persistence.repository.AbstractRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SelfMasterPriorityOfKabupatenRepositoryImpl extends AbstractRepository<SelfMasterPriorityOfKabupatenEntity, SelfMasterPriorityOfKabupaten, Long> implements SelfMasterPriorityOfKabupatenRepository {

	private final SelfMasterPriorityOfKabupatenJpaRepository repository;

	@Override
	protected JpaRepository<SelfMasterPriorityOfKabupatenEntity, Long> repository() {
		return this.repository;
	}

}
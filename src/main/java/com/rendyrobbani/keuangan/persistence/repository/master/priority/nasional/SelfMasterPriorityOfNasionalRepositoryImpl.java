package com.rendyrobbani.keuangan.persistence.repository.master.priority.nasional;

import com.rendyrobbani.keuangan.core.domain.entity.master.priority.nasional.SelfMasterPriorityOfNasional;
import com.rendyrobbani.keuangan.core.domain.repository.master.priority.nasional.SelfMasterPriorityOfNasionalRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.priority.nasional.SelfMasterPriorityOfNasionalEntity;
import com.rendyrobbani.keuangan.persistence.repository.AbstractRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SelfMasterPriorityOfNasionalRepositoryImpl extends AbstractRepository<SelfMasterPriorityOfNasionalEntity, SelfMasterPriorityOfNasional, Long> implements SelfMasterPriorityOfNasionalRepository {

	private final SelfMasterPriorityOfNasionalJpaRepository repository;

	@Override
	protected JpaRepository<SelfMasterPriorityOfNasionalEntity, Long> repository() {
		return this.repository;
	}

}
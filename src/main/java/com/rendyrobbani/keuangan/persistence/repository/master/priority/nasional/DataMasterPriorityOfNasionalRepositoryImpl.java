package com.rendyrobbani.keuangan.persistence.repository.master.priority.nasional;

import com.rendyrobbani.keuangan.core.domain.entity.master.priority.nasional.DataMasterPriorityOfNasional;
import com.rendyrobbani.keuangan.core.domain.repository.master.priority.nasional.DataMasterPriorityOfNasionalRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.priority.nasional.DataMasterPriorityOfNasionalEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.priority.AbstractDataMasterPriorityRepository;
import com.rendyrobbani.keuangan.persistence.repository.master.priority.DataMasterPriorityJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterPriorityOfNasionalRepositoryImpl extends AbstractDataMasterPriorityRepository<DataMasterPriorityOfNasionalEntity, DataMasterPriorityOfNasional> implements DataMasterPriorityOfNasionalRepository {

	private final DataMasterPriorityOfNasionalJpaRepository repository;

	@Override
	protected DataMasterPriorityJpaRepository<DataMasterPriorityOfNasionalEntity, DataMasterPriorityOfNasional> repositoryOfMasterPriority() {
		return this.repository;
	}

}
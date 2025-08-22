package com.rendyrobbani.keuangan.persistence.repository.master.priority.kabupaten;

import com.rendyrobbani.keuangan.core.domain.entity.master.priority.kabupaten.DataMasterPriorityOfKabupaten;
import com.rendyrobbani.keuangan.core.domain.repository.master.priority.kabupaten.DataMasterPriorityOfKabupatenRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.priority.kabupaten.DataMasterPriorityOfKabupatenEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.priority.AbstractDataMasterPriorityRepository;
import com.rendyrobbani.keuangan.persistence.repository.master.priority.DataMasterPriorityJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterPriorityOfKabupatenRepositoryImpl extends AbstractDataMasterPriorityRepository<DataMasterPriorityOfKabupatenEntity, DataMasterPriorityOfKabupaten> implements DataMasterPriorityOfKabupatenRepository {

	private final DataMasterPriorityOfKabupatenJpaRepository repository;

	@Override
	protected DataMasterPriorityJpaRepository<DataMasterPriorityOfKabupatenEntity, DataMasterPriorityOfKabupaten> repositoryOfMasterPriority() {
		return this.repository;
	}

}
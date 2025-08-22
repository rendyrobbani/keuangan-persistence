package com.rendyrobbani.keuangan.persistence.repository.master.priority.provinsi;

import com.rendyrobbani.keuangan.core.domain.entity.master.priority.provinsi.DataMasterPriorityOfProvinsi;
import com.rendyrobbani.keuangan.core.domain.repository.master.priority.provinsi.DataMasterPriorityOfProvinsiRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.priority.provinsi.DataMasterPriorityOfProvinsiEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.priority.AbstractDataMasterPriorityRepository;
import com.rendyrobbani.keuangan.persistence.repository.master.priority.DataMasterPriorityJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterPriorityOfProvinsiRepositoryImpl extends AbstractDataMasterPriorityRepository<DataMasterPriorityOfProvinsiEntity, DataMasterPriorityOfProvinsi> implements DataMasterPriorityOfProvinsiRepository {

	private final DataMasterPriorityOfProvinsiJpaRepository repository;

	@Override
	protected DataMasterPriorityJpaRepository<DataMasterPriorityOfProvinsiEntity, DataMasterPriorityOfProvinsi> repositoryOfMasterPriority() {
		return this.repository;
	}

}
package com.rendyrobbani.keuangan.persistence.repository.master.priority.kegiatan;

import com.rendyrobbani.keuangan.core.domain.entity.master.priority.kegiatan.DataMasterPriorityOfKegiatan;
import com.rendyrobbani.keuangan.core.domain.repository.master.priority.kegiatan.DataMasterPriorityOfKegiatanRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.priority.kegiatan.DataMasterPriorityOfKegiatanEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.priority.AbstractDataMasterPriorityRepository;
import com.rendyrobbani.keuangan.persistence.repository.master.priority.DataMasterPriorityJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterPriorityOfKegiatanRepositoryImpl extends AbstractDataMasterPriorityRepository<DataMasterPriorityOfKegiatanEntity, DataMasterPriorityOfKegiatan> implements DataMasterPriorityOfKegiatanRepository {

	private final DataMasterPriorityOfKegiatanJpaRepository repository;

	@Override
	protected DataMasterPriorityJpaRepository<DataMasterPriorityOfKegiatanEntity, DataMasterPriorityOfKegiatan> repositoryOfMasterPriority() {
		return this.repository;
	}

}
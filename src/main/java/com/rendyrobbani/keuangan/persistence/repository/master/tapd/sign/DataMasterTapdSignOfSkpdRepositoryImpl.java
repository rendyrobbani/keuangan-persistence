package com.rendyrobbani.keuangan.persistence.repository.master.tapd.sign;

import com.rendyrobbani.keuangan.core.domain.entity.master.tapd.sign.DataMasterTapdSignOfSkpd;
import com.rendyrobbani.keuangan.core.domain.repository.master.tapd.sign.DataMasterTapdSignOfSkpdRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.tapd.sign.DataMasterTapdSignOfSkpdEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.AbstractDataMasterRepository;
import com.rendyrobbani.keuangan.persistence.repository.master.DataMasterJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterTapdSignOfSkpdRepositoryImpl extends AbstractDataMasterRepository<DataMasterTapdSignOfSkpdEntity, DataMasterTapdSignOfSkpd, String> implements DataMasterTapdSignOfSkpdRepository {

	private final DataMasterTapdSignOfSkpdJpaRepository repository;

	@Override
	protected DataMasterJpaRepository<DataMasterTapdSignOfSkpdEntity, DataMasterTapdSignOfSkpd, String> repositoryOfMaster() {
		return this.repository;
	}

}
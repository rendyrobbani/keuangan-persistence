package com.rendyrobbani.keuangan.persistence.repository.master.mayor;

import com.rendyrobbani.keuangan.core.domain.entity.master.mayor.DataMasterMayor;
import com.rendyrobbani.keuangan.core.domain.repository.master.mayor.DataMasterMayorRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.mayor.DataMasterMayorEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.AbstractDataMasterRepository;
import com.rendyrobbani.keuangan.persistence.repository.master.DataMasterJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterMayorRepositoryImpl extends AbstractDataMasterRepository<DataMasterMayorEntity, DataMasterMayor, Byte> implements DataMasterMayorRepository {

	private final DataMasterMayorJpaRepository repository;

	@Override
	protected DataMasterJpaRepository<DataMasterMayorEntity, DataMasterMayor, Byte> repositoryOfMaster() {
		return this.repository;
	}

	@Override
	public DataMasterMayor find() {
		return this.repository.findById(DataMasterMayor.ID).map(DataMasterMayorEntity::toDomain).orElse(null);
	}

}
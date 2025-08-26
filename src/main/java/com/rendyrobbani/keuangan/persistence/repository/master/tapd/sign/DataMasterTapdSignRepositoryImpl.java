package com.rendyrobbani.keuangan.persistence.repository.master.tapd.sign;

import com.rendyrobbani.keuangan.core.domain.entity.master.tapd.sign.DataMasterTapdSign;
import com.rendyrobbani.keuangan.core.domain.repository.master.tapd.sign.DataMasterTapdSignRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.tapd.sign.DataMasterTapdSignEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.AbstractDataMasterRepository;
import com.rendyrobbani.keuangan.persistence.repository.master.DataMasterJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterTapdSignRepositoryImpl extends AbstractDataMasterRepository<DataMasterTapdSignEntity, DataMasterTapdSign, String> implements DataMasterTapdSignRepository {

	private final DataMasterTapdSignJpaRepository repository;

	@Override
	protected DataMasterJpaRepository<DataMasterTapdSignEntity, DataMasterTapdSign, String> repositoryOfMaster() {
		return this.repository;
	}

}
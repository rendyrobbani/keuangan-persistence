package com.rendyrobbani.keuangan.persistence.repository.master.tapd.sign;

import com.rendyrobbani.keuangan.core.domain.entity.master.tapd.sign.DataMasterTapdSign;
import com.rendyrobbani.keuangan.core.domain.entity.master.tapd.sign.LogsMasterTapdSign;
import com.rendyrobbani.keuangan.core.domain.repository.master.tapd.sign.LogsMasterTapdSignRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.tapd.sign.LogsMasterTapdSignEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.AbstractLogsMasterRepository;
import com.rendyrobbani.keuangan.persistence.repository.master.LogsMasterJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class LogsMasterTapdSignRepositoryImpl extends AbstractLogsMasterRepository<LogsMasterTapdSignEntity, LogsMasterTapdSign, DataMasterTapdSign, String> implements LogsMasterTapdSignRepository {

	private final LogsMasterTapdSignJpaRepository repository;

	@Override
	protected LogsMasterJpaRepository<LogsMasterTapdSignEntity, LogsMasterTapdSign, DataMasterTapdSign, String> repositoryOfMaster() {
		return this.repository;
	}

}
package com.rendyrobbani.keuangan.persistence.repository.master.tapd.sign;

import com.rendyrobbani.keuangan.core.domain.entity.master.tapd.sign.DataMasterTapdSign;
import com.rendyrobbani.keuangan.core.domain.entity.master.tapd.sign.LogsMasterTapdSign;
import com.rendyrobbani.keuangan.persistence.entity.master.tapd.sign.LogsMasterTapdSignEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.LogsMasterJpaRepository;

public interface LogsMasterTapdSignJpaRepository extends LogsMasterJpaRepository<LogsMasterTapdSignEntity, LogsMasterTapdSign, DataMasterTapdSign, String> {

}
package com.rendyrobbani.keuangan.persistence.repository.master.tapd.sign;

import com.rendyrobbani.keuangan.core.domain.entity.master.tapd.sign.DataMasterTapdSign;
import com.rendyrobbani.keuangan.persistence.entity.master.tapd.sign.DataMasterTapdSignEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.DataMasterJpaRepository;

import java.util.List;

public interface DataMasterTapdSignJpaRepository extends DataMasterJpaRepository<DataMasterTapdSignEntity, DataMasterTapdSign, String> {

	List<DataMasterTapdSignEntity> findByIsDeletedFalseAndIsLockedFalse();

}
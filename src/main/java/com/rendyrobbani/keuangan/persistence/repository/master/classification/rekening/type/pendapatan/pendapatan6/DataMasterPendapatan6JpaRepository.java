package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.pendapatan.pendapatan6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan.pendapatan6.DataMasterPendapatan6;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan6.DataMasterPendapatan6Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.DataMasterRekening6JpaRepository;

import java.util.List;

public interface DataMasterPendapatan6JpaRepository extends DataMasterRekening6JpaRepository<DataMasterPendapatan6Entity, DataMasterPendapatan6> {

	List<DataMasterPendapatan6Entity> findByIsEnabled(boolean isEnabled);

}
package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.pendapatan.pendapatan6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan.pendapatan6.DataMasterRekeningPendapatan6;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan6.DataMasterRekeningPendapatan6Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.DataMasterRekening6JpaRepository;

import java.util.List;

public interface DataMasterRekeningPendapatan6JpaRepository extends DataMasterRekening6JpaRepository<DataMasterRekeningPendapatan6Entity, DataMasterRekeningPendapatan6> {

	List<DataMasterRekeningPendapatan6Entity> findByIsEnabled(boolean isEnabled);

}
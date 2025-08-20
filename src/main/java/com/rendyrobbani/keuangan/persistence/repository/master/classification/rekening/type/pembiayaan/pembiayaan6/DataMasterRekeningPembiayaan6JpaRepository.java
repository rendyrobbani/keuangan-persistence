package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.pembiayaan.pembiayaan6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pembiayaan.pembiayaan6.DataMasterRekeningPembiayaan6;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pembiayaan.pembiayaan6.DataMasterRekeningPembiayaan6Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.DataMasterRekening6JpaRepository;

import java.util.List;

public interface DataMasterRekeningPembiayaan6JpaRepository extends DataMasterRekening6JpaRepository<DataMasterRekeningPembiayaan6Entity, DataMasterRekeningPembiayaan6> {

	List<DataMasterRekeningPembiayaan6Entity> findByIsEnabled(boolean isEnabled);

	List<DataMasterRekeningPembiayaan6Entity> findByIsIncomeIsTrue();

	List<DataMasterRekeningPembiayaan6Entity> findByIsIncomeIsTrueAndIsEnabled(boolean isEnabled);

	List<DataMasterRekeningPembiayaan6Entity> findByIsExpendIsTrue();

	List<DataMasterRekeningPembiayaan6Entity> findByIsExpendIsTrueAndIsEnabled(boolean isEnabled);

}
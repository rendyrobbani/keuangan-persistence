package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.pembiayaan.pembiayaan6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pembiayaan.pembiayaan6.DataMasterPembiayaan6;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pembiayaan.pembiayaan6.DataMasterPembiayaan6Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.DataMasterRekening6JpaRepository;

import java.util.List;

public interface DataMasterPembiayaan6JpaRepository extends DataMasterRekening6JpaRepository<DataMasterPembiayaan6Entity, DataMasterPembiayaan6> {

	List<DataMasterPembiayaan6Entity> findByIsEnabled(boolean isEnabled);

	List<DataMasterPembiayaan6Entity> findByIsIncomeIsTrue();

	List<DataMasterPembiayaan6Entity> findByIsIncomeIsTrueAndIsEnabled(boolean isEnabled);

	List<DataMasterPembiayaan6Entity> findByIsExpendIsTrue();

	List<DataMasterPembiayaan6Entity> findByIsExpendIsTrueAndIsEnabled(boolean isEnabled);

}
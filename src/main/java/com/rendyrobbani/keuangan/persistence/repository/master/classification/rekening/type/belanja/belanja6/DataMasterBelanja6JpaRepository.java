package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.belanja.belanja6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja6.DataMasterBelanja6;
import com.rendyrobbani.keuangan.core.domain.vo.BelanjaJenis;
import com.rendyrobbani.keuangan.core.domain.vo.BelanjaLokus;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja6.DataMasterBelanja6Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.DataMasterRekening6JpaRepository;

import java.util.List;

public interface DataMasterBelanja6JpaRepository extends DataMasterRekening6JpaRepository<DataMasterBelanja6Entity, DataMasterBelanja6> {

	List<DataMasterBelanja6Entity> findByIsEnabled(boolean isEnabled);

	List<DataMasterBelanja6Entity> findByJenis(BelanjaJenis jenis);

	List<DataMasterBelanja6Entity> findByJenisAndIsEnabled(BelanjaJenis jenis, boolean isEnabled);

	List<DataMasterBelanja6Entity> findByLokus(BelanjaLokus lokus);

	List<DataMasterBelanja6Entity> findByLokusAndIsEnabled(BelanjaLokus lokus, boolean isEnabled);

}
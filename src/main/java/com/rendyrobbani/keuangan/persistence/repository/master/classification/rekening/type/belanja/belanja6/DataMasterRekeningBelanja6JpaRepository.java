package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.belanja.belanja6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja6.DataMasterRekeningBelanja6;
import com.rendyrobbani.keuangan.core.domain.vo.BelanjaJenis;
import com.rendyrobbani.keuangan.core.domain.vo.BelanjaLokus;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja6.DataMasterRekeningBelanja6Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.DataMasterRekening6JpaRepository;

import java.util.List;

public interface DataMasterRekeningBelanja6JpaRepository extends DataMasterRekening6JpaRepository<DataMasterRekeningBelanja6Entity, DataMasterRekeningBelanja6> {

	List<DataMasterRekeningBelanja6Entity> findByIsEnabled(boolean isEnabled);

	List<DataMasterRekeningBelanja6Entity> findByJenis(BelanjaJenis jenis);

	List<DataMasterRekeningBelanja6Entity> findByJenisAndIsEnabled(BelanjaJenis jenis, boolean isEnabled);

	List<DataMasterRekeningBelanja6Entity> findByLokus(BelanjaLokus lokus);

	List<DataMasterRekeningBelanja6Entity> findByLokusAndIsEnabled(BelanjaLokus lokus, boolean isEnabled);

}
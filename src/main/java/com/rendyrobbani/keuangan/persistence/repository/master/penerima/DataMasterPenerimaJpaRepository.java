package com.rendyrobbani.keuangan.persistence.repository.master.penerima;

import com.rendyrobbani.keuangan.core.domain.entity.master.penerima.DataMasterPenerima;
import com.rendyrobbani.keuangan.core.domain.vo.PenerimaJenis;
import com.rendyrobbani.keuangan.persistence.entity.master.penerima.DataMasterPenerimaEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.DataMasterJpaRepository;

import java.util.List;

public interface DataMasterPenerimaJpaRepository extends DataMasterJpaRepository<DataMasterPenerimaEntity, DataMasterPenerima, Long> {

	List<DataMasterPenerimaEntity> findByName(String name);

	List<DataMasterPenerimaEntity> findByNameAndIsDeleted(String name, boolean isDeleted);

	List<DataMasterPenerimaEntity> findByJenis(PenerimaJenis jenis);

	List<DataMasterPenerimaEntity> findByJenisAndIsDeleted(PenerimaJenis jenis, boolean isDeleted);

}
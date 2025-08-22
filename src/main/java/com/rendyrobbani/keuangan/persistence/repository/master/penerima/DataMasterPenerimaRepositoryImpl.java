package com.rendyrobbani.keuangan.persistence.repository.master.penerima;

import com.rendyrobbani.keuangan.core.domain.entity.master.penerima.DataMasterPenerima;
import com.rendyrobbani.keuangan.core.domain.repository.master.penerima.DataMasterPenerimaRepository;
import com.rendyrobbani.keuangan.core.domain.vo.PenerimaJenis;
import com.rendyrobbani.keuangan.persistence.entity.master.penerima.DataMasterPenerimaEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.AbstractDataMasterRepository;
import com.rendyrobbani.keuangan.persistence.repository.master.DataMasterJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class DataMasterPenerimaRepositoryImpl extends AbstractDataMasterRepository<DataMasterPenerimaEntity, DataMasterPenerima, Long> implements DataMasterPenerimaRepository {

	private final DataMasterPenerimaJpaRepository repository;

	@Override
	protected DataMasterJpaRepository<DataMasterPenerimaEntity, DataMasterPenerima, Long> repositoryOfMaster() {
		return this.repository;
	}

	@Override
	public List<DataMasterPenerima> findByName(String name) {
		return this.repository.findByName(name).stream().map(DataMasterPenerimaEntity::toDomain).toList();
	}

	@Override
	public List<DataMasterPenerima> findByNameAndIsDeletedFalse(String name) {
		return this.repository.findByNameAndIsDeleted(name, false).stream().map(DataMasterPenerimaEntity::toDomain).toList();
	}

	@Override
	public List<DataMasterPenerima> findByNameAndIsDeletedTrue(String name) {
		return this.repository.findByNameAndIsDeleted(name, true).stream().map(DataMasterPenerimaEntity::toDomain).toList();
	}

	@Override
	public List<DataMasterPenerima> findByJenis(PenerimaJenis jenis) {
		return this.repository.findByJenis(jenis).stream().map(DataMasterPenerimaEntity::toDomain).toList();
	}

	@Override
	public List<DataMasterPenerima> findByJenisAndIsDeletedFalse(PenerimaJenis jenis) {
		return this.repository.findByJenisAndIsDeleted(jenis, false).stream().map(DataMasterPenerimaEntity::toDomain).toList();
	}

	@Override
	public List<DataMasterPenerima> findByJenisAndIsDeletedTrue(PenerimaJenis jenis) {
		return this.repository.findByJenisAndIsDeleted(jenis, true).stream().map(DataMasterPenerimaEntity::toDomain).toList();
	}

}
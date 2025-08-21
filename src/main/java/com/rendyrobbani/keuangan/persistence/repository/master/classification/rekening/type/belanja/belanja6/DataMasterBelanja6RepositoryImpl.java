package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.belanja.belanja6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja6.DataMasterBelanja6;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.belanja.belanja6.DataMasterBelanja6Repository;
import com.rendyrobbani.keuangan.core.domain.vo.BelanjaJenis;
import com.rendyrobbani.keuangan.core.domain.vo.BelanjaLokus;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja6.DataMasterBelanja6Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.AbstractDataMasterRekening6Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.DataMasterRekening6JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class DataMasterBelanja6RepositoryImpl extends AbstractDataMasterRekening6Repository<DataMasterBelanja6Entity, DataMasterBelanja6> implements DataMasterBelanja6Repository {

	private final DataMasterBelanja6JpaRepository repository;

	@Override
	protected DataMasterRekening6JpaRepository<DataMasterBelanja6Entity, DataMasterBelanja6> repositoryOfMasterRekening() {
		return this.repository;
	}

	@Override
	public List<DataMasterBelanja6> findByIsEnabledFalse() {
		return this.repository.findByIsEnabled(false).stream().map(DataMasterBelanja6Entity::toDomain).toList();
	}

	@Override
	public List<DataMasterBelanja6> findByIsEnabledTrue() {
		return this.repository.findByIsEnabled(true).stream().map(DataMasterBelanja6Entity::toDomain).toList();
	}

	@Override
	public List<DataMasterBelanja6> findByJenis(BelanjaJenis jenis) {
		return this.repository.findByJenis(jenis).stream().map(DataMasterBelanja6Entity::toDomain).toList();
	}

	@Override
	public List<DataMasterBelanja6> findByJenisIsEnabledFalse(BelanjaJenis jenis) {
		return this.repository.findByJenisAndIsEnabled(jenis, false).stream().map(DataMasterBelanja6Entity::toDomain).toList();
	}

	@Override
	public List<DataMasterBelanja6> findByJenisIsEnabledTrue(BelanjaJenis jenis) {
		return this.repository.findByJenisAndIsEnabled(jenis, true).stream().map(DataMasterBelanja6Entity::toDomain).toList();
	}

	@Override
	public List<DataMasterBelanja6> findByLokus(BelanjaLokus lokus) {
		return this.repository.findByLokus(lokus).stream().map(DataMasterBelanja6Entity::toDomain).toList();
	}

	@Override
	public List<DataMasterBelanja6> findByLokusIsEnabledFalse(BelanjaLokus lokus) {
		return this.repository.findByLokusAndIsEnabled(lokus, false).stream().map(DataMasterBelanja6Entity::toDomain).toList();
	}

	@Override
	public List<DataMasterBelanja6> findByLokusIsEnabledTrue(BelanjaLokus lokus) {
		return this.repository.findByLokusAndIsEnabled(lokus, true).stream().map(DataMasterBelanja6Entity::toDomain).toList();
	}

}
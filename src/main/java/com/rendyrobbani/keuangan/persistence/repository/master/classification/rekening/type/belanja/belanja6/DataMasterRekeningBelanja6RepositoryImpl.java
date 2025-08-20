package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.belanja.belanja6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja6.DataMasterRekeningBelanja6;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.belanja.belanja6.DataMasterRekeningBelanja6Repository;
import com.rendyrobbani.keuangan.core.domain.vo.BelanjaJenis;
import com.rendyrobbani.keuangan.core.domain.vo.BelanjaLokus;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja6.DataMasterRekeningBelanja6Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.AbstractDataMasterRekening6Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.DataMasterRekening6JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class DataMasterRekeningBelanja6RepositoryImpl extends AbstractDataMasterRekening6Repository<DataMasterRekeningBelanja6Entity, DataMasterRekeningBelanja6> implements DataMasterRekeningBelanja6Repository {

	private final DataMasterRekeningBelanja6JpaRepository repository;

	@Override
	protected DataMasterRekening6JpaRepository<DataMasterRekeningBelanja6Entity, DataMasterRekeningBelanja6> repositoryOfMasterRekening() {
		return this.repository;
	}

	@Override
	public List<DataMasterRekeningBelanja6> findByIsEnabledFalse() {
		return this.repository.findByIsEnabled(false).stream().map(DataMasterRekeningBelanja6Entity::toDomain).toList();
	}

	@Override
	public List<DataMasterRekeningBelanja6> findByIsEnabledTrue() {
		return this.repository.findByIsEnabled(true).stream().map(DataMasterRekeningBelanja6Entity::toDomain).toList();
	}

	@Override
	public List<DataMasterRekeningBelanja6> findByJenis(BelanjaJenis jenis) {
		return this.repository.findByJenis(jenis).stream().map(DataMasterRekeningBelanja6Entity::toDomain).toList();
	}

	@Override
	public List<DataMasterRekeningBelanja6> findByJenisIsEnabledFalse(BelanjaJenis jenis) {
		return this.repository.findByJenisAndIsEnabled(jenis, false).stream().map(DataMasterRekeningBelanja6Entity::toDomain).toList();
	}

	@Override
	public List<DataMasterRekeningBelanja6> findByJenisIsEnabledTrue(BelanjaJenis jenis) {
		return this.repository.findByJenisAndIsEnabled(jenis, true).stream().map(DataMasterRekeningBelanja6Entity::toDomain).toList();
	}

	@Override
	public List<DataMasterRekeningBelanja6> findByLokus(BelanjaLokus lokus) {
		return this.repository.findByLokus(lokus).stream().map(DataMasterRekeningBelanja6Entity::toDomain).toList();
	}

	@Override
	public List<DataMasterRekeningBelanja6> findByLokusIsEnabledFalse(BelanjaLokus lokus) {
		return this.repository.findByLokusAndIsEnabled(lokus, false).stream().map(DataMasterRekeningBelanja6Entity::toDomain).toList();
	}

	@Override
	public List<DataMasterRekeningBelanja6> findByLokusIsEnabledTrue(BelanjaLokus lokus) {
		return this.repository.findByLokusAndIsEnabled(lokus, true).stream().map(DataMasterRekeningBelanja6Entity::toDomain).toList();
	}

}
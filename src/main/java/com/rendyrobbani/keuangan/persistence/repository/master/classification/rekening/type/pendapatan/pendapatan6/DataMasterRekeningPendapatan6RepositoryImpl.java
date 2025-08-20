package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.pendapatan.pendapatan6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan.pendapatan6.DataMasterRekeningPendapatan6;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.pendapatan.pendapatan6.DataMasterRekeningPendapatan6Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan6.DataMasterRekeningPendapatan6Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.AbstractDataMasterRekening6Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.DataMasterRekening6JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class DataMasterRekeningPendapatan6RepositoryImpl extends AbstractDataMasterRekening6Repository<DataMasterRekeningPendapatan6Entity, DataMasterRekeningPendapatan6> implements DataMasterRekeningPendapatan6Repository {

	private final DataMasterRekeningPendapatan6JpaRepository repository;

	@Override
	protected DataMasterRekening6JpaRepository<DataMasterRekeningPendapatan6Entity, DataMasterRekeningPendapatan6> repositoryOfMasterRekening() {
		return this.repository;
	}

	@Override
	public List<DataMasterRekeningPendapatan6> findByIsEnabledFalse() {
		return this.repository.findByIsEnabled(false).stream().map(DataMasterRekeningPendapatan6Entity::toDomain).toList();
	}

	@Override
	public List<DataMasterRekeningPendapatan6> findByIsEnabledTrue() {
		return this.repository.findByIsEnabled(true).stream().map(DataMasterRekeningPendapatan6Entity::toDomain).toList();
	}

}
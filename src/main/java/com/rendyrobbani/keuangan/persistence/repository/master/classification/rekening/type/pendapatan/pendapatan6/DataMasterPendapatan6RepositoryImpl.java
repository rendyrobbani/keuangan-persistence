package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.pendapatan.pendapatan6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan.pendapatan6.DataMasterPendapatan6;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.pendapatan.pendapatan6.DataMasterPendapatan6Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan6.DataMasterPendapatan6Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.AbstractDataMasterRekening6Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.DataMasterRekening6JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class DataMasterPendapatan6RepositoryImpl extends AbstractDataMasterRekening6Repository<DataMasterPendapatan6Entity, DataMasterPendapatan6> implements DataMasterPendapatan6Repository {

	private final DataMasterPendapatan6JpaRepository repository;

	@Override
	protected DataMasterRekening6JpaRepository<DataMasterPendapatan6Entity, DataMasterPendapatan6> repositoryOfMasterRekening() {
		return this.repository;
	}

	@Override
	public List<DataMasterPendapatan6> findByIsEnabledFalse() {
		return this.repository.findByIsEnabled(false).stream().map(DataMasterPendapatan6Entity::toDomain).toList();
	}

	@Override
	public List<DataMasterPendapatan6> findByIsEnabledTrue() {
		return this.repository.findByIsEnabled(true).stream().map(DataMasterPendapatan6Entity::toDomain).toList();
	}

}
package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.pembiayaan.pembiayaan6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pembiayaan.pembiayaan6.DataMasterPembiayaan6;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.pembiayaan.pembiayaan6.DataMasterPembiayaan6Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pembiayaan.pembiayaan6.DataMasterPembiayaan6Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.AbstractDataMasterRekening6Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.DataMasterRekening6JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class DataMasterPembiayaan6RepositoryImpl extends AbstractDataMasterRekening6Repository<DataMasterPembiayaan6Entity, DataMasterPembiayaan6> implements DataMasterPembiayaan6Repository {

	private final DataMasterPembiayaan6JpaRepository repository;

	@Override
	protected DataMasterRekening6JpaRepository<DataMasterPembiayaan6Entity, DataMasterPembiayaan6> repositoryOfMasterRekening() {
		return this.repository;
	}

	@Override
	public List<DataMasterPembiayaan6> findByIsEnabledFalse() {
		return this.repository.findByIsEnabled(false).stream().map(DataMasterPembiayaan6Entity::toDomain).toList();
	}

	@Override
	public List<DataMasterPembiayaan6> findByIsEnabledTrue() {
		return this.repository.findByIsEnabled(true).stream().map(DataMasterPembiayaan6Entity::toDomain).toList();
	}

	@Override
	public List<DataMasterPembiayaan6> findByIsIncomeTrue() {
		return this.repository.findByIsIncomeIsTrue().stream().map(DataMasterPembiayaan6Entity::toDomain).toList();
	}

	@Override
	public List<DataMasterPembiayaan6> findByIsIncomeTrueIsEnabledFalse() {
		return this.repository.findByIsIncomeIsTrueAndIsEnabled(false).stream().map(DataMasterPembiayaan6Entity::toDomain).toList();
	}

	@Override
	public List<DataMasterPembiayaan6> findByIsIncomeTrueIsEnabledTrue() {
		return this.repository.findByIsIncomeIsTrueAndIsEnabled(true).stream().map(DataMasterPembiayaan6Entity::toDomain).toList();
	}

	@Override
	public List<DataMasterPembiayaan6> findByIsExpendTrue() {
		return this.repository.findByIsExpendIsTrue().stream().map(DataMasterPembiayaan6Entity::toDomain).toList();
	}

	@Override
	public List<DataMasterPembiayaan6> findByIsExpendTrueIsEnabledFalse() {
		return this.repository.findByIsExpendIsTrueAndIsEnabled(false).stream().map(DataMasterPembiayaan6Entity::toDomain).toList();
	}

	@Override
	public List<DataMasterPembiayaan6> findByIsExpendTrueIsEnabledTrue() {
		return this.repository.findByIsExpendIsTrueAndIsEnabled(true).stream().map(DataMasterPembiayaan6Entity::toDomain).toList();
	}

}
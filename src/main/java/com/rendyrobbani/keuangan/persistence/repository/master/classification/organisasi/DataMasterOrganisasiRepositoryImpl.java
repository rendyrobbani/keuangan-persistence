package com.rendyrobbani.keuangan.persistence.repository.master.classification.organisasi;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.organisasi.DataMasterOrganisasi;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.organisasi.DataMasterOrganisasiRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.organisasi.DataMasterOrganisasiEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractDataMasterClassificationRepository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.DataMasterClassificationJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class DataMasterOrganisasiRepositoryImpl extends AbstractDataMasterClassificationRepository<DataMasterOrganisasiEntity, DataMasterOrganisasi> implements DataMasterOrganisasiRepository {

	private final DataMasterOrganisasiJpaRepository repository;

	@Override
	protected DataMasterClassificationJpaRepository<DataMasterOrganisasiEntity, DataMasterOrganisasi> repositoryOfMasterClassifcation() {
		return this.repository;
	}

	@Override
	public List<DataMasterOrganisasi> findByIsSkpd() {
		return this.repository.findByIsSkpdTrue().stream().map(DataMasterOrganisasiEntity::toDomain).toList();
	}

	@Override
	public List<DataMasterOrganisasi> findByIsUnit() {
		return this.repository.findByIsUnitTrue().stream().map(DataMasterOrganisasiEntity::toDomain).toList();
	}

	@Override
	public List<DataMasterOrganisasi> findByIsUnitAndSkpdId(String skpdId) {
		return this.repository.findByIsUnitTrueAndSkpdId(skpdId).stream().map(DataMasterOrganisasiEntity::toDomain).toList();
	}

	@Override
	public DataMasterOrganisasi findByIsSetda() {
		return this.repository.findByIsSetdaTrue().map(DataMasterOrganisasiEntity::toDomain).orElse(null);
	}

	@Override
	public DataMasterOrganisasi findByIsSkpkd() {
		return this.repository.findByIsSkpkdTrue().map(DataMasterOrganisasiEntity::toDomain).orElse(null);
	}

}
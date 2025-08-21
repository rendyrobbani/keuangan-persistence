package com.rendyrobbani.keuangan.persistence.repository.master.classification.organisasi;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.organisasi.DataMasterOrganisasi;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.organisasi.DataMasterOrganisasiEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.DataMasterClassificationJpaRepository;

import java.util.List;
import java.util.Optional;

public interface DataMasterOrganisasiJpaRepository extends DataMasterClassificationJpaRepository<DataMasterOrganisasiEntity, DataMasterOrganisasi> {

	List<DataMasterOrganisasiEntity> findByIsSkpdTrue();

	List<DataMasterOrganisasiEntity> findByIsUnitTrue();

	List<DataMasterOrganisasiEntity> findByIsUnitTrueAndSkpdId(String skpdId);

	Optional<DataMasterOrganisasiEntity> findByIsSetdaTrue();

	Optional<DataMasterOrganisasiEntity> findByIsSkpkdTrue();

}
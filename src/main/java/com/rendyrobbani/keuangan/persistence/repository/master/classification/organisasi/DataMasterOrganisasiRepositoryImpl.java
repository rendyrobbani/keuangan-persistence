package com.rendyrobbani.keuangan.persistence.repository.master.classification.organisasi;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.organisasi.DataMasterOrganisasi;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.organisasi.DataMasterOrganisasiRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.organisasi.DataMasterOrganisasiEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractDataMasterClassificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class DataMasterOrganisasiRepositoryImpl extends AbstractDataMasterClassificationRepository<DataMasterOrganisasiEntity, DataMasterOrganisasi> implements DataMasterOrganisasiRepository {

	private final DataMasterOrganisasiJpaRepository repository;

	@Override
	protected JpaRepository<DataMasterOrganisasiEntity, String> repository() {
		return repository;
	}

	@Override
	public List<DataMasterOrganisasi> findByIsDeletedFalse() {
		return this.repository.findByIsDeleted(false).stream().map(DataMasterOrganisasiEntity::toDomain).toList();
	}

	@Override
	public List<DataMasterOrganisasi> findByIsDeletedTrue() {
		return this.repository.findByIsDeleted(true).stream().map(DataMasterOrganisasiEntity::toDomain).toList();
	}

}
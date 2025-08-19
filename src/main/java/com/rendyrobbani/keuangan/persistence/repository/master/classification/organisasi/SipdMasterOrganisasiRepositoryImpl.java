package com.rendyrobbani.keuangan.persistence.repository.master.classification.organisasi;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.organisasi.DataMasterOrganisasi;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.organisasi.SipdMasterOrganisasi;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.organisasi.SipdMasterOrganisasiRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.organisasi.SipdMasterOrganisasiEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractSipdMasterClassificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class SipdMasterOrganisasiRepositoryImpl extends AbstractSipdMasterClassificationRepository<SipdMasterOrganisasiEntity, SipdMasterOrganisasi, DataMasterOrganisasi> implements SipdMasterOrganisasiRepository {

	private final SipdMasterOrganisasiJpaRepository repository;

	@Override
	protected JpaRepository<SipdMasterOrganisasiEntity, Long> repository() {
		return repository;
	}

	@Override
	public List<SipdMasterOrganisasi> findByIsDeletedFalse() {
		return this.repository.findByIsDeleted(false).stream().map(SipdMasterOrganisasiEntity::toDomain).toList();
	}

	@Override
	public List<SipdMasterOrganisasi> findByIsDeletedTrue() {
		return this.repository.findByIsDeleted(true).stream().map(SipdMasterOrganisasiEntity::toDomain).toList();
	}

	@Override
	public List<SipdMasterOrganisasi> findBySubjectId(String subjectId) {
		return this.repository.findBySubjectId(subjectId).stream().map(SipdMasterOrganisasiEntity::toDomain).toList();
	}

	@Override
	public List<SipdMasterOrganisasi> findBySubjectIdAndIsDeletedFalse(String subjectId) {
		return this.repository.findBySubjectIdAndIsDeleted(subjectId, false).stream().map(SipdMasterOrganisasiEntity::toDomain).toList();
	}

	@Override
	public List<SipdMasterOrganisasi> findBySubjectIdAndIsDeletedTrue(String subjectId) {
		return this.repository.findBySubjectIdAndIsDeleted(subjectId, true).stream().map(SipdMasterOrganisasiEntity::toDomain).toList();
	}

}
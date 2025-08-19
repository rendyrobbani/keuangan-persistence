package com.rendyrobbani.keuangan.persistence.repository.master.classification.provinsi;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.provinsi.DataMasterProvinsi;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.provinsi.SipdMasterProvinsi;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.provinsi.SipdMasterProvinsiRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.provinsi.SipdMasterProvinsiEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractSipdMasterClassificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class SipdMasterProvinsiRepositoryImpl extends AbstractSipdMasterClassificationRepository<SipdMasterProvinsiEntity, SipdMasterProvinsi, DataMasterProvinsi> implements SipdMasterProvinsiRepository {

	private final SipdMasterProvinsiJpaRepository repository;

	@Override
	protected JpaRepository<SipdMasterProvinsiEntity, Long> repository() {
		return repository;
	}

	@Override
	public List<SipdMasterProvinsi> findByIsDeletedFalse() {
		return this.repository.findByIsDeleted(false).stream().map(SipdMasterProvinsiEntity::toDomain).toList();
	}

	@Override
	public List<SipdMasterProvinsi> findByIsDeletedTrue() {
		return this.repository.findByIsDeleted(true).stream().map(SipdMasterProvinsiEntity::toDomain).toList();
	}

	@Override
	public List<SipdMasterProvinsi> findBySubjectId(String subjectId) {
		return this.repository.findBySubjectId(subjectId).stream().map(SipdMasterProvinsiEntity::toDomain).toList();
	}

	@Override
	public List<SipdMasterProvinsi> findBySubjectIdAndIsDeletedFalse(String subjectId) {
		return this.repository.findBySubjectIdAndIsDeleted(subjectId, false).stream().map(SipdMasterProvinsiEntity::toDomain).toList();
	}

	@Override
	public List<SipdMasterProvinsi> findBySubjectIdAndIsDeletedTrue(String subjectId) {
		return this.repository.findBySubjectIdAndIsDeleted(subjectId, true).stream().map(SipdMasterProvinsiEntity::toDomain).toList();
	}

}
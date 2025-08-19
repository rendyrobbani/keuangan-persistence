package com.rendyrobbani.keuangan.persistence.repository.master.classification.kecamatan;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kecamatan.DataMasterKecamatan;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kecamatan.SipdMasterKecamatan;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.kecamatan.SipdMasterKecamatanRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.kecamatan.SipdMasterKecamatanEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractSipdMasterClassificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class SipdMasterKecamatanRepositoryImpl extends AbstractSipdMasterClassificationRepository<SipdMasterKecamatanEntity, SipdMasterKecamatan, DataMasterKecamatan> implements SipdMasterKecamatanRepository {

	private final SipdMasterKecamatanJpaRepository repository;

	@Override
	protected JpaRepository<SipdMasterKecamatanEntity, Long> repository() {
		return repository;
	}

	@Override
	public List<SipdMasterKecamatan> findByIsDeletedFalse() {
		return this.repository.findByIsDeleted(false).stream().map(SipdMasterKecamatanEntity::toDomain).toList();
	}

	@Override
	public List<SipdMasterKecamatan> findByIsDeletedTrue() {
		return this.repository.findByIsDeleted(true).stream().map(SipdMasterKecamatanEntity::toDomain).toList();
	}

	@Override
	public List<SipdMasterKecamatan> findBySubjectId(String subjectId) {
		return this.repository.findBySubjectId(subjectId).stream().map(SipdMasterKecamatanEntity::toDomain).toList();
	}

	@Override
	public List<SipdMasterKecamatan> findBySubjectIdAndIsDeletedFalse(String subjectId) {
		return this.repository.findBySubjectIdAndIsDeleted(subjectId, false).stream().map(SipdMasterKecamatanEntity::toDomain).toList();
	}

	@Override
	public List<SipdMasterKecamatan> findBySubjectIdAndIsDeletedTrue(String subjectId) {
		return this.repository.findBySubjectIdAndIsDeleted(subjectId, true).stream().map(SipdMasterKecamatanEntity::toDomain).toList();
	}

}
package com.rendyrobbani.keuangan.persistence.repository.master.classification.kabupaten;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kabupaten.DataMasterKabupaten;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kabupaten.SipdMasterKabupaten;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.kabupaten.SipdMasterKabupatenRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.kabupaten.SipdMasterKabupatenEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractSipdMasterClassificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class SipdMasterKabupatenRepositoryImpl extends AbstractSipdMasterClassificationRepository<SipdMasterKabupatenEntity, SipdMasterKabupaten, DataMasterKabupaten> implements SipdMasterKabupatenRepository {

	private final SipdMasterKabupatenJpaRepository repository;

	@Override
	protected JpaRepository<SipdMasterKabupatenEntity, Long> repository() {
		return repository;
	}

	@Override
	public List<SipdMasterKabupaten> findByIsDeletedFalse() {
		return this.repository.findByIsDeleted(false).stream().map(SipdMasterKabupatenEntity::toDomain).toList();
	}

	@Override
	public List<SipdMasterKabupaten> findByIsDeletedTrue() {
		return this.repository.findByIsDeleted(true).stream().map(SipdMasterKabupatenEntity::toDomain).toList();
	}

	@Override
	public List<SipdMasterKabupaten> findBySubjectId(String subjectId) {
		return this.repository.findBySubjectId(subjectId).stream().map(SipdMasterKabupatenEntity::toDomain).toList();
	}

	@Override
	public List<SipdMasterKabupaten> findBySubjectIdAndIsDeletedFalse(String subjectId) {
		return this.repository.findBySubjectIdAndIsDeleted(subjectId, false).stream().map(SipdMasterKabupatenEntity::toDomain).toList();
	}

	@Override
	public List<SipdMasterKabupaten> findBySubjectIdAndIsDeletedTrue(String subjectId) {
		return this.repository.findBySubjectIdAndIsDeleted(subjectId, true).stream().map(SipdMasterKabupatenEntity::toDomain).toList();
	}

}
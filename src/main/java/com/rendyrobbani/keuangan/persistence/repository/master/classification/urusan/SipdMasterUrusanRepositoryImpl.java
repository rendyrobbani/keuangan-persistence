package com.rendyrobbani.keuangan.persistence.repository.master.classification.urusan;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.urusan.DataMasterUrusan;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.urusan.SipdMasterUrusan;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.urusan.SipdMasterUrusanRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.urusan.SipdMasterUrusanEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractSipdMasterClassificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class SipdMasterUrusanRepositoryImpl extends AbstractSipdMasterClassificationRepository<SipdMasterUrusanEntity, SipdMasterUrusan, DataMasterUrusan> implements SipdMasterUrusanRepository {

	private final SipdMasterUrusanJpaRepository repository;

	@Override
	protected JpaRepository<SipdMasterUrusanEntity, Long> repository() {
		return repository;
	}

	@Override
	public List<SipdMasterUrusan> findByIsDeletedFalse() {
		return this.repository.findByIsDeleted(false).stream().map(SipdMasterUrusanEntity::toDomain).toList();
	}

	@Override
	public List<SipdMasterUrusan> findByIsDeletedTrue() {
		return this.repository.findByIsDeleted(true).stream().map(SipdMasterUrusanEntity::toDomain).toList();
	}

	@Override
	public List<SipdMasterUrusan> findBySubjectId(String subjectId) {
		return this.repository.findBySubjectId(subjectId).stream().map(SipdMasterUrusanEntity::toDomain).toList();
	}

	@Override
	public List<SipdMasterUrusan> findBySubjectIdAndIsDeletedFalse(String subjectId) {
		return this.repository.findBySubjectIdAndIsDeleted(subjectId, false).stream().map(SipdMasterUrusanEntity::toDomain).toList();
	}

	@Override
	public List<SipdMasterUrusan> findBySubjectIdAndIsDeletedTrue(String subjectId) {
		return this.repository.findBySubjectIdAndIsDeleted(subjectId, true).stream().map(SipdMasterUrusanEntity::toDomain).toList();
	}

}
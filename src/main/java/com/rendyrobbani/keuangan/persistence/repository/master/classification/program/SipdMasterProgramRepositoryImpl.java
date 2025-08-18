package com.rendyrobbani.keuangan.persistence.repository.master.classification.program;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.program.DataMasterProgram;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.program.SipdMasterProgram;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.program.SipdMasterProgramRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.program.SipdMasterProgramEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractSipdMasterClassificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class SipdMasterProgramRepositoryImpl extends AbstractSipdMasterClassificationRepository<SipdMasterProgramEntity, SipdMasterProgram, DataMasterProgram> implements SipdMasterProgramRepository {

	private final SipdMasterProgramJpaRepository repository;

	@Override
	protected JpaRepository<SipdMasterProgramEntity, Long> repository() {
		return repository;
	}

	@Override
	public List<SipdMasterProgram> findByIsDeletedFalse() {
		return this.repository.findByIsDeleted(false).stream().map(SipdMasterProgramEntity::toDomain).toList();
	}

	@Override
	public List<SipdMasterProgram> findByIsDeletedTrue() {
		return this.repository.findByIsDeleted(true).stream().map(SipdMasterProgramEntity::toDomain).toList();
	}

	@Override
	public List<SipdMasterProgram> findBySubjectId(String subjectId) {
		return this.repository.findBySubjectId(subjectId).stream().map(SipdMasterProgramEntity::toDomain).toList();
	}

	@Override
	public List<SipdMasterProgram> findBySubjectIdAndIsDeletedFalse(String subjectId) {
		return this.repository.findBySubjectIdAndIsDeleted(subjectId, false).stream().map(SipdMasterProgramEntity::toDomain).toList();
	}

	@Override
	public List<SipdMasterProgram> findBySubjectIdAndIsDeletedTrue(String subjectId) {
		return this.repository.findBySubjectIdAndIsDeleted(subjectId, true).stream().map(SipdMasterProgramEntity::toDomain).toList();
	}

}
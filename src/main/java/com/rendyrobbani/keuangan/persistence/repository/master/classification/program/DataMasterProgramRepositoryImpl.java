package com.rendyrobbani.keuangan.persistence.repository.master.classification.program;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.program.DataMasterProgram;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.program.DataMasterProgramRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.program.DataMasterProgramEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractDataMasterClassificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class DataMasterProgramRepositoryImpl extends AbstractDataMasterClassificationRepository<DataMasterProgramEntity, DataMasterProgram> implements DataMasterProgramRepository {

	private final DataMasterProgramJpaRepository repository;

	@Override
	protected JpaRepository<DataMasterProgramEntity, String> repository() {
		return repository;
	}

	@Override
	public List<DataMasterProgram> findByIsDeletedFalse() {
		return this.repository.findByIsDeleted(false).stream().map(DataMasterProgramEntity::toDomain).toList();
	}

	@Override
	public List<DataMasterProgram> findByIsDeletedTrue() {
		return this.repository.findByIsDeleted(true).stream().map(DataMasterProgramEntity::toDomain).toList();
	}

}
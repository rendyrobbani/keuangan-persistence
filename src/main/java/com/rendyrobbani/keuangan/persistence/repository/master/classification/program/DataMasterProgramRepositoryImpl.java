package com.rendyrobbani.keuangan.persistence.repository.master.classification.program;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.program.DataMasterProgram;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.program.DataMasterProgramRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.program.DataMasterProgramEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractDataMasterClassificationRepository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.DataMasterClassificationJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor

public class DataMasterProgramRepositoryImpl extends AbstractDataMasterClassificationRepository<DataMasterProgramEntity, DataMasterProgram> implements DataMasterProgramRepository {

	private final DataMasterProgramJpaRepository repository;

	@Override
	protected DataMasterClassificationJpaRepository<DataMasterProgramEntity, DataMasterProgram> repositoryOfMasterClassifcation() {
		return this.repository;
	}

}
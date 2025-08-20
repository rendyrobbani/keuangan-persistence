package com.rendyrobbani.keuangan.persistence.repository.master.classification.program;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.program.DataMasterProgram;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.program.SipdMasterProgram;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.program.SipdMasterProgramRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.program.SipdMasterProgramEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractSipdMasterClassificationRepository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.SipdMasterClassificationJpaRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Repository;



@Repository
@RequiredArgsConstructor

public class DataMasterProgramRepositoryImpl extends AbstractSipdMasterClassificationRepository<SipdMasterProgramEntity, SipdMasterProgram, DataMasterProgram> implements SipdMasterProgramRepository {

	private final DataMasterProgramJpaRepository repository;

	@Override
	protected SipdMasterClassificationJpaRepository<SipdMasterProgramEntity, SipdMasterProgram, DataMasterProgram> repositoryOfMasterClassifcation() {
		return this.repository;
	}

}
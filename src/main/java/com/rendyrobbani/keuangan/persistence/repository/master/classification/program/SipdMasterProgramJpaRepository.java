package com.rendyrobbani.keuangan.persistence.repository.master.classification.program;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.program.DataMasterProgram;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.program.SipdMasterProgram;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.program.SipdMasterProgramEntity;

import com.rendyrobbani.keuangan.persistence.repository.master.classification.SipdMasterClassificationJpaRepository;

public interface SipdMasterProgramJpaRepository extends SipdMasterClassificationJpaRepository<SipdMasterProgramEntity, SipdMasterProgram, DataMasterProgram> {}
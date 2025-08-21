package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.pembiayaan.pembiayaan4;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pembiayaan.pembiayaan4.DataMasterPembiayaan4;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pembiayaan.pembiayaan4.SipdMasterPembiayaan4;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.pembiayaan.pembiayaan4.SipdMasterPembiayaan4Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pembiayaan.pembiayaan4.SipdMasterPembiayaan4Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.AbstractSipdMasterRekening4Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.SipdMasterRekening4JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterPembiayaan4RepositoryImpl extends AbstractSipdMasterRekening4Repository<SipdMasterPembiayaan4Entity, SipdMasterPembiayaan4, DataMasterPembiayaan4> implements SipdMasterPembiayaan4Repository {

	private final SipdMasterPembiayaan4JpaRepository repository;

	@Override
	protected SipdMasterRekening4JpaRepository<SipdMasterPembiayaan4Entity, SipdMasterPembiayaan4, DataMasterPembiayaan4> repositoryOfMasterRekening() {
		return this.repository;
	}

}
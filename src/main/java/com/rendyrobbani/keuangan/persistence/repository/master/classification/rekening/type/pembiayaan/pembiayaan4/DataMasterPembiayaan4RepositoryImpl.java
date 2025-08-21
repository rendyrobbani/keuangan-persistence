package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.pembiayaan.pembiayaan4;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pembiayaan.pembiayaan4.DataMasterPembiayaan4;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.pembiayaan.pembiayaan4.DataMasterPembiayaan4Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pembiayaan.pembiayaan4.DataMasterPembiayaan4Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.AbstractDataMasterRekening4Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.DataMasterRekening4JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterPembiayaan4RepositoryImpl extends AbstractDataMasterRekening4Repository<DataMasterPembiayaan4Entity, DataMasterPembiayaan4> implements DataMasterPembiayaan4Repository {

	private final DataMasterPembiayaan4JpaRepository repository;

	@Override
	protected DataMasterRekening4JpaRepository<DataMasterPembiayaan4Entity, DataMasterPembiayaan4> repositoryOfMasterRekening() {
		return this.repository;
	}

}
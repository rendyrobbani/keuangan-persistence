package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.pembiayaan.pembiayaan4;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pembiayaan.pembiayaan4.DataMasterRekeningPembiayaan4;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.pembiayaan.pembiayaan4.DataMasterRekeningPembiayaan4Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pembiayaan.pembiayaan4.DataMasterRekeningPembiayaan4Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.AbstractDataMasterRekening4Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.DataMasterRekening4JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterRekeningPembiayaan4RepositoryImpl extends AbstractDataMasterRekening4Repository<DataMasterRekeningPembiayaan4Entity, DataMasterRekeningPembiayaan4> implements DataMasterRekeningPembiayaan4Repository {

	private final DataMasterRekeningPembiayaan4JpaRepository repository;

	@Override
	protected DataMasterRekening4JpaRepository<DataMasterRekeningPembiayaan4Entity, DataMasterRekeningPembiayaan4> repositoryOfMasterRekening() {
		return this.repository;
	}

}
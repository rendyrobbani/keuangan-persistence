package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.pembiayaan.pembiayaan1;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pembiayaan.pembiayaan1.DataMasterRekeningPembiayaan1;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.pembiayaan.pembiayaan1.DataMasterRekeningPembiayaan1Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pembiayaan.pembiayaan1.DataMasterRekeningPembiayaan1Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1.AbstractDataMasterRekening1Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1.DataMasterRekening1JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterRekeningPembiayaan1RepositoryImpl extends AbstractDataMasterRekening1Repository<DataMasterRekeningPembiayaan1Entity, DataMasterRekeningPembiayaan1> implements DataMasterRekeningPembiayaan1Repository {

	private final DataMasterRekeningPembiayaan1JpaRepository repository;

	@Override
	protected DataMasterRekening1JpaRepository<DataMasterRekeningPembiayaan1Entity, DataMasterRekeningPembiayaan1> repositoryOfMasterRekening() {
		return this.repository;
	}

}
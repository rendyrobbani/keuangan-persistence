package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.pembiayaan.pembiayaan1;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pembiayaan.pembiayaan1.DataMasterPembiayaan1;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.pembiayaan.pembiayaan1.DataMasterPembiayaan1Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pembiayaan.pembiayaan1.DataMasterPembiayaan1Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1.AbstractDataMasterRekening1Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1.DataMasterRekening1JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterPembiayaan1RepositoryImpl extends AbstractDataMasterRekening1Repository<DataMasterPembiayaan1Entity, DataMasterPembiayaan1> implements DataMasterPembiayaan1Repository {

	private final DataMasterPembiayaan1JpaRepository repository;

	@Override
	protected DataMasterRekening1JpaRepository<DataMasterPembiayaan1Entity, DataMasterPembiayaan1> repositoryOfMasterRekening() {
		return this.repository;
	}

}
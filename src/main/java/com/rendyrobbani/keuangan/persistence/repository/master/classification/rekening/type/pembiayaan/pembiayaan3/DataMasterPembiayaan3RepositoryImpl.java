package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.pembiayaan.pembiayaan3;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pembiayaan.pembiayaan3.DataMasterPembiayaan3;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.pembiayaan.pembiayaan3.DataMasterPembiayaan3Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pembiayaan.pembiayaan3.DataMasterPembiayaan3Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.AbstractDataMasterRekening3Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.DataMasterRekening3JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterPembiayaan3RepositoryImpl extends AbstractDataMasterRekening3Repository<DataMasterPembiayaan3Entity, DataMasterPembiayaan3> implements DataMasterPembiayaan3Repository {

	private final DataMasterPembiayaan3JpaRepository repository;

	@Override
	protected DataMasterRekening3JpaRepository<DataMasterPembiayaan3Entity, DataMasterPembiayaan3> repositoryOfMasterRekening() {
		return this.repository;
	}

}
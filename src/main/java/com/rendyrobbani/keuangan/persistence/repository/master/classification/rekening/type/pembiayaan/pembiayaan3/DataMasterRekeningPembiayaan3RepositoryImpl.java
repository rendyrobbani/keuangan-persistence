package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.pembiayaan.pembiayaan3;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pembiayaan.pembiayaan3.DataMasterRekeningPembiayaan3;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.pembiayaan.pembiayaan3.DataMasterRekeningPembiayaan3Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pembiayaan.pembiayaan3.DataMasterRekeningPembiayaan3Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.AbstractDataMasterRekening3Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.DataMasterRekening3JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterRekeningPembiayaan3RepositoryImpl extends AbstractDataMasterRekening3Repository<DataMasterRekeningPembiayaan3Entity, DataMasterRekeningPembiayaan3> implements DataMasterRekeningPembiayaan3Repository {

	private final DataMasterRekeningPembiayaan3JpaRepository repository;

	@Override
	protected DataMasterRekening3JpaRepository<DataMasterRekeningPembiayaan3Entity, DataMasterRekeningPembiayaan3> repositoryOfMasterRekening() {
		return this.repository;
	}

}
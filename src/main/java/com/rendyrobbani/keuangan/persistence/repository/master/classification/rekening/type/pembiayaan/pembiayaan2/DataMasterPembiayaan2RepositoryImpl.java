package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.pembiayaan.pembiayaan2;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pembiayaan.pembiayaan2.DataMasterPembiayaan2;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.pembiayaan.pembiayaan2.DataMasterPembiayaan2Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pembiayaan.pembiayaan2.DataMasterPembiayaan2Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.AbstractDataMasterRekening2Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.DataMasterRekening2JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterPembiayaan2RepositoryImpl extends AbstractDataMasterRekening2Repository<DataMasterPembiayaan2Entity, DataMasterPembiayaan2> implements DataMasterPembiayaan2Repository {

	private final DataMasterPembiayaan2JpaRepository repository;

	@Override
	protected DataMasterRekening2JpaRepository<DataMasterPembiayaan2Entity, DataMasterPembiayaan2> repositoryOfMasterRekening() {
		return this.repository;
	}

}
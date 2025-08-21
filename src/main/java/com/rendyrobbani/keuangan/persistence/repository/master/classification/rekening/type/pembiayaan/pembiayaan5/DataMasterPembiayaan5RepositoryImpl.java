package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.pembiayaan.pembiayaan5;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pembiayaan.pembiayaan5.DataMasterPembiayaan5;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.pembiayaan.pembiayaan5.DataMasterPembiayaan5Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pembiayaan.pembiayaan5.DataMasterPembiayaan5Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.AbstractDataMasterRekening5Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.DataMasterRekening5JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterPembiayaan5RepositoryImpl extends AbstractDataMasterRekening5Repository<DataMasterPembiayaan5Entity, DataMasterPembiayaan5> implements DataMasterPembiayaan5Repository {

	private final DataMasterPembiayaan5JpaRepository repository;

	@Override
	protected DataMasterRekening5JpaRepository<DataMasterPembiayaan5Entity, DataMasterPembiayaan5> repositoryOfMasterRekening() {
		return this.repository;
	}

}
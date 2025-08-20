package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.pembiayaan.pembiayaan5;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pembiayaan.pembiayaan5.DataMasterRekeningPembiayaan5;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.pembiayaan.pembiayaan5.DataMasterRekeningPembiayaan5Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pembiayaan.pembiayaan5.DataMasterRekeningPembiayaan5Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.AbstractDataMasterRekening5Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.DataMasterRekening5JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterRekeningPembiayaan5RepositoryImpl extends AbstractDataMasterRekening5Repository<DataMasterRekeningPembiayaan5Entity, DataMasterRekeningPembiayaan5> implements DataMasterRekeningPembiayaan5Repository {

	private final DataMasterRekeningPembiayaan5JpaRepository repository;

	@Override
	protected DataMasterRekening5JpaRepository<DataMasterRekeningPembiayaan5Entity, DataMasterRekeningPembiayaan5> repositoryOfMasterRekening() {
		return this.repository;
	}

}
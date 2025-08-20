package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.pembiayaan.pembiayaan2;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pembiayaan.pembiayaan2.DataMasterRekeningPembiayaan2;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.pembiayaan.pembiayaan2.DataMasterRekeningPembiayaan2Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pembiayaan.pembiayaan2.DataMasterRekeningPembiayaan2Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.AbstractDataMasterRekening2Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.DataMasterRekening2JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterRekeningPembiayaan2RepositoryImpl extends AbstractDataMasterRekening2Repository<DataMasterRekeningPembiayaan2Entity, DataMasterRekeningPembiayaan2> implements DataMasterRekeningPembiayaan2Repository {

	private final DataMasterRekeningPembiayaan2JpaRepository repository;

	@Override
	protected DataMasterRekening2JpaRepository<DataMasterRekeningPembiayaan2Entity, DataMasterRekeningPembiayaan2> repositoryOfMasterRekening() {
		return this.repository;
	}

}
package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.pembiayaan.pembiayaan6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pembiayaan.pembiayaan6.DataMasterRekeningPembiayaan6;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.pembiayaan.pembiayaan6.DataMasterRekeningPembiayaan6Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pembiayaan.pembiayaan6.DataMasterRekeningPembiayaan6Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.AbstractDataMasterRekening6Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.DataMasterRekening6JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterRekeningPembiayaan6RepositoryImpl extends AbstractDataMasterRekening6Repository<DataMasterRekeningPembiayaan6Entity, DataMasterRekeningPembiayaan6> implements DataMasterRekeningPembiayaan6Repository {

	private final DataMasterRekeningPembiayaan6JpaRepository repository;

	@Override
	protected DataMasterRekening6JpaRepository<DataMasterRekeningPembiayaan6Entity, DataMasterRekeningPembiayaan6> repositoryOfMasterRekening() {
		return this.repository;
	}

}
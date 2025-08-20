package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.kewajiban.kewajiban6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.kewajiban.kewajiban6.DataMasterRekeningKewajiban6;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.kewajiban.kewajiban6.DataMasterRekeningKewajiban6Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban6.DataMasterRekeningKewajiban6Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.AbstractDataMasterRekening6Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.DataMasterRekening6JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterRekeningKewajiban6RepositoryImpl extends AbstractDataMasterRekening6Repository<DataMasterRekeningKewajiban6Entity, DataMasterRekeningKewajiban6> implements DataMasterRekeningKewajiban6Repository {

	private final DataMasterRekeningKewajiban6JpaRepository repository;

	@Override
	protected DataMasterRekening6JpaRepository<DataMasterRekeningKewajiban6Entity, DataMasterRekeningKewajiban6> repositoryOfMasterRekening() {
		return this.repository;
	}

}
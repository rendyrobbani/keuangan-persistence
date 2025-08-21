package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.kewajiban.kewajiban6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.kewajiban.kewajiban6.DataMasterKewajiban6;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.kewajiban.kewajiban6.DataMasterKewajiban6Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban6.DataMasterKewajiban6Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.AbstractDataMasterRekening6Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.DataMasterRekening6JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterKewajiban6RepositoryImpl extends AbstractDataMasterRekening6Repository<DataMasterKewajiban6Entity, DataMasterKewajiban6> implements DataMasterKewajiban6Repository {

	private final DataMasterKewajiban6JpaRepository repository;

	@Override
	protected DataMasterRekening6JpaRepository<DataMasterKewajiban6Entity, DataMasterKewajiban6> repositoryOfMasterRekening() {
		return this.repository;
	}

}
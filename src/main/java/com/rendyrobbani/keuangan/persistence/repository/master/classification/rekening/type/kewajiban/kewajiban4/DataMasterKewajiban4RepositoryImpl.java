package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.kewajiban.kewajiban4;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.kewajiban.kewajiban4.DataMasterKewajiban4;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.kewajiban.kewajiban4.DataMasterKewajiban4Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban4.DataMasterKewajiban4Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.AbstractDataMasterRekening4Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.DataMasterRekening4JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterKewajiban4RepositoryImpl extends AbstractDataMasterRekening4Repository<DataMasterKewajiban4Entity, DataMasterKewajiban4> implements DataMasterKewajiban4Repository {

	private final DataMasterKewajiban4JpaRepository repository;

	@Override
	protected DataMasterRekening4JpaRepository<DataMasterKewajiban4Entity, DataMasterKewajiban4> repositoryOfMasterRekening() {
		return this.repository;
	}

}
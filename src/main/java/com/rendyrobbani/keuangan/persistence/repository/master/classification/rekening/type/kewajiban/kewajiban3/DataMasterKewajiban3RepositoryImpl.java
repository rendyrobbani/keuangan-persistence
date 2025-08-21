package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.kewajiban.kewajiban3;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.kewajiban.kewajiban3.DataMasterKewajiban3;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.kewajiban.kewajiban3.DataMasterKewajiban3Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban3.DataMasterKewajiban3Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.AbstractDataMasterRekening3Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.DataMasterRekening3JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterKewajiban3RepositoryImpl extends AbstractDataMasterRekening3Repository<DataMasterKewajiban3Entity, DataMasterKewajiban3> implements DataMasterKewajiban3Repository {

	private final DataMasterKewajiban3JpaRepository repository;

	@Override
	protected DataMasterRekening3JpaRepository<DataMasterKewajiban3Entity, DataMasterKewajiban3> repositoryOfMasterRekening() {
		return this.repository;
	}

}
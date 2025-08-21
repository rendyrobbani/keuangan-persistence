package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.kewajiban.kewajiban1;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.kewajiban.kewajiban1.DataMasterKewajiban1;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.kewajiban.kewajiban1.DataMasterKewajiban1Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban1.DataMasterKewajiban1Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1.AbstractDataMasterRekening1Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1.DataMasterRekening1JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterKewajiban1RepositoryImpl extends AbstractDataMasterRekening1Repository<DataMasterKewajiban1Entity, DataMasterKewajiban1> implements DataMasterKewajiban1Repository {

	private final DataMasterKewajiban1JpaRepository repository;

	@Override
	protected DataMasterRekening1JpaRepository<DataMasterKewajiban1Entity, DataMasterKewajiban1> repositoryOfMasterRekening() {
		return this.repository;
	}

}
package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.kewajiban.kewajiban1;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.kewajiban.kewajiban1.DataMasterRekeningKewajiban1;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.kewajiban.kewajiban1.DataMasterRekeningKewajiban1Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban1.DataMasterRekeningKewajiban1Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1.AbstractDataMasterRekening1Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1.DataMasterRekening1JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterRekeningKewajiban1RepositoryImpl extends AbstractDataMasterRekening1Repository<DataMasterRekeningKewajiban1Entity, DataMasterRekeningKewajiban1> implements DataMasterRekeningKewajiban1Repository {

	private final DataMasterRekeningKewajiban1JpaRepository repository;

	@Override
	protected DataMasterRekening1JpaRepository<DataMasterRekeningKewajiban1Entity, DataMasterRekeningKewajiban1> repositoryOfMasterRekening() {
		return this.repository;
	}

}
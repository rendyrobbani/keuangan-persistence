package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.kewajiban.kewajiban3;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.kewajiban.kewajiban3.DataMasterRekeningKewajiban3;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.kewajiban.kewajiban3.DataMasterRekeningKewajiban3Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban3.DataMasterRekeningKewajiban3Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.AbstractDataMasterRekening3Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.DataMasterRekening3JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterRekeningKewajiban3RepositoryImpl extends AbstractDataMasterRekening3Repository<DataMasterRekeningKewajiban3Entity, DataMasterRekeningKewajiban3> implements DataMasterRekeningKewajiban3Repository {

	private final DataMasterRekeningKewajiban3JpaRepository repository;

	@Override
	protected DataMasterRekening3JpaRepository<DataMasterRekeningKewajiban3Entity, DataMasterRekeningKewajiban3> repositoryOfMasterRekening() {
		return this.repository;
	}

}
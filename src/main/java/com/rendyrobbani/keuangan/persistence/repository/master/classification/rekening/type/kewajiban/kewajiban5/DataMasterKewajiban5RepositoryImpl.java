package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.kewajiban.kewajiban5;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.kewajiban.kewajiban5.DataMasterKewajiban5;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.kewajiban.kewajiban5.DataMasterKewajiban5Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban5.DataMasterKewajiban5Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.AbstractDataMasterRekening5Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.DataMasterRekening5JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterKewajiban5RepositoryImpl extends AbstractDataMasterRekening5Repository<DataMasterKewajiban5Entity, DataMasterKewajiban5> implements DataMasterKewajiban5Repository {

	private final DataMasterKewajiban5JpaRepository repository;

	@Override
	protected DataMasterRekening5JpaRepository<DataMasterKewajiban5Entity, DataMasterKewajiban5> repositoryOfMasterRekening() {
		return this.repository;
	}

}
package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.kewajiban.kewajiban4;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.kewajiban.kewajiban4.DataMasterRekeningKewajiban4;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.kewajiban.kewajiban4.DataMasterRekeningKewajiban4Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban4.DataMasterRekeningKewajiban4Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.AbstractDataMasterRekening4Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.DataMasterRekening4JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterRekeningKewajiban4RepositoryImpl extends AbstractDataMasterRekening4Repository<DataMasterRekeningKewajiban4Entity, DataMasterRekeningKewajiban4> implements DataMasterRekeningKewajiban4Repository {

	private final DataMasterRekeningKewajiban4JpaRepository repository;

	@Override
	protected DataMasterRekening4JpaRepository<DataMasterRekeningKewajiban4Entity, DataMasterRekeningKewajiban4> repositoryOfMasterRekening() {
		return this.repository;
	}

}
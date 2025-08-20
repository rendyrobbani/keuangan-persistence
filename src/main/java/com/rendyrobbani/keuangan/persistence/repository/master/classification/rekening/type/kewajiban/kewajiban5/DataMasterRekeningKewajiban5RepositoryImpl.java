package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.kewajiban.kewajiban5;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.kewajiban.kewajiban5.DataMasterRekeningKewajiban5;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.kewajiban.kewajiban5.DataMasterRekeningKewajiban5Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban5.DataMasterRekeningKewajiban5Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.AbstractDataMasterRekening5Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.DataMasterRekening5JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterRekeningKewajiban5RepositoryImpl extends AbstractDataMasterRekening5Repository<DataMasterRekeningKewajiban5Entity, DataMasterRekeningKewajiban5> implements DataMasterRekeningKewajiban5Repository {

	private final DataMasterRekeningKewajiban5JpaRepository repository;

	@Override
	protected DataMasterRekening5JpaRepository<DataMasterRekeningKewajiban5Entity, DataMasterRekeningKewajiban5> repositoryOfMasterRekening() {
		return this.repository;
	}

}
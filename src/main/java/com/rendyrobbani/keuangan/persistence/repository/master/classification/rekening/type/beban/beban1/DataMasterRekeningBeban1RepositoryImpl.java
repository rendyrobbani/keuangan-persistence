package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.beban.beban1;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban1.DataMasterRekeningBeban1;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.beban.beban1.DataMasterRekeningBeban1Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban1.DataMasterRekeningBeban1Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1.AbstractDataMasterRekening1Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1.DataMasterRekening1JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterRekeningBeban1RepositoryImpl extends AbstractDataMasterRekening1Repository<DataMasterRekeningBeban1Entity, DataMasterRekeningBeban1> implements DataMasterRekeningBeban1Repository {

	private final DataMasterRekeningBeban1JpaRepository repository;

	@Override
	protected DataMasterRekening1JpaRepository<DataMasterRekeningBeban1Entity, DataMasterRekeningBeban1> repositoryOfMasterRekening() {
		return this.repository;
	}

}
package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.beban.beban1;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban1.DataMasterBeban1;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.beban.beban1.DataMasterBeban1Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban1.DataMasterBeban1Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1.AbstractDataMasterRekening1Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1.DataMasterRekening1JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterBeban1RepositoryImpl extends AbstractDataMasterRekening1Repository<DataMasterBeban1Entity, DataMasterBeban1> implements DataMasterBeban1Repository {

	private final DataMasterBeban1JpaRepository repository;

	@Override
	protected DataMasterRekening1JpaRepository<DataMasterBeban1Entity, DataMasterBeban1> repositoryOfMasterRekening() {
		return this.repository;
	}

}
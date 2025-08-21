package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.beban.beban5;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban5.DataMasterBeban5;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.beban.beban5.DataMasterBeban5Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban5.DataMasterBeban5Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.AbstractDataMasterRekening5Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.DataMasterRekening5JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterBeban5RepositoryImpl extends AbstractDataMasterRekening5Repository<DataMasterBeban5Entity, DataMasterBeban5> implements DataMasterBeban5Repository {

	private final DataMasterBeban5JpaRepository repository;

	@Override
	protected DataMasterRekening5JpaRepository<DataMasterBeban5Entity, DataMasterBeban5> repositoryOfMasterRekening() {
		return this.repository;
	}

}
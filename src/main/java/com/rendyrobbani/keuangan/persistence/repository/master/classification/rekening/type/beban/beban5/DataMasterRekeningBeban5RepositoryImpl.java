package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.beban.beban5;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban5.DataMasterRekeningBeban5;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.beban.beban5.DataMasterRekeningBeban5Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban5.DataMasterRekeningBeban5Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.AbstractDataMasterRekening5Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.DataMasterRekening5JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterRekeningBeban5RepositoryImpl extends AbstractDataMasterRekening5Repository<DataMasterRekeningBeban5Entity, DataMasterRekeningBeban5> implements DataMasterRekeningBeban5Repository {

	private final DataMasterRekeningBeban5JpaRepository repository;

	@Override
	protected DataMasterRekening5JpaRepository<DataMasterRekeningBeban5Entity, DataMasterRekeningBeban5> repositoryOfMasterRekening() {
		return this.repository;
	}

}
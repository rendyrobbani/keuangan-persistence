package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.beban.beban4;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban4.DataMasterBeban4;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.beban.beban4.DataMasterBeban4Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban4.DataMasterBeban4Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.AbstractDataMasterRekening4Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.DataMasterRekening4JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterBeban4RepositoryImpl extends AbstractDataMasterRekening4Repository<DataMasterBeban4Entity, DataMasterBeban4> implements DataMasterBeban4Repository {

	private final DataMasterBeban4JpaRepository repository;

	@Override
	protected DataMasterRekening4JpaRepository<DataMasterBeban4Entity, DataMasterBeban4> repositoryOfMasterRekening() {
		return this.repository;
	}

}
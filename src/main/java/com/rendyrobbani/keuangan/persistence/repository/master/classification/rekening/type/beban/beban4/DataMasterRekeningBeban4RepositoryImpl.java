package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.beban.beban4;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban4.DataMasterRekeningBeban4;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.beban.beban4.DataMasterRekeningBeban4Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban4.DataMasterRekeningBeban4Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.AbstractDataMasterRekening4Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.DataMasterRekening4JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterRekeningBeban4RepositoryImpl extends AbstractDataMasterRekening4Repository<DataMasterRekeningBeban4Entity, DataMasterRekeningBeban4> implements DataMasterRekeningBeban4Repository {

	private final DataMasterRekeningBeban4JpaRepository repository;

	@Override
	protected DataMasterRekening4JpaRepository<DataMasterRekeningBeban4Entity, DataMasterRekeningBeban4> repositoryOfMasterRekening() {
		return this.repository;
	}

}
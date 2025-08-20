package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.aset.aset1;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset1.DataMasterRekeningAset1;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.aset.aset1.DataMasterRekeningAset1Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset1.DataMasterRekeningAset1Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1.AbstractDataMasterRekening1Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1.DataMasterRekening1JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterRekeningAset1RepositoryImpl extends AbstractDataMasterRekening1Repository<DataMasterRekeningAset1Entity, DataMasterRekeningAset1> implements DataMasterRekeningAset1Repository {

	private final DataMasterRekeningAset1JpaRepository repository;

	@Override
	protected DataMasterRekening1JpaRepository<DataMasterRekeningAset1Entity, DataMasterRekeningAset1> repositoryOfMasterRekening() {
		return this.repository;
	}

}
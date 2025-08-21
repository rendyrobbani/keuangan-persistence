package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.aset.aset1;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset1.DataMasterAset1;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.aset.aset1.DataMasterAset1Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset1.DataMasterAset1Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1.AbstractDataMasterRekening1Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1.DataMasterRekening1JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterAset1RepositoryImpl extends AbstractDataMasterRekening1Repository<DataMasterAset1Entity, DataMasterAset1> implements DataMasterAset1Repository {

	private final DataMasterAset1JpaRepository repository;

	@Override
	protected DataMasterRekening1JpaRepository<DataMasterAset1Entity, DataMasterAset1> repositoryOfMasterRekening() {
		return this.repository;
	}

}
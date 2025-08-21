package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.aset.aset3;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset3.DataMasterAset3;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.aset.aset3.DataMasterAset3Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset3.DataMasterAset3Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.AbstractDataMasterRekening3Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.DataMasterRekening3JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterAset3RepositoryImpl extends AbstractDataMasterRekening3Repository<DataMasterAset3Entity, DataMasterAset3> implements DataMasterAset3Repository {

	private final DataMasterAset3JpaRepository repository;

	@Override
	protected DataMasterRekening3JpaRepository<DataMasterAset3Entity, DataMasterAset3> repositoryOfMasterRekening() {
		return this.repository;
	}

}
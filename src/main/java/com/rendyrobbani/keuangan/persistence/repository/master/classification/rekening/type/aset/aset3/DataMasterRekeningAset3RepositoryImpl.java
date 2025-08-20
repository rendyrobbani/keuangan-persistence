package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.aset.aset3;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset3.DataMasterRekeningAset3;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.aset.aset3.DataMasterRekeningAset3Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset3.DataMasterRekeningAset3Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.AbstractDataMasterRekening3Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.DataMasterRekening3JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterRekeningAset3RepositoryImpl extends AbstractDataMasterRekening3Repository<DataMasterRekeningAset3Entity, DataMasterRekeningAset3> implements DataMasterRekeningAset3Repository {

	private final DataMasterRekeningAset3JpaRepository repository;

	@Override
	protected DataMasterRekening3JpaRepository<DataMasterRekeningAset3Entity, DataMasterRekeningAset3> repositoryOfMasterRekening() {
		return this.repository;
	}

}
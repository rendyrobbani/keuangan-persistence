package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.aset.aset6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset6.DataMasterAset6;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.aset.aset6.DataMasterAset6Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset6.DataMasterAset6Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.AbstractDataMasterRekening6Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.DataMasterRekening6JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterAset6RepositoryImpl extends AbstractDataMasterRekening6Repository<DataMasterAset6Entity, DataMasterAset6> implements DataMasterAset6Repository {

	private final DataMasterAset6JpaRepository repository;

	@Override
	protected DataMasterRekening6JpaRepository<DataMasterAset6Entity, DataMasterAset6> repositoryOfMasterRekening() {
		return this.repository;
	}

}
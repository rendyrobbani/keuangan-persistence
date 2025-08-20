package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.aset.aset6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset6.DataMasterRekeningAset6;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.aset.aset6.DataMasterRekeningAset6Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset6.DataMasterRekeningAset6Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.AbstractDataMasterRekening6Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.DataMasterRekening6JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterRekeningAset6RepositoryImpl extends AbstractDataMasterRekening6Repository<DataMasterRekeningAset6Entity, DataMasterRekeningAset6> implements DataMasterRekeningAset6Repository {

	private final DataMasterRekeningAset6JpaRepository repository;

	@Override
	protected DataMasterRekening6JpaRepository<DataMasterRekeningAset6Entity, DataMasterRekeningAset6> repositoryOfMasterRekening() {
		return this.repository;
	}

}
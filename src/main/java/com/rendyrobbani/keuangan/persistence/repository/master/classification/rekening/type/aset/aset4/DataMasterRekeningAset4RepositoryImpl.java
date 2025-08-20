package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.aset.aset4;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset4.DataMasterRekeningAset4;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.aset.aset4.DataMasterRekeningAset4Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset4.DataMasterRekeningAset4Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.AbstractDataMasterRekening4Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.DataMasterRekening4JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterRekeningAset4RepositoryImpl extends AbstractDataMasterRekening4Repository<DataMasterRekeningAset4Entity, DataMasterRekeningAset4> implements DataMasterRekeningAset4Repository {

	private final DataMasterRekeningAset4JpaRepository repository;

	@Override
	protected DataMasterRekening4JpaRepository<DataMasterRekeningAset4Entity, DataMasterRekeningAset4> repositoryOfMasterRekening() {
		return this.repository;
	}

}
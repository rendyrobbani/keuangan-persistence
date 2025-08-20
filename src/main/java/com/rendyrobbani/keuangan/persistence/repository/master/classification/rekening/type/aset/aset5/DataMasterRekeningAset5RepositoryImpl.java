package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.aset.aset5;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset5.DataMasterRekeningAset5;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.aset.aset5.DataMasterRekeningAset5Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset5.DataMasterRekeningAset5Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.AbstractDataMasterRekening5Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.DataMasterRekening5JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterRekeningAset5RepositoryImpl extends AbstractDataMasterRekening5Repository<DataMasterRekeningAset5Entity, DataMasterRekeningAset5> implements DataMasterRekeningAset5Repository {

	private final DataMasterRekeningAset5JpaRepository repository;

	@Override
	protected DataMasterRekening5JpaRepository<DataMasterRekeningAset5Entity, DataMasterRekeningAset5> repositoryOfMasterRekening() {
		return this.repository;
	}

}
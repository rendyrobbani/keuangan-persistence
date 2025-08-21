package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.aset.aset5;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset5.DataMasterAset5;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.aset.aset5.DataMasterAset5Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset5.DataMasterAset5Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.AbstractDataMasterRekening5Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.DataMasterRekening5JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterAset5RepositoryImpl extends AbstractDataMasterRekening5Repository<DataMasterAset5Entity, DataMasterAset5> implements DataMasterAset5Repository {

	private final DataMasterAset5JpaRepository repository;

	@Override
	protected DataMasterRekening5JpaRepository<DataMasterAset5Entity, DataMasterAset5> repositoryOfMasterRekening() {
		return this.repository;
	}

}
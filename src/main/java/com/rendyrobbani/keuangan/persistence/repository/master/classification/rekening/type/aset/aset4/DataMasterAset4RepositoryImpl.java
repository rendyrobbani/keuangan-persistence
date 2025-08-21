package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.aset.aset4;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset4.DataMasterAset4;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.aset.aset4.DataMasterAset4Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset4.DataMasterAset4Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.AbstractDataMasterRekening4Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.DataMasterRekening4JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterAset4RepositoryImpl extends AbstractDataMasterRekening4Repository<DataMasterAset4Entity, DataMasterAset4> implements DataMasterAset4Repository {

	private final DataMasterAset4JpaRepository repository;

	@Override
	protected DataMasterRekening4JpaRepository<DataMasterAset4Entity, DataMasterAset4> repositoryOfMasterRekening() {
		return this.repository;
	}

}
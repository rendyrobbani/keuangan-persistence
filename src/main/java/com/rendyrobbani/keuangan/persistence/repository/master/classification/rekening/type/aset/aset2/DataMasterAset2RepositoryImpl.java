package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.aset.aset2;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset2.DataMasterAset2;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.aset.aset2.DataMasterAset2Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset2.DataMasterAset2Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.AbstractDataMasterRekening2Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.DataMasterRekening2JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterAset2RepositoryImpl extends AbstractDataMasterRekening2Repository<DataMasterAset2Entity, DataMasterAset2> implements DataMasterAset2Repository {

	private final DataMasterAset2JpaRepository repository;

	@Override
	protected DataMasterRekening2JpaRepository<DataMasterAset2Entity, DataMasterAset2> repositoryOfMasterRekening() {
		return this.repository;
	}

}
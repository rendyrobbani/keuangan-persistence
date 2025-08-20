package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.aset.aset2;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset2.DataMasterRekeningAset2;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.aset.aset2.DataMasterRekeningAset2Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset2.DataMasterRekeningAset2Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.AbstractDataMasterRekening2Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.DataMasterRekening2JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterRekeningAset2RepositoryImpl extends AbstractDataMasterRekening2Repository<DataMasterRekeningAset2Entity, DataMasterRekeningAset2> implements DataMasterRekeningAset2Repository {

	private final DataMasterRekeningAset2JpaRepository repository;

	@Override
	protected DataMasterRekening2JpaRepository<DataMasterRekeningAset2Entity, DataMasterRekeningAset2> repositoryOfMasterRekening() {
		return this.repository;
	}

}
package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.belanja.belanja4;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja4.DataMasterBelanja4;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.belanja.belanja4.DataMasterBelanja4Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja4.DataMasterBelanja4Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.AbstractDataMasterRekening4Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.DataMasterRekening4JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterBelanja4RepositoryImpl extends AbstractDataMasterRekening4Repository<DataMasterBelanja4Entity, DataMasterBelanja4> implements DataMasterBelanja4Repository {

	private final DataMasterBelanja4JpaRepository repository;

	@Override
	protected DataMasterRekening4JpaRepository<DataMasterBelanja4Entity, DataMasterBelanja4> repositoryOfMasterRekening() {
		return this.repository;
	}

}
package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.belanja.belanja4;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja4.DataMasterRekeningBelanja4;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.belanja.belanja4.DataMasterRekeningBelanja4Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja4.DataMasterRekeningBelanja4Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.AbstractDataMasterRekening4Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.DataMasterRekening4JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterRekeningBelanja4RepositoryImpl extends AbstractDataMasterRekening4Repository<DataMasterRekeningBelanja4Entity, DataMasterRekeningBelanja4> implements DataMasterRekeningBelanja4Repository {

	private final DataMasterRekeningBelanja4JpaRepository repository;

	@Override
	protected DataMasterRekening4JpaRepository<DataMasterRekeningBelanja4Entity, DataMasterRekeningBelanja4> repositoryOfMasterRekening() {
		return this.repository;
	}

}
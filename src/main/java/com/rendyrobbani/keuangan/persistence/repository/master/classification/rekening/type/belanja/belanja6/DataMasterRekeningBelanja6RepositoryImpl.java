package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.belanja.belanja6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja6.DataMasterRekeningBelanja6;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.belanja.belanja6.DataMasterRekeningBelanja6Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja6.DataMasterRekeningBelanja6Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.AbstractDataMasterRekening6Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.DataMasterRekening6JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterRekeningBelanja6RepositoryImpl extends AbstractDataMasterRekening6Repository<DataMasterRekeningBelanja6Entity, DataMasterRekeningBelanja6> implements DataMasterRekeningBelanja6Repository {

	private final DataMasterRekeningBelanja6JpaRepository repository;

	@Override
	protected DataMasterRekening6JpaRepository<DataMasterRekeningBelanja6Entity, DataMasterRekeningBelanja6> repositoryOfMasterRekening() {
		return this.repository;
	}

}
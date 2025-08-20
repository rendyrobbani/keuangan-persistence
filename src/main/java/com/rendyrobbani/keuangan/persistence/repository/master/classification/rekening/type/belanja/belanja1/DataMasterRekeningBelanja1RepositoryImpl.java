package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.belanja.belanja1;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja1.DataMasterRekeningBelanja1;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.belanja.belanja1.DataMasterRekeningBelanja1Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja1.DataMasterRekeningBelanja1Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1.AbstractDataMasterRekening1Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1.DataMasterRekening1JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterRekeningBelanja1RepositoryImpl extends AbstractDataMasterRekening1Repository<DataMasterRekeningBelanja1Entity, DataMasterRekeningBelanja1> implements DataMasterRekeningBelanja1Repository {

	private final DataMasterRekeningBelanja1JpaRepository repository;

	@Override
	protected DataMasterRekening1JpaRepository<DataMasterRekeningBelanja1Entity, DataMasterRekeningBelanja1> repositoryOfMasterRekening() {
		return this.repository;
	}

}
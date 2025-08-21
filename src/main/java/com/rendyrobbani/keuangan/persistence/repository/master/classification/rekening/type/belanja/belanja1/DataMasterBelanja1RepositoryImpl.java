package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.belanja.belanja1;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja1.DataMasterBelanja1;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.belanja.belanja1.DataMasterBelanja1Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja1.DataMasterBelanja1Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1.AbstractDataMasterRekening1Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1.DataMasterRekening1JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterBelanja1RepositoryImpl extends AbstractDataMasterRekening1Repository<DataMasterBelanja1Entity, DataMasterBelanja1> implements DataMasterBelanja1Repository {

	private final DataMasterBelanja1JpaRepository repository;

	@Override
	protected DataMasterRekening1JpaRepository<DataMasterBelanja1Entity, DataMasterBelanja1> repositoryOfMasterRekening() {
		return this.repository;
	}

}
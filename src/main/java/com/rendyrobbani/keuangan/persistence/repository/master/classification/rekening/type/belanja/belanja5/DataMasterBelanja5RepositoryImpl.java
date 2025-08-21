package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.belanja.belanja5;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja5.DataMasterBelanja5;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.belanja.belanja5.DataMasterBelanja5Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja5.DataMasterBelanja5Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.AbstractDataMasterRekening5Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.DataMasterRekening5JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterBelanja5RepositoryImpl extends AbstractDataMasterRekening5Repository<DataMasterBelanja5Entity, DataMasterBelanja5> implements DataMasterBelanja5Repository {

	private final DataMasterBelanja5JpaRepository repository;

	@Override
	protected DataMasterRekening5JpaRepository<DataMasterBelanja5Entity, DataMasterBelanja5> repositoryOfMasterRekening() {
		return this.repository;
	}

}
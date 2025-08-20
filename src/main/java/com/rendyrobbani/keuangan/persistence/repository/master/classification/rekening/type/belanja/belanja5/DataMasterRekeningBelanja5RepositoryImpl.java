package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.belanja.belanja5;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja5.DataMasterRekeningBelanja5;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.belanja.belanja5.DataMasterRekeningBelanja5Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja5.DataMasterRekeningBelanja5Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.AbstractDataMasterRekening5Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.DataMasterRekening5JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterRekeningBelanja5RepositoryImpl extends AbstractDataMasterRekening5Repository<DataMasterRekeningBelanja5Entity, DataMasterRekeningBelanja5> implements DataMasterRekeningBelanja5Repository {

	private final DataMasterRekeningBelanja5JpaRepository repository;

	@Override
	protected DataMasterRekening5JpaRepository<DataMasterRekeningBelanja5Entity, DataMasterRekeningBelanja5> repositoryOfMasterRekening() {
		return this.repository;
	}

}
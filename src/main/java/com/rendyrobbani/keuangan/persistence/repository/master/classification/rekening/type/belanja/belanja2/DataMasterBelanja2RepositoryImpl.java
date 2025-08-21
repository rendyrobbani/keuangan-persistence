package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.belanja.belanja2;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja2.DataMasterBelanja2;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.belanja.belanja2.DataMasterBelanja2Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja2.DataMasterBelanja2Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.AbstractDataMasterRekening2Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.DataMasterRekening2JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterBelanja2RepositoryImpl extends AbstractDataMasterRekening2Repository<DataMasterBelanja2Entity, DataMasterBelanja2> implements DataMasterBelanja2Repository {

	private final DataMasterBelanja2JpaRepository repository;

	@Override
	protected DataMasterRekening2JpaRepository<DataMasterBelanja2Entity, DataMasterBelanja2> repositoryOfMasterRekening() {
		return this.repository;
	}

}
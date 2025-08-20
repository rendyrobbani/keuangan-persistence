package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.belanja.belanja2;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja2.DataMasterRekeningBelanja2;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.belanja.belanja2.DataMasterRekeningBelanja2Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja2.DataMasterRekeningBelanja2Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.AbstractDataMasterRekening2Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.DataMasterRekening2JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterRekeningBelanja2RepositoryImpl extends AbstractDataMasterRekening2Repository<DataMasterRekeningBelanja2Entity, DataMasterRekeningBelanja2> implements DataMasterRekeningBelanja2Repository {

	private final DataMasterRekeningBelanja2JpaRepository repository;

	@Override
	protected DataMasterRekening2JpaRepository<DataMasterRekeningBelanja2Entity, DataMasterRekeningBelanja2> repositoryOfMasterRekening() {
		return this.repository;
	}

}
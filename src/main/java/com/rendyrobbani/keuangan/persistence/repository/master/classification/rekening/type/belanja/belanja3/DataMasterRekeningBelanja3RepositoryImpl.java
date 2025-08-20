package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.belanja.belanja3;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja3.DataMasterRekeningBelanja3;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.belanja.belanja3.DataMasterRekeningBelanja3Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja3.DataMasterRekeningBelanja3Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.AbstractDataMasterRekening3Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.DataMasterRekening3JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterRekeningBelanja3RepositoryImpl extends AbstractDataMasterRekening3Repository<DataMasterRekeningBelanja3Entity, DataMasterRekeningBelanja3> implements DataMasterRekeningBelanja3Repository {

	private final DataMasterRekeningBelanja3JpaRepository repository;

	@Override
	protected DataMasterRekening3JpaRepository<DataMasterRekeningBelanja3Entity, DataMasterRekeningBelanja3> repositoryOfMasterRekening() {
		return this.repository;
	}

}
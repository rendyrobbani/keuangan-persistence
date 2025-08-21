package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.belanja.belanja3;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja3.DataMasterBelanja3;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.belanja.belanja3.DataMasterBelanja3Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja3.DataMasterBelanja3Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.AbstractDataMasterRekening3Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.DataMasterRekening3JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterBelanja3RepositoryImpl extends AbstractDataMasterRekening3Repository<DataMasterBelanja3Entity, DataMasterBelanja3> implements DataMasterBelanja3Repository {

	private final DataMasterBelanja3JpaRepository repository;

	@Override
	protected DataMasterRekening3JpaRepository<DataMasterBelanja3Entity, DataMasterBelanja3> repositoryOfMasterRekening() {
		return this.repository;
	}

}
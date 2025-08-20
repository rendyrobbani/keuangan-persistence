package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.ekuitas.ekuitas3;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.ekuitas.ekuitas3.DataMasterRekeningEkuitas3;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.ekuitas.ekuitas3.DataMasterRekeningEkuitas3Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas3.DataMasterRekeningEkuitas3Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.AbstractDataMasterRekening3Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.DataMasterRekening3JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterRekeningEkuitas3RepositoryImpl extends AbstractDataMasterRekening3Repository<DataMasterRekeningEkuitas3Entity, DataMasterRekeningEkuitas3> implements DataMasterRekeningEkuitas3Repository {

	private final DataMasterRekeningEkuitas3JpaRepository repository;

	@Override
	protected DataMasterRekening3JpaRepository<DataMasterRekeningEkuitas3Entity, DataMasterRekeningEkuitas3> repositoryOfMasterRekening() {
		return this.repository;
	}

}
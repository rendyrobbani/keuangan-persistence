package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.ekuitas.ekuitas3;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.ekuitas.ekuitas3.DataMasterEkuitas3;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.ekuitas.ekuitas3.DataMasterEkuitas3Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas3.DataMasterEkuitas3Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.AbstractDataMasterRekening3Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.DataMasterRekening3JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterEkuitas3RepositoryImpl extends AbstractDataMasterRekening3Repository<DataMasterEkuitas3Entity, DataMasterEkuitas3> implements DataMasterEkuitas3Repository {

	private final DataMasterEkuitas3JpaRepository repository;

	@Override
	protected DataMasterRekening3JpaRepository<DataMasterEkuitas3Entity, DataMasterEkuitas3> repositoryOfMasterRekening() {
		return this.repository;
	}

}
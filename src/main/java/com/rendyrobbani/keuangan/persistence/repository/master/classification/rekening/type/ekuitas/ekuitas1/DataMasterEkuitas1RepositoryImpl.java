package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.ekuitas.ekuitas1;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.ekuitas.ekuitas1.DataMasterEkuitas1;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.ekuitas.ekuitas1.DataMasterEkuitas1Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas1.DataMasterEkuitas1Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1.AbstractDataMasterRekening1Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1.DataMasterRekening1JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterEkuitas1RepositoryImpl extends AbstractDataMasterRekening1Repository<DataMasterEkuitas1Entity, DataMasterEkuitas1> implements DataMasterEkuitas1Repository {

	private final DataMasterEkuitas1JpaRepository repository;

	@Override
	protected DataMasterRekening1JpaRepository<DataMasterEkuitas1Entity, DataMasterEkuitas1> repositoryOfMasterRekening() {
		return this.repository;
	}

}
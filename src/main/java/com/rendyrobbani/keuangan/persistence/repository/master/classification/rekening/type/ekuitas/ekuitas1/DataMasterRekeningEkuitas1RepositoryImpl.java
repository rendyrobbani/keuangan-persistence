package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.ekuitas.ekuitas1;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.ekuitas.ekuitas1.DataMasterRekeningEkuitas1;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.ekuitas.ekuitas1.DataMasterRekeningEkuitas1Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas1.DataMasterRekeningEkuitas1Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1.AbstractDataMasterRekening1Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1.DataMasterRekening1JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterRekeningEkuitas1RepositoryImpl extends AbstractDataMasterRekening1Repository<DataMasterRekeningEkuitas1Entity, DataMasterRekeningEkuitas1> implements DataMasterRekeningEkuitas1Repository {

	private final DataMasterRekeningEkuitas1JpaRepository repository;

	@Override
	protected DataMasterRekening1JpaRepository<DataMasterRekeningEkuitas1Entity, DataMasterRekeningEkuitas1> repositoryOfMasterRekening() {
		return this.repository;
	}

}
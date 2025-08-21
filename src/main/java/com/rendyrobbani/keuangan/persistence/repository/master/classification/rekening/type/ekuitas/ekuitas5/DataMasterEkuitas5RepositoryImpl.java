package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.ekuitas.ekuitas5;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.ekuitas.ekuitas5.DataMasterEkuitas5;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.ekuitas.ekuitas5.DataMasterEkuitas5Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas5.DataMasterEkuitas5Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.AbstractDataMasterRekening5Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.DataMasterRekening5JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterEkuitas5RepositoryImpl extends AbstractDataMasterRekening5Repository<DataMasterEkuitas5Entity, DataMasterEkuitas5> implements DataMasterEkuitas5Repository {

	private final DataMasterEkuitas5JpaRepository repository;

	@Override
	protected DataMasterRekening5JpaRepository<DataMasterEkuitas5Entity, DataMasterEkuitas5> repositoryOfMasterRekening() {
		return this.repository;
	}

}
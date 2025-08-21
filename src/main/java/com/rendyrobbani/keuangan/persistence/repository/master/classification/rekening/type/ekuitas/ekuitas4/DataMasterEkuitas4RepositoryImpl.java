package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.ekuitas.ekuitas4;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.ekuitas.ekuitas4.DataMasterEkuitas4;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.ekuitas.ekuitas4.DataMasterEkuitas4Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas4.DataMasterEkuitas4Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.AbstractDataMasterRekening4Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.DataMasterRekening4JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterEkuitas4RepositoryImpl extends AbstractDataMasterRekening4Repository<DataMasterEkuitas4Entity, DataMasterEkuitas4> implements DataMasterEkuitas4Repository {

	private final DataMasterEkuitas4JpaRepository repository;

	@Override
	protected DataMasterRekening4JpaRepository<DataMasterEkuitas4Entity, DataMasterEkuitas4> repositoryOfMasterRekening() {
		return this.repository;
	}

}
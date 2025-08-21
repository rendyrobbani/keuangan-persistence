package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.ekuitas.ekuitas6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.ekuitas.ekuitas6.DataMasterEkuitas6;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.ekuitas.ekuitas6.DataMasterEkuitas6Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas6.DataMasterEkuitas6Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.AbstractDataMasterRekening6Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.DataMasterRekening6JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterEkuitas6RepositoryImpl extends AbstractDataMasterRekening6Repository<DataMasterEkuitas6Entity, DataMasterEkuitas6> implements DataMasterEkuitas6Repository {

	private final DataMasterEkuitas6JpaRepository repository;

	@Override
	protected DataMasterRekening6JpaRepository<DataMasterEkuitas6Entity, DataMasterEkuitas6> repositoryOfMasterRekening() {
		return this.repository;
	}

}
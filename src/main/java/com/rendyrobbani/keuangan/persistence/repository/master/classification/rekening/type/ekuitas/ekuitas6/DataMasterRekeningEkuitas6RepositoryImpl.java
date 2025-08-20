package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.ekuitas.ekuitas6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.ekuitas.ekuitas6.DataMasterRekeningEkuitas6;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.ekuitas.ekuitas6.DataMasterRekeningEkuitas6Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas6.DataMasterRekeningEkuitas6Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.AbstractDataMasterRekening6Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.DataMasterRekening6JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterRekeningEkuitas6RepositoryImpl extends AbstractDataMasterRekening6Repository<DataMasterRekeningEkuitas6Entity, DataMasterRekeningEkuitas6> implements DataMasterRekeningEkuitas6Repository {

	private final DataMasterRekeningEkuitas6JpaRepository repository;

	@Override
	protected DataMasterRekening6JpaRepository<DataMasterRekeningEkuitas6Entity, DataMasterRekeningEkuitas6> repositoryOfMasterRekening() {
		return this.repository;
	}

}
package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.ekuitas.ekuitas4;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.ekuitas.ekuitas4.DataMasterRekeningEkuitas4;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.ekuitas.ekuitas4.DataMasterRekeningEkuitas4Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas4.DataMasterRekeningEkuitas4Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.AbstractDataMasterRekening4Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.DataMasterRekening4JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterRekeningEkuitas4RepositoryImpl extends AbstractDataMasterRekening4Repository<DataMasterRekeningEkuitas4Entity, DataMasterRekeningEkuitas4> implements DataMasterRekeningEkuitas4Repository {

	private final DataMasterRekeningEkuitas4JpaRepository repository;

	@Override
	protected DataMasterRekening4JpaRepository<DataMasterRekeningEkuitas4Entity, DataMasterRekeningEkuitas4> repositoryOfMasterRekening() {
		return this.repository;
	}

}
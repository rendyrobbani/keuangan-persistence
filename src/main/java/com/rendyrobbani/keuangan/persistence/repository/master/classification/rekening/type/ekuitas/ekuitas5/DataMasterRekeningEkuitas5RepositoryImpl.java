package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.ekuitas.ekuitas5;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.ekuitas.ekuitas5.DataMasterRekeningEkuitas5;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.ekuitas.ekuitas5.DataMasterRekeningEkuitas5Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas5.DataMasterRekeningEkuitas5Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.AbstractDataMasterRekening5Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.DataMasterRekening5JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterRekeningEkuitas5RepositoryImpl extends AbstractDataMasterRekening5Repository<DataMasterRekeningEkuitas5Entity, DataMasterRekeningEkuitas5> implements DataMasterRekeningEkuitas5Repository {

	private final DataMasterRekeningEkuitas5JpaRepository repository;

	@Override
	protected DataMasterRekening5JpaRepository<DataMasterRekeningEkuitas5Entity, DataMasterRekeningEkuitas5> repositoryOfMasterRekening() {
		return this.repository;
	}

}
package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.ekuitas.ekuitas2;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.ekuitas.ekuitas2.DataMasterRekeningEkuitas2;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.ekuitas.ekuitas2.DataMasterRekeningEkuitas2Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas2.DataMasterRekeningEkuitas2Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.AbstractDataMasterRekening2Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.DataMasterRekening2JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterRekeningEkuitas2RepositoryImpl extends AbstractDataMasterRekening2Repository<DataMasterRekeningEkuitas2Entity, DataMasterRekeningEkuitas2> implements DataMasterRekeningEkuitas2Repository {

	private final DataMasterRekeningEkuitas2JpaRepository repository;

	@Override
	protected DataMasterRekening2JpaRepository<DataMasterRekeningEkuitas2Entity, DataMasterRekeningEkuitas2> repositoryOfMasterRekening() {
		return this.repository;
	}

}
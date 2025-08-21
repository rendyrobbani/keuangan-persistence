package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.ekuitas.ekuitas2;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.ekuitas.ekuitas2.DataMasterEkuitas2;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.ekuitas.ekuitas2.DataMasterEkuitas2Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas2.DataMasterEkuitas2Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.AbstractDataMasterRekening2Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.DataMasterRekening2JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterEkuitas2RepositoryImpl extends AbstractDataMasterRekening2Repository<DataMasterEkuitas2Entity, DataMasterEkuitas2> implements DataMasterEkuitas2Repository {

	private final DataMasterEkuitas2JpaRepository repository;

	@Override
	protected DataMasterRekening2JpaRepository<DataMasterEkuitas2Entity, DataMasterEkuitas2> repositoryOfMasterRekening() {
		return this.repository;
	}

}
package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.beban.beban6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban6.DataMasterBeban6;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.beban.beban6.DataMasterBeban6Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban6.DataMasterBeban6Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.AbstractDataMasterRekening6Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.DataMasterRekening6JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterBeban6RepositoryImpl extends AbstractDataMasterRekening6Repository<DataMasterBeban6Entity, DataMasterBeban6> implements DataMasterBeban6Repository {

	private final DataMasterBeban6JpaRepository repository;

	@Override
	protected DataMasterRekening6JpaRepository<DataMasterBeban6Entity, DataMasterBeban6> repositoryOfMasterRekening() {
		return this.repository;
	}

}
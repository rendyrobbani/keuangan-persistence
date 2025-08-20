package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.beban.beban6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban6.DataMasterRekeningBeban6;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.beban.beban6.DataMasterRekeningBeban6Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban6.DataMasterRekeningBeban6Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.AbstractDataMasterRekening6Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.DataMasterRekening6JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterRekeningBeban6RepositoryImpl extends AbstractDataMasterRekening6Repository<DataMasterRekeningBeban6Entity, DataMasterRekeningBeban6> implements DataMasterRekeningBeban6Repository {

	private final DataMasterRekeningBeban6JpaRepository repository;

	@Override
	protected DataMasterRekening6JpaRepository<DataMasterRekeningBeban6Entity, DataMasterRekeningBeban6> repositoryOfMasterRekening() {
		return this.repository;
	}

}
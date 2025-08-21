package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.beban.beban2;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban2.DataMasterBeban2;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.beban.beban2.DataMasterBeban2Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban2.DataMasterBeban2Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.AbstractDataMasterRekening2Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.DataMasterRekening2JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterBeban2RepositoryImpl extends AbstractDataMasterRekening2Repository<DataMasterBeban2Entity, DataMasterBeban2> implements DataMasterBeban2Repository {

	private final DataMasterBeban2JpaRepository repository;

	@Override
	protected DataMasterRekening2JpaRepository<DataMasterBeban2Entity, DataMasterBeban2> repositoryOfMasterRekening() {
		return this.repository;
	}

}
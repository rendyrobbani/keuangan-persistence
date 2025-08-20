package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.beban.beban2;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban2.DataMasterRekeningBeban2;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.beban.beban2.DataMasterRekeningBeban2Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban2.DataMasterRekeningBeban2Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.AbstractDataMasterRekening2Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.DataMasterRekening2JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterRekeningBeban2RepositoryImpl extends AbstractDataMasterRekening2Repository<DataMasterRekeningBeban2Entity, DataMasterRekeningBeban2> implements DataMasterRekeningBeban2Repository {

	private final DataMasterRekeningBeban2JpaRepository repository;

	@Override
	protected DataMasterRekening2JpaRepository<DataMasterRekeningBeban2Entity, DataMasterRekeningBeban2> repositoryOfMasterRekening() {
		return this.repository;
	}

}
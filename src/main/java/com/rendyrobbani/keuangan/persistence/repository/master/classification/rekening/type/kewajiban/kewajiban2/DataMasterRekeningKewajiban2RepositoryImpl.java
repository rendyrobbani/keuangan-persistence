package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.kewajiban.kewajiban2;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.kewajiban.kewajiban2.DataMasterRekeningKewajiban2;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.kewajiban.kewajiban2.DataMasterRekeningKewajiban2Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban2.DataMasterRekeningKewajiban2Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.AbstractDataMasterRekening2Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.DataMasterRekening2JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterRekeningKewajiban2RepositoryImpl extends AbstractDataMasterRekening2Repository<DataMasterRekeningKewajiban2Entity, DataMasterRekeningKewajiban2> implements DataMasterRekeningKewajiban2Repository {

	private final DataMasterRekeningKewajiban2JpaRepository repository;

	@Override
	protected DataMasterRekening2JpaRepository<DataMasterRekeningKewajiban2Entity, DataMasterRekeningKewajiban2> repositoryOfMasterRekening() {
		return this.repository;
	}

}
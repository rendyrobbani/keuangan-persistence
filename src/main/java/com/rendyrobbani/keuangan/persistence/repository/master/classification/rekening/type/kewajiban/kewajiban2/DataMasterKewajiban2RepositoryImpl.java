package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.kewajiban.kewajiban2;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.kewajiban.kewajiban2.DataMasterKewajiban2;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.kewajiban.kewajiban2.DataMasterKewajiban2Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban2.DataMasterKewajiban2Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.AbstractDataMasterRekening2Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.DataMasterRekening2JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterKewajiban2RepositoryImpl extends AbstractDataMasterRekening2Repository<DataMasterKewajiban2Entity, DataMasterKewajiban2> implements DataMasterKewajiban2Repository {

	private final DataMasterKewajiban2JpaRepository repository;

	@Override
	protected DataMasterRekening2JpaRepository<DataMasterKewajiban2Entity, DataMasterKewajiban2> repositoryOfMasterRekening() {
		return this.repository;
	}

}
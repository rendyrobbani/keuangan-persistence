package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.kewajiban.kewajiban1;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.kewajiban.kewajiban1.DataMasterKewajiban1;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.kewajiban.kewajiban1.SipdMasterKewajiban1;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.kewajiban.kewajiban1.SipdMasterKewajiban1Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban1.SipdMasterKewajiban1Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1.AbstractSipdMasterRekening1Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1.SipdMasterRekening1JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterKewajiban1RepositoryImpl extends AbstractSipdMasterRekening1Repository<SipdMasterKewajiban1Entity, SipdMasterKewajiban1, DataMasterKewajiban1> implements SipdMasterKewajiban1Repository {

	private final SipdMasterKewajiban1JpaRepository repository;

	@Override
	protected SipdMasterRekening1JpaRepository<SipdMasterKewajiban1Entity, SipdMasterKewajiban1, DataMasterKewajiban1> repositoryOfMasterRekening() {
		return this.repository;
	}

}
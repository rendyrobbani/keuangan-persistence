package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.kewajiban.kewajiban4;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.kewajiban.kewajiban4.DataMasterKewajiban4;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.kewajiban.kewajiban4.SipdMasterKewajiban4;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.kewajiban.kewajiban4.SipdMasterKewajiban4Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban4.SipdMasterKewajiban4Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.AbstractSipdMasterRekening4Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.SipdMasterRekening4JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterKewajiban4RepositoryImpl extends AbstractSipdMasterRekening4Repository<SipdMasterKewajiban4Entity, SipdMasterKewajiban4, DataMasterKewajiban4> implements SipdMasterKewajiban4Repository {

	private final SipdMasterKewajiban4JpaRepository repository;

	@Override
	protected SipdMasterRekening4JpaRepository<SipdMasterKewajiban4Entity, SipdMasterKewajiban4, DataMasterKewajiban4> repositoryOfMasterRekening() {
		return this.repository;
	}

}
package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.kewajiban.kewajiban6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.kewajiban.kewajiban6.DataMasterKewajiban6;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.kewajiban.kewajiban6.SipdMasterKewajiban6;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.kewajiban.kewajiban6.SipdMasterKewajiban6Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban6.SipdMasterKewajiban6Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.AbstractSipdMasterRekening6Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.SipdMasterRekening6JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterKewajiban6RepositoryImpl extends AbstractSipdMasterRekening6Repository<SipdMasterKewajiban6Entity, SipdMasterKewajiban6, DataMasterKewajiban6> implements SipdMasterKewajiban6Repository {

	private final SipdMasterKewajiban6JpaRepository repository;

	@Override
	protected SipdMasterRekening6JpaRepository<SipdMasterKewajiban6Entity, SipdMasterKewajiban6, DataMasterKewajiban6> repositoryOfMasterRekening() {
		return this.repository;
	}

}
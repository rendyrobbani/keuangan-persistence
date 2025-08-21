package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.kewajiban.kewajiban3;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.kewajiban.kewajiban3.DataMasterKewajiban3;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.kewajiban.kewajiban3.SipdMasterKewajiban3;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.kewajiban.kewajiban3.SipdMasterKewajiban3Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban3.SipdMasterKewajiban3Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.AbstractSipdMasterRekening3Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.SipdMasterRekening3JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterKewajiban3RepositoryImpl extends AbstractSipdMasterRekening3Repository<SipdMasterKewajiban3Entity, SipdMasterKewajiban3, DataMasterKewajiban3> implements SipdMasterKewajiban3Repository {

	private final SipdMasterKewajiban3JpaRepository repository;

	@Override
	protected SipdMasterRekening3JpaRepository<SipdMasterKewajiban3Entity, SipdMasterKewajiban3, DataMasterKewajiban3> repositoryOfMasterRekening() {
		return this.repository;
	}

}
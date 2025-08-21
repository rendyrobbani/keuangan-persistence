package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.kewajiban.kewajiban5;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.kewajiban.kewajiban5.DataMasterKewajiban5;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.kewajiban.kewajiban5.SipdMasterKewajiban5;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.kewajiban.kewajiban5.SipdMasterKewajiban5Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban5.SipdMasterKewajiban5Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.AbstractSipdMasterRekening5Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.SipdMasterRekening5JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterKewajiban5RepositoryImpl extends AbstractSipdMasterRekening5Repository<SipdMasterKewajiban5Entity, SipdMasterKewajiban5, DataMasterKewajiban5> implements SipdMasterKewajiban5Repository {

	private final SipdMasterKewajiban5JpaRepository repository;

	@Override
	protected SipdMasterRekening5JpaRepository<SipdMasterKewajiban5Entity, SipdMasterKewajiban5, DataMasterKewajiban5> repositoryOfMasterRekening() {
		return this.repository;
	}

}
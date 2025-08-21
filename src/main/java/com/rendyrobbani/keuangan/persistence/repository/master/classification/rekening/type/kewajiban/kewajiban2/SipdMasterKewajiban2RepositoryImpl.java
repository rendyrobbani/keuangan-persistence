package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.kewajiban.kewajiban2;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.kewajiban.kewajiban2.DataMasterKewajiban2;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.kewajiban.kewajiban2.SipdMasterKewajiban2;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.kewajiban.kewajiban2.SipdMasterKewajiban2Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban2.SipdMasterKewajiban2Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.AbstractSipdMasterRekening2Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.SipdMasterRekening2JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterKewajiban2RepositoryImpl extends AbstractSipdMasterRekening2Repository<SipdMasterKewajiban2Entity, SipdMasterKewajiban2, DataMasterKewajiban2> implements SipdMasterKewajiban2Repository {

	private final SipdMasterKewajiban2JpaRepository repository;

	@Override
	protected SipdMasterRekening2JpaRepository<SipdMasterKewajiban2Entity, SipdMasterKewajiban2, DataMasterKewajiban2> repositoryOfMasterRekening() {
		return this.repository;
	}

}
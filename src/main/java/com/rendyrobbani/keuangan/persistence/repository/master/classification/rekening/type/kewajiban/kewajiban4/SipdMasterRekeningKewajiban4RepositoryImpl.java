package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.kewajiban.kewajiban4;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.kewajiban.kewajiban4.DataMasterRekeningKewajiban4;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.kewajiban.kewajiban4.SipdMasterRekeningKewajiban4;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.kewajiban.kewajiban4.SipdMasterRekeningKewajiban4Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban4.SipdMasterRekeningKewajiban4Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.AbstractSipdMasterRekening4Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.SipdMasterRekening4JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterRekeningKewajiban4RepositoryImpl extends AbstractSipdMasterRekening4Repository<SipdMasterRekeningKewajiban4Entity, SipdMasterRekeningKewajiban4, DataMasterRekeningKewajiban4> implements SipdMasterRekeningKewajiban4Repository {

	private final SipdMasterRekeningKewajiban4JpaRepository repository;

	@Override
	protected SipdMasterRekening4JpaRepository<SipdMasterRekeningKewajiban4Entity, SipdMasterRekeningKewajiban4, DataMasterRekeningKewajiban4> repositoryOfMasterRekening() {
		return this.repository;
	}

}
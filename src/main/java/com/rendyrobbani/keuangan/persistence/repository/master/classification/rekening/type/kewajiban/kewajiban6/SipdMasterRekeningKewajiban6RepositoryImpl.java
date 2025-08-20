package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.kewajiban.kewajiban6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.kewajiban.kewajiban6.DataMasterRekeningKewajiban6;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.kewajiban.kewajiban6.SipdMasterRekeningKewajiban6;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.kewajiban.kewajiban6.SipdMasterRekeningKewajiban6Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban6.SipdMasterRekeningKewajiban6Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.AbstractSipdMasterRekening6Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.SipdMasterRekening6JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterRekeningKewajiban6RepositoryImpl extends AbstractSipdMasterRekening6Repository<SipdMasterRekeningKewajiban6Entity, SipdMasterRekeningKewajiban6, DataMasterRekeningKewajiban6> implements SipdMasterRekeningKewajiban6Repository {

	private final SipdMasterRekeningKewajiban6JpaRepository repository;

	@Override
	protected SipdMasterRekening6JpaRepository<SipdMasterRekeningKewajiban6Entity, SipdMasterRekeningKewajiban6, DataMasterRekeningKewajiban6> repositoryOfMasterRekening() {
		return this.repository;
	}

}
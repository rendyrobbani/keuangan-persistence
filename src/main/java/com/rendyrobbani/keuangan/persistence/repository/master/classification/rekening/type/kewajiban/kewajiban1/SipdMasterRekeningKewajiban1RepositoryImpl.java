package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.kewajiban.kewajiban1;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.kewajiban.kewajiban1.DataMasterRekeningKewajiban1;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.kewajiban.kewajiban1.SipdMasterRekeningKewajiban1;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.kewajiban.kewajiban1.SipdMasterRekeningKewajiban1Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban1.SipdMasterRekeningKewajiban1Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1.AbstractSipdMasterRekening1Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1.SipdMasterRekening1JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterRekeningKewajiban1RepositoryImpl extends AbstractSipdMasterRekening1Repository<SipdMasterRekeningKewajiban1Entity, SipdMasterRekeningKewajiban1, DataMasterRekeningKewajiban1> implements SipdMasterRekeningKewajiban1Repository {

	private final SipdMasterRekeningKewajiban1JpaRepository repository;

	@Override
	protected SipdMasterRekening1JpaRepository<SipdMasterRekeningKewajiban1Entity, SipdMasterRekeningKewajiban1, DataMasterRekeningKewajiban1> repositoryOfMasterRekening() {
		return this.repository;
	}

}
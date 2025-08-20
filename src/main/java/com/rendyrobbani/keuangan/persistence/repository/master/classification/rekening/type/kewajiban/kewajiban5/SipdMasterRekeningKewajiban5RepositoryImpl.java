package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.kewajiban.kewajiban5;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.kewajiban.kewajiban5.DataMasterRekeningKewajiban5;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.kewajiban.kewajiban5.SipdMasterRekeningKewajiban5;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.kewajiban.kewajiban5.SipdMasterRekeningKewajiban5Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban5.SipdMasterRekeningKewajiban5Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.AbstractSipdMasterRekening5Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.SipdMasterRekening5JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterRekeningKewajiban5RepositoryImpl extends AbstractSipdMasterRekening5Repository<SipdMasterRekeningKewajiban5Entity, SipdMasterRekeningKewajiban5, DataMasterRekeningKewajiban5> implements SipdMasterRekeningKewajiban5Repository {

	private final SipdMasterRekeningKewajiban5JpaRepository repository;

	@Override
	protected SipdMasterRekening5JpaRepository<SipdMasterRekeningKewajiban5Entity, SipdMasterRekeningKewajiban5, DataMasterRekeningKewajiban5> repositoryOfMasterRekening() {
		return this.repository;
	}

}
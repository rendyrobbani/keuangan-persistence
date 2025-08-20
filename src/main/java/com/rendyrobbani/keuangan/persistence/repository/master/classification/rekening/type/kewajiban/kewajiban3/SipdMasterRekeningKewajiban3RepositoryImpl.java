package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.kewajiban.kewajiban3;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.kewajiban.kewajiban3.DataMasterRekeningKewajiban3;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.kewajiban.kewajiban3.SipdMasterRekeningKewajiban3;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.kewajiban.kewajiban3.SipdMasterRekeningKewajiban3Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban3.SipdMasterRekeningKewajiban3Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.AbstractSipdMasterRekening3Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.SipdMasterRekening3JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterRekeningKewajiban3RepositoryImpl extends AbstractSipdMasterRekening3Repository<SipdMasterRekeningKewajiban3Entity, SipdMasterRekeningKewajiban3, DataMasterRekeningKewajiban3> implements SipdMasterRekeningKewajiban3Repository {

	private final SipdMasterRekeningKewajiban3JpaRepository repository;

	@Override
	protected SipdMasterRekening3JpaRepository<SipdMasterRekeningKewajiban3Entity, SipdMasterRekeningKewajiban3, DataMasterRekeningKewajiban3> repositoryOfMasterRekening() {
		return this.repository;
	}

}
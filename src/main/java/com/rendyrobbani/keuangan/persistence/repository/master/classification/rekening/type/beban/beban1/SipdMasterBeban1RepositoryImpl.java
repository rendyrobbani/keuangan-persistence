package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.beban.beban1;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban1.DataMasterBeban1;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban1.SipdMasterBeban1;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.beban.beban1.SipdMasterBeban1Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban1.SipdMasterBeban1Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1.AbstractSipdMasterRekening1Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1.SipdMasterRekening1JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterBeban1RepositoryImpl extends AbstractSipdMasterRekening1Repository<SipdMasterBeban1Entity, SipdMasterBeban1, DataMasterBeban1> implements SipdMasterBeban1Repository {

	private final SipdMasterBeban1JpaRepository repository;

	@Override
	protected SipdMasterRekening1JpaRepository<SipdMasterBeban1Entity, SipdMasterBeban1, DataMasterBeban1> repositoryOfMasterRekening() {
		return this.repository;
	}

}
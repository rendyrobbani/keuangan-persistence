package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.beban.beban1;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban1.DataMasterRekeningBeban1;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban1.SipdMasterRekeningBeban1;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.beban.beban1.SipdMasterRekeningBeban1Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban1.SipdMasterRekeningBeban1Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1.AbstractSipdMasterRekening1Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1.SipdMasterRekening1JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterRekeningBeban1RepositoryImpl extends AbstractSipdMasterRekening1Repository<SipdMasterRekeningBeban1Entity, SipdMasterRekeningBeban1, DataMasterRekeningBeban1> implements SipdMasterRekeningBeban1Repository {

	private final SipdMasterRekeningBeban1JpaRepository repository;

	@Override
	protected SipdMasterRekening1JpaRepository<SipdMasterRekeningBeban1Entity, SipdMasterRekeningBeban1, DataMasterRekeningBeban1> repositoryOfMasterRekening() {
		return this.repository;
	}

}
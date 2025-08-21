package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.beban.beban5;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban5.DataMasterBeban5;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban5.SipdMasterBeban5;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.beban.beban5.SipdMasterBeban5Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban5.SipdMasterBeban5Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.AbstractSipdMasterRekening5Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.SipdMasterRekening5JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterBeban5RepositoryImpl extends AbstractSipdMasterRekening5Repository<SipdMasterBeban5Entity, SipdMasterBeban5, DataMasterBeban5> implements SipdMasterBeban5Repository {

	private final SipdMasterBeban5JpaRepository repository;

	@Override
	protected SipdMasterRekening5JpaRepository<SipdMasterBeban5Entity, SipdMasterBeban5, DataMasterBeban5> repositoryOfMasterRekening() {
		return this.repository;
	}

}
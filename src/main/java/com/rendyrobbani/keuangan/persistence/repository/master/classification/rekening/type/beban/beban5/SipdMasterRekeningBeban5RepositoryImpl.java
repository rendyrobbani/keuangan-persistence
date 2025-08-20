package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.beban.beban5;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban5.DataMasterRekeningBeban5;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban5.SipdMasterRekeningBeban5;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.beban.beban5.SipdMasterRekeningBeban5Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban5.SipdMasterRekeningBeban5Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.AbstractSipdMasterRekening5Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.SipdMasterRekening5JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterRekeningBeban5RepositoryImpl extends AbstractSipdMasterRekening5Repository<SipdMasterRekeningBeban5Entity, SipdMasterRekeningBeban5, DataMasterRekeningBeban5> implements SipdMasterRekeningBeban5Repository {

	private final SipdMasterRekeningBeban5JpaRepository repository;

	@Override
	protected SipdMasterRekening5JpaRepository<SipdMasterRekeningBeban5Entity, SipdMasterRekeningBeban5, DataMasterRekeningBeban5> repositoryOfMasterRekening() {
		return this.repository;
	}

}
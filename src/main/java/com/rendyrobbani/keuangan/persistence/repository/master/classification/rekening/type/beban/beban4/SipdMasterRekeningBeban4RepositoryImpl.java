package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.beban.beban4;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban4.DataMasterRekeningBeban4;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban4.SipdMasterRekeningBeban4;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.beban.beban4.SipdMasterRekeningBeban4Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban4.SipdMasterRekeningBeban4Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.AbstractSipdMasterRekening4Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.SipdMasterRekening4JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterRekeningBeban4RepositoryImpl extends AbstractSipdMasterRekening4Repository<SipdMasterRekeningBeban4Entity, SipdMasterRekeningBeban4, DataMasterRekeningBeban4> implements SipdMasterRekeningBeban4Repository {

	private final SipdMasterRekeningBeban4JpaRepository repository;

	@Override
	protected SipdMasterRekening4JpaRepository<SipdMasterRekeningBeban4Entity, SipdMasterRekeningBeban4, DataMasterRekeningBeban4> repositoryOfMasterRekening() {
		return this.repository;
	}

}
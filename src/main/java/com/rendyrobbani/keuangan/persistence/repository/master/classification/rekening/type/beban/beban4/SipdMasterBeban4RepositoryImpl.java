package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.beban.beban4;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban4.DataMasterBeban4;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban4.SipdMasterBeban4;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.beban.beban4.SipdMasterBeban4Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban4.SipdMasterBeban4Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.AbstractSipdMasterRekening4Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.SipdMasterRekening4JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterBeban4RepositoryImpl extends AbstractSipdMasterRekening4Repository<SipdMasterBeban4Entity, SipdMasterBeban4, DataMasterBeban4> implements SipdMasterBeban4Repository {

	private final SipdMasterBeban4JpaRepository repository;

	@Override
	protected SipdMasterRekening4JpaRepository<SipdMasterBeban4Entity, SipdMasterBeban4, DataMasterBeban4> repositoryOfMasterRekening() {
		return this.repository;
	}

}
package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.beban.beban6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban6.DataMasterBeban6;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban6.SipdMasterBeban6;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.beban.beban6.SipdMasterBeban6Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban6.SipdMasterBeban6Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.AbstractSipdMasterRekening6Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.SipdMasterRekening6JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterBeban6RepositoryImpl extends AbstractSipdMasterRekening6Repository<SipdMasterBeban6Entity, SipdMasterBeban6, DataMasterBeban6> implements SipdMasterBeban6Repository {

	private final SipdMasterBeban6JpaRepository repository;

	@Override
	protected SipdMasterRekening6JpaRepository<SipdMasterBeban6Entity, SipdMasterBeban6, DataMasterBeban6> repositoryOfMasterRekening() {
		return this.repository;
	}

}
package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.beban.beban6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban6.DataMasterRekeningBeban6;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban6.SipdMasterRekeningBeban6;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.beban.beban6.SipdMasterRekeningBeban6Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban6.SipdMasterRekeningBeban6Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.AbstractSipdMasterRekening6Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.SipdMasterRekening6JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterRekeningBeban6RepositoryImpl extends AbstractSipdMasterRekening6Repository<SipdMasterRekeningBeban6Entity, SipdMasterRekeningBeban6, DataMasterRekeningBeban6> implements SipdMasterRekeningBeban6Repository {

	private final SipdMasterRekeningBeban6JpaRepository repository;

	@Override
	protected SipdMasterRekening6JpaRepository<SipdMasterRekeningBeban6Entity, SipdMasterRekeningBeban6, DataMasterRekeningBeban6> repositoryOfMasterRekening() {
		return this.repository;
	}

}
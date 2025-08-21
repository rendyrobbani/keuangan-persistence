package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.beban.beban2;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban2.DataMasterBeban2;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban2.SipdMasterBeban2;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.beban.beban2.SipdMasterBeban2Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban2.SipdMasterBeban2Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.AbstractSipdMasterRekening2Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.SipdMasterRekening2JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterBeban2RepositoryImpl extends AbstractSipdMasterRekening2Repository<SipdMasterBeban2Entity, SipdMasterBeban2, DataMasterBeban2> implements SipdMasterBeban2Repository {

	private final SipdMasterBeban2JpaRepository repository;

	@Override
	protected SipdMasterRekening2JpaRepository<SipdMasterBeban2Entity, SipdMasterBeban2, DataMasterBeban2> repositoryOfMasterRekening() {
		return this.repository;
	}

}
package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.beban.beban2;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban2.DataMasterRekeningBeban2;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban2.SipdMasterRekeningBeban2;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.beban.beban2.SipdMasterRekeningBeban2Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban2.SipdMasterRekeningBeban2Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.AbstractSipdMasterRekening2Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.SipdMasterRekening2JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterRekeningBeban2RepositoryImpl extends AbstractSipdMasterRekening2Repository<SipdMasterRekeningBeban2Entity, SipdMasterRekeningBeban2, DataMasterRekeningBeban2> implements SipdMasterRekeningBeban2Repository {

	private final SipdMasterRekeningBeban2JpaRepository repository;

	@Override
	protected SipdMasterRekening2JpaRepository<SipdMasterRekeningBeban2Entity, SipdMasterRekeningBeban2, DataMasterRekeningBeban2> repositoryOfMasterRekening() {
		return this.repository;
	}

}
package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.kewajiban.kewajiban2;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.kewajiban.kewajiban2.DataMasterRekeningKewajiban2;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.kewajiban.kewajiban2.SipdMasterRekeningKewajiban2;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.kewajiban.kewajiban2.SipdMasterRekeningKewajiban2Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban2.SipdMasterRekeningKewajiban2Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.AbstractSipdMasterRekening2Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.SipdMasterRekening2JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterRekeningKewajiban2RepositoryImpl extends AbstractSipdMasterRekening2Repository<SipdMasterRekeningKewajiban2Entity, SipdMasterRekeningKewajiban2, DataMasterRekeningKewajiban2> implements SipdMasterRekeningKewajiban2Repository {

	private final SipdMasterRekeningKewajiban2JpaRepository repository;

	@Override
	protected SipdMasterRekening2JpaRepository<SipdMasterRekeningKewajiban2Entity, SipdMasterRekeningKewajiban2, DataMasterRekeningKewajiban2> repositoryOfMasterRekening() {
		return this.repository;
	}

}
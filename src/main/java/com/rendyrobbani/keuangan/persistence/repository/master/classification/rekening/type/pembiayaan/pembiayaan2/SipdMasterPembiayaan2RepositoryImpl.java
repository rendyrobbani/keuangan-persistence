package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.pembiayaan.pembiayaan2;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pembiayaan.pembiayaan2.DataMasterPembiayaan2;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pembiayaan.pembiayaan2.SipdMasterPembiayaan2;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.pembiayaan.pembiayaan2.SipdMasterPembiayaan2Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pembiayaan.pembiayaan2.SipdMasterPembiayaan2Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.AbstractSipdMasterRekening2Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.SipdMasterRekening2JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterPembiayaan2RepositoryImpl extends AbstractSipdMasterRekening2Repository<SipdMasterPembiayaan2Entity, SipdMasterPembiayaan2, DataMasterPembiayaan2> implements SipdMasterPembiayaan2Repository {

	private final SipdMasterPembiayaan2JpaRepository repository;

	@Override
	protected SipdMasterRekening2JpaRepository<SipdMasterPembiayaan2Entity, SipdMasterPembiayaan2, DataMasterPembiayaan2> repositoryOfMasterRekening() {
		return this.repository;
	}

}
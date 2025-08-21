package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.pembiayaan.pembiayaan6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pembiayaan.pembiayaan6.DataMasterPembiayaan6;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pembiayaan.pembiayaan6.SipdMasterPembiayaan6;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.pembiayaan.pembiayaan6.SipdMasterPembiayaan6Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pembiayaan.pembiayaan6.SipdMasterPembiayaan6Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.AbstractSipdMasterRekening6Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.SipdMasterRekening6JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterPembiayaan6RepositoryImpl extends AbstractSipdMasterRekening6Repository<SipdMasterPembiayaan6Entity, SipdMasterPembiayaan6, DataMasterPembiayaan6> implements SipdMasterPembiayaan6Repository {

	private final SipdMasterPembiayaan6JpaRepository repository;

	@Override
	protected SipdMasterRekening6JpaRepository<SipdMasterPembiayaan6Entity, SipdMasterPembiayaan6, DataMasterPembiayaan6> repositoryOfMasterRekening() {
		return this.repository;
	}

}
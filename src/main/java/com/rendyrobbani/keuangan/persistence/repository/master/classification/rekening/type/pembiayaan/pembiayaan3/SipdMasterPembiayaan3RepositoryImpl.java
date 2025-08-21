package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.pembiayaan.pembiayaan3;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pembiayaan.pembiayaan3.DataMasterPembiayaan3;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pembiayaan.pembiayaan3.SipdMasterPembiayaan3;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.pembiayaan.pembiayaan3.SipdMasterPembiayaan3Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pembiayaan.pembiayaan3.SipdMasterPembiayaan3Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.AbstractSipdMasterRekening3Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.SipdMasterRekening3JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterPembiayaan3RepositoryImpl extends AbstractSipdMasterRekening3Repository<SipdMasterPembiayaan3Entity, SipdMasterPembiayaan3, DataMasterPembiayaan3> implements SipdMasterPembiayaan3Repository {

	private final SipdMasterPembiayaan3JpaRepository repository;

	@Override
	protected SipdMasterRekening3JpaRepository<SipdMasterPembiayaan3Entity, SipdMasterPembiayaan3, DataMasterPembiayaan3> repositoryOfMasterRekening() {
		return this.repository;
	}

}
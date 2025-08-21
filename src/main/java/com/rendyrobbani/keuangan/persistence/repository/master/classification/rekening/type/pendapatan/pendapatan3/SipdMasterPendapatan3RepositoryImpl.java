package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.pendapatan.pendapatan3;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan.pendapatan3.DataMasterPendapatan3;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan.pendapatan3.SipdMasterPendapatan3;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.pendapatan.pendapatan3.SipdMasterPendapatan3Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan3.SipdMasterPendapatan3Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.AbstractSipdMasterRekening3Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.SipdMasterRekening3JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterPendapatan3RepositoryImpl extends AbstractSipdMasterRekening3Repository<SipdMasterPendapatan3Entity, SipdMasterPendapatan3, DataMasterPendapatan3> implements SipdMasterPendapatan3Repository {

	private final SipdMasterPendapatan3JpaRepository repository;

	@Override
	protected SipdMasterRekening3JpaRepository<SipdMasterPendapatan3Entity, SipdMasterPendapatan3, DataMasterPendapatan3> repositoryOfMasterRekening() {
		return this.repository;
	}

}
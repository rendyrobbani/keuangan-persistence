package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.pendapatan.pendapatan1;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan.pendapatan1.DataMasterPendapatan1;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan.pendapatan1.SipdMasterPendapatan1;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.pendapatan.pendapatan1.SipdMasterPendapatan1Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan1.SipdMasterPendapatan1Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1.AbstractSipdMasterRekening1Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1.SipdMasterRekening1JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterPendapatan1RepositoryImpl extends AbstractSipdMasterRekening1Repository<SipdMasterPendapatan1Entity, SipdMasterPendapatan1, DataMasterPendapatan1> implements SipdMasterPendapatan1Repository {

	private final SipdMasterPendapatan1JpaRepository repository;

	@Override
	protected SipdMasterRekening1JpaRepository<SipdMasterPendapatan1Entity, SipdMasterPendapatan1, DataMasterPendapatan1> repositoryOfMasterRekening() {
		return this.repository;
	}

}
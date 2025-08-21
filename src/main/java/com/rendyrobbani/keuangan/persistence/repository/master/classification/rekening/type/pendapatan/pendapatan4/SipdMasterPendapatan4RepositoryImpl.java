package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.pendapatan.pendapatan4;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan.pendapatan4.DataMasterPendapatan4;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan.pendapatan4.SipdMasterPendapatan4;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.pendapatan.pendapatan4.SipdMasterPendapatan4Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan4.SipdMasterPendapatan4Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.AbstractSipdMasterRekening4Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.SipdMasterRekening4JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterPendapatan4RepositoryImpl extends AbstractSipdMasterRekening4Repository<SipdMasterPendapatan4Entity, SipdMasterPendapatan4, DataMasterPendapatan4> implements SipdMasterPendapatan4Repository {

	private final SipdMasterPendapatan4JpaRepository repository;

	@Override
	protected SipdMasterRekening4JpaRepository<SipdMasterPendapatan4Entity, SipdMasterPendapatan4, DataMasterPendapatan4> repositoryOfMasterRekening() {
		return this.repository;
	}

}
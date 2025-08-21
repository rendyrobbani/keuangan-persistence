package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.pendapatan.pendapatan6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan.pendapatan6.DataMasterPendapatan6;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan.pendapatan6.SipdMasterPendapatan6;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.pendapatan.pendapatan6.SipdMasterPendapatan6Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan6.SipdMasterPendapatan6Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.AbstractSipdMasterRekening6Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.SipdMasterRekening6JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterPendapatan6RepositoryImpl extends AbstractSipdMasterRekening6Repository<SipdMasterPendapatan6Entity, SipdMasterPendapatan6, DataMasterPendapatan6> implements SipdMasterPendapatan6Repository {

	private final SipdMasterPendapatan6JpaRepository repository;

	@Override
	protected SipdMasterRekening6JpaRepository<SipdMasterPendapatan6Entity, SipdMasterPendapatan6, DataMasterPendapatan6> repositoryOfMasterRekening() {
		return this.repository;
	}

}
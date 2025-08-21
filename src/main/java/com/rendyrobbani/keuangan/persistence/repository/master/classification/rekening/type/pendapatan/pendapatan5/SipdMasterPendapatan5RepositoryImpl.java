package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.pendapatan.pendapatan5;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan.pendapatan5.DataMasterPendapatan5;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan.pendapatan5.SipdMasterPendapatan5;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.pendapatan.pendapatan5.SipdMasterPendapatan5Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan5.SipdMasterPendapatan5Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.AbstractSipdMasterRekening5Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.SipdMasterRekening5JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterPendapatan5RepositoryImpl extends AbstractSipdMasterRekening5Repository<SipdMasterPendapatan5Entity, SipdMasterPendapatan5, DataMasterPendapatan5> implements SipdMasterPendapatan5Repository {

	private final SipdMasterPendapatan5JpaRepository repository;

	@Override
	protected SipdMasterRekening5JpaRepository<SipdMasterPendapatan5Entity, SipdMasterPendapatan5, DataMasterPendapatan5> repositoryOfMasterRekening() {
		return this.repository;
	}

}
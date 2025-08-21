package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.pendapatan.pendapatan2;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan.pendapatan2.DataMasterPendapatan2;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan.pendapatan2.SipdMasterPendapatan2;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.pendapatan.pendapatan2.SipdMasterPendapatan2Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan2.SipdMasterPendapatan2Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.AbstractSipdMasterRekening2Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.SipdMasterRekening2JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterPendapatan2RepositoryImpl extends AbstractSipdMasterRekening2Repository<SipdMasterPendapatan2Entity, SipdMasterPendapatan2, DataMasterPendapatan2> implements SipdMasterPendapatan2Repository {

	private final SipdMasterPendapatan2JpaRepository repository;

	@Override
	protected SipdMasterRekening2JpaRepository<SipdMasterPendapatan2Entity, SipdMasterPendapatan2, DataMasterPendapatan2> repositoryOfMasterRekening() {
		return this.repository;
	}

}
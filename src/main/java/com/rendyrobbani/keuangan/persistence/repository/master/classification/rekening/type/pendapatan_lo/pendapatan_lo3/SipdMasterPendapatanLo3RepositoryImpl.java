package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.pendapatan_lo.pendapatan_lo3;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo3.DataMasterPendapatanLo3;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo3.SipdMasterPendapatanLo3;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.pendapatan_lo.pendapatan_lo3.SipdMasterPendapatanLo3Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo3.SipdMasterPendapatanLo3Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.AbstractSipdMasterRekening3Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.SipdMasterRekening3JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterPendapatanLo3RepositoryImpl extends AbstractSipdMasterRekening3Repository<SipdMasterPendapatanLo3Entity, SipdMasterPendapatanLo3, DataMasterPendapatanLo3> implements SipdMasterPendapatanLo3Repository {

	private final SipdMasterPendapatanLo3JpaRepository repository;

	@Override
	protected SipdMasterRekening3JpaRepository<SipdMasterPendapatanLo3Entity, SipdMasterPendapatanLo3, DataMasterPendapatanLo3> repositoryOfMasterRekening() {
		return this.repository;
	}

}
package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.pendapatan_lo.pendapatan_lo1;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo1.DataMasterPendapatanLo1;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo1.SipdMasterPendapatanLo1;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.pendapatan_lo.pendapatan_lo1.SipdMasterPendapatanLo1Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo1.SipdMasterPendapatanLo1Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1.AbstractSipdMasterRekening1Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1.SipdMasterRekening1JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterPendapatanLo1RepositoryImpl extends AbstractSipdMasterRekening1Repository<SipdMasterPendapatanLo1Entity, SipdMasterPendapatanLo1, DataMasterPendapatanLo1> implements SipdMasterPendapatanLo1Repository {

	private final SipdMasterPendapatanLo1JpaRepository repository;

	@Override
	protected SipdMasterRekening1JpaRepository<SipdMasterPendapatanLo1Entity, SipdMasterPendapatanLo1, DataMasterPendapatanLo1> repositoryOfMasterRekening() {
		return this.repository;
	}

}
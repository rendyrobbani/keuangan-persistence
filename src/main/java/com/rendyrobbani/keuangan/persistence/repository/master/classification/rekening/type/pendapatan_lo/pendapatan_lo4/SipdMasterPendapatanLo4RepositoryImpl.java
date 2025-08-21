package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.pendapatan_lo.pendapatan_lo4;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo4.DataMasterPendapatanLo4;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo4.SipdMasterPendapatanLo4;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.pendapatan_lo.pendapatan_lo4.SipdMasterPendapatanLo4Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo4.SipdMasterPendapatanLo4Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.AbstractSipdMasterRekening4Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.SipdMasterRekening4JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterPendapatanLo4RepositoryImpl extends AbstractSipdMasterRekening4Repository<SipdMasterPendapatanLo4Entity, SipdMasterPendapatanLo4, DataMasterPendapatanLo4> implements SipdMasterPendapatanLo4Repository {

	private final SipdMasterPendapatanLo4JpaRepository repository;

	@Override
	protected SipdMasterRekening4JpaRepository<SipdMasterPendapatanLo4Entity, SipdMasterPendapatanLo4, DataMasterPendapatanLo4> repositoryOfMasterRekening() {
		return this.repository;
	}

}
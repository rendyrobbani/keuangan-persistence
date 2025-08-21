package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.pendapatan_lo.pendapatan_lo6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo6.DataMasterPendapatanLo6;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo6.SipdMasterPendapatanLo6;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.pendapatan_lo.pendapatan_lo6.SipdMasterPendapatanLo6Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo6.SipdMasterPendapatanLo6Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.AbstractSipdMasterRekening6Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.SipdMasterRekening6JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterPendapatanLo6RepositoryImpl extends AbstractSipdMasterRekening6Repository<SipdMasterPendapatanLo6Entity, SipdMasterPendapatanLo6, DataMasterPendapatanLo6> implements SipdMasterPendapatanLo6Repository {

	private final SipdMasterPendapatanLo6JpaRepository repository;

	@Override
	protected SipdMasterRekening6JpaRepository<SipdMasterPendapatanLo6Entity, SipdMasterPendapatanLo6, DataMasterPendapatanLo6> repositoryOfMasterRekening() {
		return this.repository;
	}

}
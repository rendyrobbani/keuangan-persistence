package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.pendapatan_lo.pendapatan_lo2;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo2.DataMasterPendapatanLo2;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo2.SipdMasterPendapatanLo2;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.pendapatan_lo.pendapatan_lo2.SipdMasterPendapatanLo2Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo2.SipdMasterPendapatanLo2Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.AbstractSipdMasterRekening2Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.SipdMasterRekening2JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterPendapatanLo2RepositoryImpl extends AbstractSipdMasterRekening2Repository<SipdMasterPendapatanLo2Entity, SipdMasterPendapatanLo2, DataMasterPendapatanLo2> implements SipdMasterPendapatanLo2Repository {

	private final SipdMasterPendapatanLo2JpaRepository repository;

	@Override
	protected SipdMasterRekening2JpaRepository<SipdMasterPendapatanLo2Entity, SipdMasterPendapatanLo2, DataMasterPendapatanLo2> repositoryOfMasterRekening() {
		return this.repository;
	}

}
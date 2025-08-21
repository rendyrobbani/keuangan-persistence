package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.pendapatan_lo.pendapatan_lo5;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo5.DataMasterPendapatanLo5;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo5.SipdMasterPendapatanLo5;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.pendapatan_lo.pendapatan_lo5.SipdMasterPendapatanLo5Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo5.SipdMasterPendapatanLo5Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.AbstractSipdMasterRekening5Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.SipdMasterRekening5JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterPendapatanLo5RepositoryImpl extends AbstractSipdMasterRekening5Repository<SipdMasterPendapatanLo5Entity, SipdMasterPendapatanLo5, DataMasterPendapatanLo5> implements SipdMasterPendapatanLo5Repository {

	private final SipdMasterPendapatanLo5JpaRepository repository;

	@Override
	protected SipdMasterRekening5JpaRepository<SipdMasterPendapatanLo5Entity, SipdMasterPendapatanLo5, DataMasterPendapatanLo5> repositoryOfMasterRekening() {
		return this.repository;
	}

}
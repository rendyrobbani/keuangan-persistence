package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.pendapatan_lo.pendapatan_lo6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo6.DataMasterPendapatanLo6;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.pendapatan_lo.pendapatan_lo6.DataMasterPendapatanLo6Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo6.DataMasterPendapatanLo6Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.AbstractDataMasterRekening6Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.DataMasterRekening6JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterPendapatanLo6RepositoryImpl extends AbstractDataMasterRekening6Repository<DataMasterPendapatanLo6Entity, DataMasterPendapatanLo6> implements DataMasterPendapatanLo6Repository {

	private final DataMasterPendapatanLo6JpaRepository repository;

	@Override
	protected DataMasterRekening6JpaRepository<DataMasterPendapatanLo6Entity, DataMasterPendapatanLo6> repositoryOfMasterRekening() {
		return this.repository;
	}

}
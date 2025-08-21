package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.pendapatan_lo.pendapatan_lo4;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo4.DataMasterPendapatanLo4;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.pendapatan_lo.pendapatan_lo4.DataMasterPendapatanLo4Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo4.DataMasterPendapatanLo4Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.AbstractDataMasterRekening4Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.DataMasterRekening4JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterPendapatanLo4RepositoryImpl extends AbstractDataMasterRekening4Repository<DataMasterPendapatanLo4Entity, DataMasterPendapatanLo4> implements DataMasterPendapatanLo4Repository {

	private final DataMasterPendapatanLo4JpaRepository repository;

	@Override
	protected DataMasterRekening4JpaRepository<DataMasterPendapatanLo4Entity, DataMasterPendapatanLo4> repositoryOfMasterRekening() {
		return this.repository;
	}

}
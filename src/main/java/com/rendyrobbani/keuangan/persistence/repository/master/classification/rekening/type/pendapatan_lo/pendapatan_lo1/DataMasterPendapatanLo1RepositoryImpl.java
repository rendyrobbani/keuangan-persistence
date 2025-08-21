package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.pendapatan_lo.pendapatan_lo1;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo1.DataMasterPendapatanLo1;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.pendapatan_lo.pendapatan_lo1.DataMasterPendapatanLo1Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo1.DataMasterPendapatanLo1Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1.AbstractDataMasterRekening1Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1.DataMasterRekening1JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterPendapatanLo1RepositoryImpl extends AbstractDataMasterRekening1Repository<DataMasterPendapatanLo1Entity, DataMasterPendapatanLo1> implements DataMasterPendapatanLo1Repository {

	private final DataMasterPendapatanLo1JpaRepository repository;

	@Override
	protected DataMasterRekening1JpaRepository<DataMasterPendapatanLo1Entity, DataMasterPendapatanLo1> repositoryOfMasterRekening() {
		return this.repository;
	}

}
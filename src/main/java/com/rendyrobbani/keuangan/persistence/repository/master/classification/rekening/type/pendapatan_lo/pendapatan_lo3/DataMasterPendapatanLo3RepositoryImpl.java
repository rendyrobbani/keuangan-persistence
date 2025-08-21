package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.pendapatan_lo.pendapatan_lo3;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo3.DataMasterPendapatanLo3;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.pendapatan_lo.pendapatan_lo3.DataMasterPendapatanLo3Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo3.DataMasterPendapatanLo3Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.AbstractDataMasterRekening3Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.DataMasterRekening3JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterPendapatanLo3RepositoryImpl extends AbstractDataMasterRekening3Repository<DataMasterPendapatanLo3Entity, DataMasterPendapatanLo3> implements DataMasterPendapatanLo3Repository {

	private final DataMasterPendapatanLo3JpaRepository repository;

	@Override
	protected DataMasterRekening3JpaRepository<DataMasterPendapatanLo3Entity, DataMasterPendapatanLo3> repositoryOfMasterRekening() {
		return this.repository;
	}

}
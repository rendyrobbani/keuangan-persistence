package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.pendapatan_lo.pendapatan_lo5;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo5.DataMasterPendapatanLo5;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.pendapatan_lo.pendapatan_lo5.DataMasterPendapatanLo5Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo5.DataMasterPendapatanLo5Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.AbstractDataMasterRekening5Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.DataMasterRekening5JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterPendapatanLo5RepositoryImpl extends AbstractDataMasterRekening5Repository<DataMasterPendapatanLo5Entity, DataMasterPendapatanLo5> implements DataMasterPendapatanLo5Repository {

	private final DataMasterPendapatanLo5JpaRepository repository;

	@Override
	protected DataMasterRekening5JpaRepository<DataMasterPendapatanLo5Entity, DataMasterPendapatanLo5> repositoryOfMasterRekening() {
		return this.repository;
	}

}
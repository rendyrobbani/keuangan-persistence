package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.pendapatan_lo.pendapatan_lo2;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo2.DataMasterPendapatanLo2;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.pendapatan_lo.pendapatan_lo2.DataMasterPendapatanLo2Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo2.DataMasterPendapatanLo2Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.AbstractDataMasterRekening2Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.DataMasterRekening2JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterPendapatanLo2RepositoryImpl extends AbstractDataMasterRekening2Repository<DataMasterPendapatanLo2Entity, DataMasterPendapatanLo2> implements DataMasterPendapatanLo2Repository {

	private final DataMasterPendapatanLo2JpaRepository repository;

	@Override
	protected DataMasterRekening2JpaRepository<DataMasterPendapatanLo2Entity, DataMasterPendapatanLo2> repositoryOfMasterRekening() {
		return this.repository;
	}

}
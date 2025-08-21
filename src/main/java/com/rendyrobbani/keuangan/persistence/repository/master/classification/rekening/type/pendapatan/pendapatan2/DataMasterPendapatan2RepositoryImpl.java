package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.pendapatan.pendapatan2;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan.pendapatan2.DataMasterPendapatan2;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.pendapatan.pendapatan2.DataMasterPendapatan2Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan2.DataMasterPendapatan2Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.AbstractDataMasterRekening2Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.DataMasterRekening2JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterPendapatan2RepositoryImpl extends AbstractDataMasterRekening2Repository<DataMasterPendapatan2Entity, DataMasterPendapatan2> implements DataMasterPendapatan2Repository {

	private final DataMasterPendapatan2JpaRepository repository;

	@Override
	protected DataMasterRekening2JpaRepository<DataMasterPendapatan2Entity, DataMasterPendapatan2> repositoryOfMasterRekening() {
		return this.repository;
	}

}
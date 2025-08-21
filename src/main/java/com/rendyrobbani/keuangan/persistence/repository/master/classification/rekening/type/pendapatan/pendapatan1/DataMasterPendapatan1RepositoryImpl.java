package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.pendapatan.pendapatan1;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan.pendapatan1.DataMasterPendapatan1;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.pendapatan.pendapatan1.DataMasterPendapatan1Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan1.DataMasterPendapatan1Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1.AbstractDataMasterRekening1Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1.DataMasterRekening1JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterPendapatan1RepositoryImpl extends AbstractDataMasterRekening1Repository<DataMasterPendapatan1Entity, DataMasterPendapatan1> implements DataMasterPendapatan1Repository {

	private final DataMasterPendapatan1JpaRepository repository;

	@Override
	protected DataMasterRekening1JpaRepository<DataMasterPendapatan1Entity, DataMasterPendapatan1> repositoryOfMasterRekening() {
		return this.repository;
	}

}
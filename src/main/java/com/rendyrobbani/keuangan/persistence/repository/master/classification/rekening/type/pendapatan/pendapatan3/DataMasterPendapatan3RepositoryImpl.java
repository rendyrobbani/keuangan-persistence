package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.pendapatan.pendapatan3;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan.pendapatan3.DataMasterPendapatan3;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.pendapatan.pendapatan3.DataMasterPendapatan3Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan3.DataMasterPendapatan3Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.AbstractDataMasterRekening3Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.DataMasterRekening3JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterPendapatan3RepositoryImpl extends AbstractDataMasterRekening3Repository<DataMasterPendapatan3Entity, DataMasterPendapatan3> implements DataMasterPendapatan3Repository {

	private final DataMasterPendapatan3JpaRepository repository;

	@Override
	protected DataMasterRekening3JpaRepository<DataMasterPendapatan3Entity, DataMasterPendapatan3> repositoryOfMasterRekening() {
		return this.repository;
	}

}
package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.pendapatan.pendapatan3;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan.pendapatan3.DataMasterRekeningPendapatan3;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.pendapatan.pendapatan3.DataMasterRekeningPendapatan3Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan3.DataMasterRekeningPendapatan3Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.AbstractDataMasterRekening3Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.DataMasterRekening3JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterRekeningPendapatan3RepositoryImpl extends AbstractDataMasterRekening3Repository<DataMasterRekeningPendapatan3Entity, DataMasterRekeningPendapatan3> implements DataMasterRekeningPendapatan3Repository {

	private final DataMasterRekeningPendapatan3JpaRepository repository;

	@Override
	protected DataMasterRekening3JpaRepository<DataMasterRekeningPendapatan3Entity, DataMasterRekeningPendapatan3> repositoryOfMasterRekening() {
		return this.repository;
	}

}
package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.pendapatan.pendapatan1;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan.pendapatan1.DataMasterRekeningPendapatan1;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.pendapatan.pendapatan1.DataMasterRekeningPendapatan1Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan1.DataMasterRekeningPendapatan1Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1.AbstractDataMasterRekening1Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1.DataMasterRekening1JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterRekeningPendapatan1RepositoryImpl extends AbstractDataMasterRekening1Repository<DataMasterRekeningPendapatan1Entity, DataMasterRekeningPendapatan1> implements DataMasterRekeningPendapatan1Repository {

	private final DataMasterRekeningPendapatan1JpaRepository repository;

	@Override
	protected DataMasterRekening1JpaRepository<DataMasterRekeningPendapatan1Entity, DataMasterRekeningPendapatan1> repositoryOfMasterRekening() {
		return this.repository;
	}

}
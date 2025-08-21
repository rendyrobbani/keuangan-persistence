package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.pendapatan.pendapatan5;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan.pendapatan5.DataMasterPendapatan5;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.pendapatan.pendapatan5.DataMasterPendapatan5Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan5.DataMasterPendapatan5Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.AbstractDataMasterRekening5Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.DataMasterRekening5JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterPendapatan5RepositoryImpl extends AbstractDataMasterRekening5Repository<DataMasterPendapatan5Entity, DataMasterPendapatan5> implements DataMasterPendapatan5Repository {

	private final DataMasterPendapatan5JpaRepository repository;

	@Override
	protected DataMasterRekening5JpaRepository<DataMasterPendapatan5Entity, DataMasterPendapatan5> repositoryOfMasterRekening() {
		return this.repository;
	}

}
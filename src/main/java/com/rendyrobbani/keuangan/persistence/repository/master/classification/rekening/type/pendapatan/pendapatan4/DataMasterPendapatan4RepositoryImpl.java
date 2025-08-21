package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.pendapatan.pendapatan4;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan.pendapatan4.DataMasterPendapatan4;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.pendapatan.pendapatan4.DataMasterPendapatan4Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan4.DataMasterPendapatan4Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.AbstractDataMasterRekening4Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.DataMasterRekening4JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterPendapatan4RepositoryImpl extends AbstractDataMasterRekening4Repository<DataMasterPendapatan4Entity, DataMasterPendapatan4> implements DataMasterPendapatan4Repository {

	private final DataMasterPendapatan4JpaRepository repository;

	@Override
	protected DataMasterRekening4JpaRepository<DataMasterPendapatan4Entity, DataMasterPendapatan4> repositoryOfMasterRekening() {
		return this.repository;
	}

}
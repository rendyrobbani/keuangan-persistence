package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.pendapatan.pendapatan4;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan.pendapatan4.DataMasterRekeningPendapatan4;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.pendapatan.pendapatan4.DataMasterRekeningPendapatan4Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan4.DataMasterRekeningPendapatan4Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.AbstractDataMasterRekening4Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.DataMasterRekening4JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterRekeningPendapatan4RepositoryImpl extends AbstractDataMasterRekening4Repository<DataMasterRekeningPendapatan4Entity, DataMasterRekeningPendapatan4> implements DataMasterRekeningPendapatan4Repository {

	private final DataMasterRekeningPendapatan4JpaRepository repository;

	@Override
	protected DataMasterRekening4JpaRepository<DataMasterRekeningPendapatan4Entity, DataMasterRekeningPendapatan4> repositoryOfMasterRekening() {
		return this.repository;
	}

}
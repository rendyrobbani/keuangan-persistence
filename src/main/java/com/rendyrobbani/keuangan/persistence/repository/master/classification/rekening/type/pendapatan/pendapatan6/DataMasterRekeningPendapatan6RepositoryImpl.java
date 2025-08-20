package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.pendapatan.pendapatan6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan.pendapatan6.DataMasterRekeningPendapatan6;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.pendapatan.pendapatan6.DataMasterRekeningPendapatan6Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan6.DataMasterRekeningPendapatan6Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.AbstractDataMasterRekening6Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.DataMasterRekening6JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterRekeningPendapatan6RepositoryImpl extends AbstractDataMasterRekening6Repository<DataMasterRekeningPendapatan6Entity, DataMasterRekeningPendapatan6> implements DataMasterRekeningPendapatan6Repository {

	private final DataMasterRekeningPendapatan6JpaRepository repository;

	@Override
	protected DataMasterRekening6JpaRepository<DataMasterRekeningPendapatan6Entity, DataMasterRekeningPendapatan6> repositoryOfMasterRekening() {
		return this.repository;
	}

}
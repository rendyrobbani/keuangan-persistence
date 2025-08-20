package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.pendapatan.pendapatan5;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan.pendapatan5.DataMasterRekeningPendapatan5;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.pendapatan.pendapatan5.DataMasterRekeningPendapatan5Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan5.DataMasterRekeningPendapatan5Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.AbstractDataMasterRekening5Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.DataMasterRekening5JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterRekeningPendapatan5RepositoryImpl extends AbstractDataMasterRekening5Repository<DataMasterRekeningPendapatan5Entity, DataMasterRekeningPendapatan5> implements DataMasterRekeningPendapatan5Repository {

	private final DataMasterRekeningPendapatan5JpaRepository repository;

	@Override
	protected DataMasterRekening5JpaRepository<DataMasterRekeningPendapatan5Entity, DataMasterRekeningPendapatan5> repositoryOfMasterRekening() {
		return this.repository;
	}

}
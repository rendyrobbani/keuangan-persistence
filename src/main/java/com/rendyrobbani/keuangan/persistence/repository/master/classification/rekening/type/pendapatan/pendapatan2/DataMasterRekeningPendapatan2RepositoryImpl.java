package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.pendapatan.pendapatan2;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan.pendapatan2.DataMasterRekeningPendapatan2;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.pendapatan.pendapatan2.DataMasterRekeningPendapatan2Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan2.DataMasterRekeningPendapatan2Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.AbstractDataMasterRekening2Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.DataMasterRekening2JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterRekeningPendapatan2RepositoryImpl extends AbstractDataMasterRekening2Repository<DataMasterRekeningPendapatan2Entity, DataMasterRekeningPendapatan2> implements DataMasterRekeningPendapatan2Repository {

	private final DataMasterRekeningPendapatan2JpaRepository repository;

	@Override
	protected DataMasterRekening2JpaRepository<DataMasterRekeningPendapatan2Entity, DataMasterRekeningPendapatan2> repositoryOfMasterRekening() {
		return this.repository;
	}

}
package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.beban.beban3;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban3.DataMasterRekeningBeban3;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.beban.beban3.DataMasterRekeningBeban3Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban3.DataMasterRekeningBeban3Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.AbstractDataMasterRekening3Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.DataMasterRekening3JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterRekeningBeban3RepositoryImpl extends AbstractDataMasterRekening3Repository<DataMasterRekeningBeban3Entity, DataMasterRekeningBeban3> implements DataMasterRekeningBeban3Repository {

	private final DataMasterRekeningBeban3JpaRepository repository;

	@Override
	protected DataMasterRekening3JpaRepository<DataMasterRekeningBeban3Entity, DataMasterRekeningBeban3> repositoryOfMasterRekening() {
		return this.repository;
	}

}
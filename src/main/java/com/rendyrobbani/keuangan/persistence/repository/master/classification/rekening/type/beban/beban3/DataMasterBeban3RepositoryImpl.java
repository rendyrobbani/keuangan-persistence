package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.beban.beban3;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban3.DataMasterBeban3;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.beban.beban3.DataMasterBeban3Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban3.DataMasterBeban3Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.AbstractDataMasterRekening3Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.DataMasterRekening3JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterBeban3RepositoryImpl extends AbstractDataMasterRekening3Repository<DataMasterBeban3Entity, DataMasterBeban3> implements DataMasterBeban3Repository {

	private final DataMasterBeban3JpaRepository repository;

	@Override
	protected DataMasterRekening3JpaRepository<DataMasterBeban3Entity, DataMasterBeban3> repositoryOfMasterRekening() {
		return this.repository;
	}

}
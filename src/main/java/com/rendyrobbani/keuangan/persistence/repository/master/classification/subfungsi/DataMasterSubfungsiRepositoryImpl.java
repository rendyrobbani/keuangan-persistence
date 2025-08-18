package com.rendyrobbani.keuangan.persistence.repository.master.classification.subfungsi;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.subfungsi.DataMasterSubfungsi;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.subfungsi.DataMasterSubfungsiRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.subfungsi.DataMasterSubfungsiEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractDataMasterClassificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterSubfungsiRepositoryImpl extends AbstractDataMasterClassificationRepository<DataMasterSubfungsiEntity, DataMasterSubfungsi> implements DataMasterSubfungsiRepository {

	private final DataMasterSubfungsiJpaRepository repository;

	@Override
	protected JpaRepository<DataMasterSubfungsiEntity, String> repository() {
		return repository;
	}

}
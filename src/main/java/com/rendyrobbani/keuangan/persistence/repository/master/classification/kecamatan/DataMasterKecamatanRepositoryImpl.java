package com.rendyrobbani.keuangan.persistence.repository.master.classification.kecamatan;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kecamatan.DataMasterKecamatan;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.kecamatan.DataMasterKecamatanRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.kecamatan.DataMasterKecamatanEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractDataMasterClassificationRepository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.DataMasterClassificationJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterKecamatanRepositoryImpl extends AbstractDataMasterClassificationRepository<DataMasterKecamatanEntity, DataMasterKecamatan> implements DataMasterKecamatanRepository {

	private final DataMasterKecamatanJpaRepository repository;

	@Override
	protected DataMasterClassificationJpaRepository<DataMasterKecamatanEntity, DataMasterKecamatan> repositoryOfMasterClassifcation() {
		return this.repository;
	}

}
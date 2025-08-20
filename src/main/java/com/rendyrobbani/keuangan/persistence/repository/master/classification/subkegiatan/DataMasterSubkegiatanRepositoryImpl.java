package com.rendyrobbani.keuangan.persistence.repository.master.classification.subkegiatan;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.subkegiatan.DataMasterSubkegiatan;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.subkegiatan.DataMasterSubkegiatanRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.subkegiatan.DataMasterSubkegiatanEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractDataMasterClassificationRepository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.DataMasterClassificationJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterSubkegiatanRepositoryImpl extends AbstractDataMasterClassificationRepository<DataMasterSubkegiatanEntity, DataMasterSubkegiatan> implements DataMasterSubkegiatanRepository {

	private final DataMasterSubkegiatanJpaRepository repository;

	@Override
	protected DataMasterClassificationJpaRepository<DataMasterSubkegiatanEntity, DataMasterSubkegiatan> repositoryOfMasterClassifcation() {
		return this.repository;
	}

}
package com.rendyrobbani.keuangan.persistence.repository.master.classification.kegiatan;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kegiatan.DataMasterKegiatan;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.kegiatan.DataMasterKegiatanRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.kegiatan.DataMasterKegiatanEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractDataMasterClassificationRepository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.DataMasterClassificationJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterKegiatanRepositoryImpl extends AbstractDataMasterClassificationRepository<DataMasterKegiatanEntity, DataMasterKegiatan> implements DataMasterKegiatanRepository {

	private final DataMasterKegiatanJpaRepository repository;

	@Override
	protected DataMasterClassificationJpaRepository<DataMasterKegiatanEntity, DataMasterKegiatan> repositoryOfMasterClassifcation() {
		return this.repository;
	}

}
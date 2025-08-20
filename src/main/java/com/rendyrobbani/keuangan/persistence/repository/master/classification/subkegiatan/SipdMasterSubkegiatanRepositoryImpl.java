package com.rendyrobbani.keuangan.persistence.repository.master.classification.subkegiatan;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.subkegiatan.DataMasterSubkegiatan;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.subkegiatan.SipdMasterSubkegiatan;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.subkegiatan.SipdMasterSubkegiatanRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.subkegiatan.SipdMasterSubkegiatanEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractSipdMasterClassificationRepository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.SipdMasterClassificationJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterSubkegiatanRepositoryImpl extends AbstractSipdMasterClassificationRepository<SipdMasterSubkegiatanEntity, SipdMasterSubkegiatan, DataMasterSubkegiatan> implements SipdMasterSubkegiatanRepository {

	private final SipdMasterSubkegiatanJpaRepository repository;

	@Override
	protected SipdMasterClassificationJpaRepository<SipdMasterSubkegiatanEntity, SipdMasterSubkegiatan, DataMasterSubkegiatan> repositoryOfMasterClassification() {
		return this.repository;
	}

}
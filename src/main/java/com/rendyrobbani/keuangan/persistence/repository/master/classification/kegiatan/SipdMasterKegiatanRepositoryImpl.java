package com.rendyrobbani.keuangan.persistence.repository.master.classification.kegiatan;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kegiatan.DataMasterKegiatan;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kegiatan.SipdMasterKegiatan;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.kegiatan.SipdMasterKegiatanRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.kegiatan.SipdMasterKegiatanEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractSipdMasterClassificationRepository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.SipdMasterClassificationJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterKegiatanRepositoryImpl extends AbstractSipdMasterClassificationRepository<SipdMasterKegiatanEntity, SipdMasterKegiatan, DataMasterKegiatan> implements SipdMasterKegiatanRepository {

	private final SipdMasterKegiatanJpaRepository repository;

	@Override
	protected SipdMasterClassificationJpaRepository<SipdMasterKegiatanEntity, SipdMasterKegiatan, DataMasterKegiatan> repositoryOfMasterClassification() {
		return this.repository;
	}

}
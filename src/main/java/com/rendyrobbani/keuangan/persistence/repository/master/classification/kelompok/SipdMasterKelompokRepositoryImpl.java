package com.rendyrobbani.keuangan.persistence.repository.master.classification.kelompok;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kelompok.DataMasterKelompok;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kelompok.SipdMasterKelompok;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.kelompok.SipdMasterKelompokRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.kelompok.SipdMasterKelompokEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractSipdMasterClassificationRepository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.SipdMasterClassificationJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterKelompokRepositoryImpl extends AbstractSipdMasterClassificationRepository<SipdMasterKelompokEntity, SipdMasterKelompok, DataMasterKelompok> implements SipdMasterKelompokRepository {

	private final SipdMasterKelompokJpaRepository repository;

	@Override
	protected SipdMasterClassificationJpaRepository<SipdMasterKelompokEntity, SipdMasterKelompok, DataMasterKelompok> repositoryOfMasterClassification() {
		return this.repository;
	}

}
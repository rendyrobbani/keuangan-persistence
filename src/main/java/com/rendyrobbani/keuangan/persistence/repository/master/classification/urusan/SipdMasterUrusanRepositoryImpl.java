package com.rendyrobbani.keuangan.persistence.repository.master.classification.urusan;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.urusan.DataMasterUrusan;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.urusan.SipdMasterUrusan;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.urusan.SipdMasterUrusanRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.urusan.SipdMasterUrusanEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractSipdMasterClassificationRepository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.SipdMasterClassificationJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterUrusanRepositoryImpl extends AbstractSipdMasterClassificationRepository<SipdMasterUrusanEntity, SipdMasterUrusan, DataMasterUrusan> implements SipdMasterUrusanRepository {

	private final SipdMasterUrusanJpaRepository repository;

	@Override
	protected SipdMasterClassificationJpaRepository<SipdMasterUrusanEntity, SipdMasterUrusan, DataMasterUrusan> repositoryOfMasterClassification() {
		return this.repository;
	}

}
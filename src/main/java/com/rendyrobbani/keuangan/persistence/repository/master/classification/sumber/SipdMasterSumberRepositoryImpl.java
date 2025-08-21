package com.rendyrobbani.keuangan.persistence.repository.master.classification.sumber;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.sumber.DataMasterSumber;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.sumber.SipdMasterSumber;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.sumber.SipdMasterSumberRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.sumber.SipdMasterSumberEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractSipdMasterClassificationRepository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.SipdMasterClassificationJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterSumberRepositoryImpl extends AbstractSipdMasterClassificationRepository<SipdMasterSumberEntity, SipdMasterSumber, DataMasterSumber> implements SipdMasterSumberRepository {

	private final SipdMasterSumberJpaRepository repository;

	@Override
	protected SipdMasterClassificationJpaRepository<SipdMasterSumberEntity, SipdMasterSumber, DataMasterSumber> repositoryOfMasterClassification() {
		return this.repository;
	}

}
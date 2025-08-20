package com.rendyrobbani.keuangan.persistence.repository.master.classification.bidang;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.bidang.DataMasterBidang;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.bidang.SipdMasterBidang;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.bidang.SipdMasterBidangRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.bidang.SipdMasterBidangEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractSipdMasterClassificationRepository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.SipdMasterClassificationJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterBidangRepositoryImpl extends AbstractSipdMasterClassificationRepository<SipdMasterBidangEntity, SipdMasterBidang, DataMasterBidang> implements SipdMasterBidangRepository {

	private final SipdMasterBidangJpaRepository repository;

	@Override
	protected SipdMasterClassificationJpaRepository<SipdMasterBidangEntity, SipdMasterBidang, DataMasterBidang> repositoryOfMasterClassification() {
		return this.repository;
	}

}
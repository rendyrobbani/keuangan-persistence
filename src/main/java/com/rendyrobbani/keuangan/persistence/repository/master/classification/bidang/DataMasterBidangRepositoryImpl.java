package com.rendyrobbani.keuangan.persistence.repository.master.classification.bidang;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.bidang.DataMasterBidang;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.bidang.DataMasterBidangRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.bidang.DataMasterBidangEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractDataMasterClassificationRepository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.DataMasterClassificationJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterBidangRepositoryImpl extends AbstractDataMasterClassificationRepository<DataMasterBidangEntity, DataMasterBidang> implements DataMasterBidangRepository {

	private final DataMasterBidangJpaRepository repository;

	@Override
	protected DataMasterClassificationJpaRepository<DataMasterBidangEntity, DataMasterBidang> repositoryOfMasterClassifcation() {
		return this.repository;
	}

}
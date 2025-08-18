package com.rendyrobbani.keuangan.persistence.repository.master.classification.bidang;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.bidang.DataMasterBidang;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.bidang.DataMasterBidangRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.bidang.DataMasterBidangEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractDataMasterClassificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class DataMasterBidangRepositoryImpl extends AbstractDataMasterClassificationRepository<DataMasterBidangEntity, DataMasterBidang> implements DataMasterBidangRepository {

	private final DataMasterBidangJpaRepository repository;

	@Override
	protected JpaRepository<DataMasterBidangEntity, String> repository() {
		return repository;
	}

	@Override
	public List<DataMasterBidang> findByIsDeletedFalse() {
		return this.repository.findByIsDeleted(false).stream().map(DataMasterBidangEntity::toDomain).toList();
	}

	@Override
	public List<DataMasterBidang> findByIsDeletedTrue() {
		return this.repository.findByIsDeleted(true).stream().map(DataMasterBidangEntity::toDomain).toList();
	}

}
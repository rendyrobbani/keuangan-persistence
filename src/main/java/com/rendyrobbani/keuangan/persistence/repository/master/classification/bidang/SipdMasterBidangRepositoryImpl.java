package com.rendyrobbani.keuangan.persistence.repository.master.classification.bidang;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.bidang.DataMasterBidang;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.bidang.SipdMasterBidang;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.bidang.SipdMasterBidangRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.bidang.SipdMasterBidangEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractSipdMasterClassificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class SipdMasterBidangRepositoryImpl extends AbstractSipdMasterClassificationRepository<SipdMasterBidangEntity, SipdMasterBidang, DataMasterBidang> implements SipdMasterBidangRepository {

	private final SipdMasterBidangJpaRepository repository;

	@Override
	protected JpaRepository<SipdMasterBidangEntity, Long> repository() {
		return repository;
	}

	@Override
	public List<SipdMasterBidang> findByIsDeletedFalse() {
		return this.repository.findByIsDeleted(false).stream().map(SipdMasterBidangEntity::toDomain).toList();
	}

	@Override
	public List<SipdMasterBidang> findByIsDeletedTrue() {
		return this.repository.findByIsDeleted(true).stream().map(SipdMasterBidangEntity::toDomain).toList();
	}

	@Override
	public List<SipdMasterBidang> findBySubjectId(String subjectId) {
		return this.repository.findBySubjectId(subjectId).stream().map(SipdMasterBidangEntity::toDomain).toList();
	}

	@Override
	public List<SipdMasterBidang> findBySubjectIdAndIsDeletedFalse(String subjectId) {
		return this.repository.findBySubjectIdAndIsDeleted(subjectId, false).stream().map(SipdMasterBidangEntity::toDomain).toList();
	}

	@Override
	public List<SipdMasterBidang> findBySubjectIdAndIsDeletedTrue(String subjectId) {
		return this.repository.findBySubjectIdAndIsDeleted(subjectId, true).stream().map(SipdMasterBidangEntity::toDomain).toList();
	}

}
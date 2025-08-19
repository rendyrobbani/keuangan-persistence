package com.rendyrobbani.keuangan.persistence.repository.master.classification.kelurahan;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kelurahan.DataMasterKelurahan;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kelurahan.SipdMasterKelurahan;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.kelurahan.SipdMasterKelurahanRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.kelurahan.SipdMasterKelurahanEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractSipdMasterClassificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class SipdMasterKelurahanRepositoryImpl extends AbstractSipdMasterClassificationRepository<SipdMasterKelurahanEntity, SipdMasterKelurahan, DataMasterKelurahan> implements SipdMasterKelurahanRepository {

	private final SipdMasterKelurahanJpaRepository repository;

	@Override
	protected JpaRepository<SipdMasterKelurahanEntity, Long> repository() {
		return repository;
	}

	@Override
	public List<SipdMasterKelurahan> findByIsDeletedFalse() {
		return this.repository.findByIsDeleted(false).stream().map(SipdMasterKelurahanEntity::toDomain).toList();
	}

	@Override
	public List<SipdMasterKelurahan> findByIsDeletedTrue() {
		return this.repository.findByIsDeleted(true).stream().map(SipdMasterKelurahanEntity::toDomain).toList();
	}

	@Override
	public List<SipdMasterKelurahan> findBySubjectId(String subjectId) {
		return this.repository.findBySubjectId(subjectId).stream().map(SipdMasterKelurahanEntity::toDomain).toList();
	}

	@Override
	public List<SipdMasterKelurahan> findBySubjectIdAndIsDeletedFalse(String subjectId) {
		return this.repository.findBySubjectIdAndIsDeleted(subjectId, false).stream().map(SipdMasterKelurahanEntity::toDomain).toList();
	}

	@Override
	public List<SipdMasterKelurahan> findBySubjectIdAndIsDeletedTrue(String subjectId) {
		return this.repository.findBySubjectIdAndIsDeleted(subjectId, true).stream().map(SipdMasterKelurahanEntity::toDomain).toList();
	}

}
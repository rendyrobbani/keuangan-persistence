package com.rendyrobbani.keuangan.persistence.repository.master.classification.kegiatan;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kegiatan.DataMasterKegiatan;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kegiatan.SipdMasterKegiatan;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.kegiatan.SipdMasterKegiatanRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.kegiatan.SipdMasterKegiatanEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractSipdMasterClassificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class SipdMasterKegiatanRepositoryImpl extends AbstractSipdMasterClassificationRepository<SipdMasterKegiatanEntity, SipdMasterKegiatan, DataMasterKegiatan> implements SipdMasterKegiatanRepository {

	private final SipdMasterKegiatanJpaRepository repository;

	@Override
	protected JpaRepository<SipdMasterKegiatanEntity, Long> repository() {
		return repository;
	}

	@Override
	public List<SipdMasterKegiatan> findByIsDeletedFalse() {
		return this.repository.findByIsDeleted(false).stream().map(SipdMasterKegiatanEntity::toDomain).toList();
	}

	@Override
	public List<SipdMasterKegiatan> findByIsDeletedTrue() {
		return this.repository.findByIsDeleted(true).stream().map(SipdMasterKegiatanEntity::toDomain).toList();
	}

	@Override
	public List<SipdMasterKegiatan> findBySubjectId(String subjectId) {
		return this.repository.findBySubjectId(subjectId).stream().map(SipdMasterKegiatanEntity::toDomain).toList();
	}

	@Override
	public List<SipdMasterKegiatan> findBySubjectIdAndIsDeletedFalse(String subjectId) {
		return this.repository.findBySubjectIdAndIsDeleted(subjectId, false).stream().map(SipdMasterKegiatanEntity::toDomain).toList();
	}

	@Override
	public List<SipdMasterKegiatan> findBySubjectIdAndIsDeletedTrue(String subjectId) {
		return this.repository.findBySubjectIdAndIsDeleted(subjectId, true).stream().map(SipdMasterKegiatanEntity::toDomain).toList();
	}

}
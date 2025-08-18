package com.rendyrobbani.keuangan.persistence.repository.master.classification.subkegiatan;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.subkegiatan.DataMasterSubkegiatan;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.subkegiatan.SipdMasterSubkegiatan;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.subkegiatan.SipdMasterSubkegiatanRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.subkegiatan.SipdMasterSubkegiatanEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractSipdMasterClassificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class SipdMasterSubkegiatanRepositoryImpl extends AbstractSipdMasterClassificationRepository<SipdMasterSubkegiatanEntity, SipdMasterSubkegiatan, DataMasterSubkegiatan> implements SipdMasterSubkegiatanRepository {

	private final SipdMasterSubkegiatanJpaRepository repository;

	@Override
	protected JpaRepository<SipdMasterSubkegiatanEntity, Long> repository() {
		return repository;
	}

	@Override
	public List<SipdMasterSubkegiatan> findByIsDeletedFalse() {
		return this.repository.findByIsDeleted(false).stream().map(SipdMasterSubkegiatanEntity::toDomain).toList();
	}

	@Override
	public List<SipdMasterSubkegiatan> findByIsDeletedTrue() {
		return this.repository.findByIsDeleted(true).stream().map(SipdMasterSubkegiatanEntity::toDomain).toList();
	}

	@Override
	public List<SipdMasterSubkegiatan> findBySubjectId(String subjectId) {
		return this.repository.findBySubjectId(subjectId).stream().map(SipdMasterSubkegiatanEntity::toDomain).toList();
	}

	@Override
	public List<SipdMasterSubkegiatan> findBySubjectIdAndIsDeletedFalse(String subjectId) {
		return this.repository.findBySubjectIdAndIsDeleted(subjectId, false).stream().map(SipdMasterSubkegiatanEntity::toDomain).toList();
	}

	@Override
	public List<SipdMasterSubkegiatan> findBySubjectIdAndIsDeletedTrue(String subjectId) {
		return this.repository.findBySubjectIdAndIsDeleted(subjectId, true).stream().map(SipdMasterSubkegiatanEntity::toDomain).toList();
	}

}
package com.rendyrobbani.keuangan.persistence.repository.master.classification.kegiatan;

import com.rendyrobbani.keuangan.persistence.entity.master.classification.kegiatan.SipdMasterKegiatanEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SipdMasterKegiatanJpaRepository extends JpaRepository<SipdMasterKegiatanEntity, Long> {

	List<SipdMasterKegiatanEntity> findByIsDeleted(boolean isDeleted);

	List<SipdMasterKegiatanEntity> findBySubjectId(String subjectId);

	List<SipdMasterKegiatanEntity> findBySubjectIdAndIsDeleted(String subjectId, boolean isDeleted);

}
package com.rendyrobbani.keuangan.persistence.repository.master.classification.subkegiatan;

import com.rendyrobbani.keuangan.persistence.entity.master.classification.subkegiatan.SipdMasterSubkegiatanEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SipdMasterSubkegiatanJpaRepository extends JpaRepository<SipdMasterSubkegiatanEntity, Long> {

	List<SipdMasterSubkegiatanEntity> findByIsDeleted(boolean isDeleted);

	List<SipdMasterSubkegiatanEntity> findBySubjectId(String subjectId);

	List<SipdMasterSubkegiatanEntity> findBySubjectIdAndIsDeleted(String subjectId, boolean isDeleted);

}
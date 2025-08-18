package com.rendyrobbani.keuangan.persistence.repository.master.classification.urusan;

import com.rendyrobbani.keuangan.persistence.entity.master.classification.urusan.SipdMasterUrusanEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SipdMasterUrusanJpaRepository extends JpaRepository<SipdMasterUrusanEntity, Long> {

	List<SipdMasterUrusanEntity> findByIsDeleted(boolean isDeleted);

	List<SipdMasterUrusanEntity> findBySubjectId(String subjectId);

	List<SipdMasterUrusanEntity> findBySubjectIdAndIsDeleted(String subjectId, boolean isDeleted);

}
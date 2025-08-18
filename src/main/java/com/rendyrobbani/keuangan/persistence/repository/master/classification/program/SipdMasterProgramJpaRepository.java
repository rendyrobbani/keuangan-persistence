package com.rendyrobbani.keuangan.persistence.repository.master.classification.program;

import com.rendyrobbani.keuangan.persistence.entity.master.classification.program.SipdMasterProgramEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SipdMasterProgramJpaRepository extends JpaRepository<SipdMasterProgramEntity, Long> {

	List<SipdMasterProgramEntity> findByIsDeleted(boolean isDeleted);

	List<SipdMasterProgramEntity> findBySubjectId(String subjectId);

	List<SipdMasterProgramEntity> findBySubjectIdAndIsDeleted(String subjectId, boolean isDeleted);

}
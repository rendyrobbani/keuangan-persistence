package com.rendyrobbani.keuangan.persistence.repository.master.classification.kabupaten;

import com.rendyrobbani.keuangan.persistence.entity.master.classification.kabupaten.SipdMasterKabupatenEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SipdMasterKabupatenJpaRepository extends JpaRepository<SipdMasterKabupatenEntity, Long> {

	List<SipdMasterKabupatenEntity> findByIsDeleted(boolean isDeleted);

	List<SipdMasterKabupatenEntity> findBySubjectId(String subjectId);

	List<SipdMasterKabupatenEntity> findBySubjectIdAndIsDeleted(String subjectId, boolean isDeleted);

}
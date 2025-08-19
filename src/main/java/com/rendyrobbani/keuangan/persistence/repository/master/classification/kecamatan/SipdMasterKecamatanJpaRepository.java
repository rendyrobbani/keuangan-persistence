package com.rendyrobbani.keuangan.persistence.repository.master.classification.kecamatan;

import com.rendyrobbani.keuangan.persistence.entity.master.classification.kecamatan.SipdMasterKecamatanEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SipdMasterKecamatanJpaRepository extends JpaRepository<SipdMasterKecamatanEntity, Long> {

	List<SipdMasterKecamatanEntity> findByIsDeleted(boolean isDeleted);

	List<SipdMasterKecamatanEntity> findBySubjectId(String subjectId);

	List<SipdMasterKecamatanEntity> findBySubjectIdAndIsDeleted(String subjectId, boolean isDeleted);

}
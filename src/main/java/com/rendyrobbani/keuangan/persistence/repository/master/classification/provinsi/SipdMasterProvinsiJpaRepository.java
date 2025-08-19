package com.rendyrobbani.keuangan.persistence.repository.master.classification.provinsi;

import com.rendyrobbani.keuangan.persistence.entity.master.classification.provinsi.SipdMasterProvinsiEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SipdMasterProvinsiJpaRepository extends JpaRepository<SipdMasterProvinsiEntity, Long> {

	List<SipdMasterProvinsiEntity> findByIsDeleted(boolean isDeleted);

	List<SipdMasterProvinsiEntity> findBySubjectId(String subjectId);

	List<SipdMasterProvinsiEntity> findBySubjectIdAndIsDeleted(String subjectId, boolean isDeleted);

}
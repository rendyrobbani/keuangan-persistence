package com.rendyrobbani.keuangan.persistence.repository.master.classification.kelurahan;

import com.rendyrobbani.keuangan.persistence.entity.master.classification.kelurahan.SipdMasterKelurahanEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SipdMasterKelurahanJpaRepository extends JpaRepository<SipdMasterKelurahanEntity, Long> {

	List<SipdMasterKelurahanEntity> findByIsDeleted(boolean isDeleted);

	List<SipdMasterKelurahanEntity> findBySubjectId(String subjectId);

	List<SipdMasterKelurahanEntity> findBySubjectIdAndIsDeleted(String subjectId, boolean isDeleted);

}
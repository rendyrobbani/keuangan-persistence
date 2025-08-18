package com.rendyrobbani.keuangan.persistence.repository.master.classification.bidang;

import com.rendyrobbani.keuangan.persistence.entity.master.classification.bidang.SipdMasterBidangEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SipdMasterBidangJpaRepository extends JpaRepository<SipdMasterBidangEntity, Long> {

	List<SipdMasterBidangEntity> findByIsDeleted(boolean isDeleted);

	List<SipdMasterBidangEntity> findBySubjectId(String subjectId);

	List<SipdMasterBidangEntity> findBySubjectIdAndIsDeleted(String subjectId, boolean isDeleted);

}
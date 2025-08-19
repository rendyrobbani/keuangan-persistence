package com.rendyrobbani.keuangan.persistence.repository.master.classification.organisasi;

import com.rendyrobbani.keuangan.persistence.entity.master.classification.organisasi.SipdMasterOrganisasiEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SipdMasterOrganisasiJpaRepository extends JpaRepository<SipdMasterOrganisasiEntity, Long> {

	List<SipdMasterOrganisasiEntity> findByIsDeleted(boolean isDeleted);

	List<SipdMasterOrganisasiEntity> findBySubjectId(String subjectId);

	List<SipdMasterOrganisasiEntity> findBySubjectIdAndIsDeleted(String subjectId, boolean isDeleted);

}
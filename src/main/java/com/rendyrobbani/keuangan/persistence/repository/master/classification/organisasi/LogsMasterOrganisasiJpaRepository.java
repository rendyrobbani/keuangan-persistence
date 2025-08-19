package com.rendyrobbani.keuangan.persistence.repository.master.classification.organisasi;

import com.rendyrobbani.keuangan.persistence.entity.master.classification.organisasi.LogsMasterOrganisasiEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LogsMasterOrganisasiJpaRepository extends JpaRepository<LogsMasterOrganisasiEntity, Long> {

	List<LogsMasterOrganisasiEntity> findByIsDeleted(boolean isDeleted);

}
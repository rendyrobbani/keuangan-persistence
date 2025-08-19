package com.rendyrobbani.keuangan.persistence.repository.master.classification.organisasi;

import com.rendyrobbani.keuangan.persistence.entity.master.classification.organisasi.DataMasterOrganisasiEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DataMasterOrganisasiJpaRepository extends JpaRepository<DataMasterOrganisasiEntity, String> {

	List<DataMasterOrganisasiEntity> findByIsDeleted(boolean isDeleted);

}
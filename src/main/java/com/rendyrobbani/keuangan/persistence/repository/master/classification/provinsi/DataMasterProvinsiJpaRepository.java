package com.rendyrobbani.keuangan.persistence.repository.master.classification.provinsi;

import com.rendyrobbani.keuangan.persistence.entity.master.classification.provinsi.DataMasterProvinsiEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DataMasterProvinsiJpaRepository extends JpaRepository<DataMasterProvinsiEntity, String> {

	List<DataMasterProvinsiEntity> findByIsDeleted(boolean isDeleted);

}
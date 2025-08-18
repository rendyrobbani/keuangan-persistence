package com.rendyrobbani.keuangan.persistence.repository.master.classification.urusan;

import com.rendyrobbani.keuangan.persistence.entity.master.classification.urusan.DataMasterUrusanEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DataMasterUrusanJpaRepository extends JpaRepository<DataMasterUrusanEntity, String> {

	List<DataMasterUrusanEntity> findByIsDeleted(boolean isDeleted);

}
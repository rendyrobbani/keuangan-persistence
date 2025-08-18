package com.rendyrobbani.keuangan.persistence.repository.master.classification.subfungsi;

import com.rendyrobbani.keuangan.persistence.entity.master.classification.subfungsi.DataMasterSubfungsiEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DataMasterSubfungsiJpaRepository extends JpaRepository<DataMasterSubfungsiEntity, String> {

	List<DataMasterSubfungsiEntity> findByIsDeleted(boolean isDeleted);

}
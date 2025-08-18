package com.rendyrobbani.keuangan.persistence.repository.master.classification.subkegiatan;

import com.rendyrobbani.keuangan.persistence.entity.master.classification.subkegiatan.DataMasterSubkegiatanEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DataMasterSubkegiatanJpaRepository extends JpaRepository<DataMasterSubkegiatanEntity, String> {

	List<DataMasterSubkegiatanEntity> findByIsDeleted(boolean isDeleted);

}
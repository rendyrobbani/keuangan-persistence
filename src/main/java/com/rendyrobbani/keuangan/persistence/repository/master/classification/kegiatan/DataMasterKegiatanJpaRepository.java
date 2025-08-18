package com.rendyrobbani.keuangan.persistence.repository.master.classification.kegiatan;

import com.rendyrobbani.keuangan.persistence.entity.master.classification.kegiatan.DataMasterKegiatanEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DataMasterKegiatanJpaRepository extends JpaRepository<DataMasterKegiatanEntity, String> {

	List<DataMasterKegiatanEntity> findByIsDeleted(boolean isDeleted);

}
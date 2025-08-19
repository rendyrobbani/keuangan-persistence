package com.rendyrobbani.keuangan.persistence.repository.master.classification.kelurahan;

import com.rendyrobbani.keuangan.persistence.entity.master.classification.kelurahan.DataMasterKelurahanEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DataMasterKelurahanJpaRepository extends JpaRepository<DataMasterKelurahanEntity, String> {

	List<DataMasterKelurahanEntity> findByIsDeleted(boolean isDeleted);

}
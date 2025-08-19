package com.rendyrobbani.keuangan.persistence.repository.master.classification.kecamatan;

import com.rendyrobbani.keuangan.persistence.entity.master.classification.kecamatan.DataMasterKecamatanEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DataMasterKecamatanJpaRepository extends JpaRepository<DataMasterKecamatanEntity, String> {

	List<DataMasterKecamatanEntity> findByIsDeleted(boolean isDeleted);

}
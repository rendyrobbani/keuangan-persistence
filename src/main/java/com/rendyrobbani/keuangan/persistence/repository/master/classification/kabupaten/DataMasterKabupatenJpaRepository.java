package com.rendyrobbani.keuangan.persistence.repository.master.classification.kabupaten;

import com.rendyrobbani.keuangan.persistence.entity.master.classification.kabupaten.DataMasterKabupatenEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DataMasterKabupatenJpaRepository extends JpaRepository<DataMasterKabupatenEntity, String> {

	List<DataMasterKabupatenEntity> findByIsDeleted(boolean isDeleted);

}
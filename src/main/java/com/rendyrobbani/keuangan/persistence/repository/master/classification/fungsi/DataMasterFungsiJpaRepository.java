package com.rendyrobbani.keuangan.persistence.repository.master.classification.fungsi;

import com.rendyrobbani.keuangan.persistence.entity.master.classification.fungsi.DataMasterFungsiEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DataMasterFungsiJpaRepository extends JpaRepository<DataMasterFungsiEntity, String> {

	List<DataMasterFungsiEntity> findByIsDeleted(boolean isDeleted);

}
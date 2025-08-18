package com.rendyrobbani.keuangan.persistence.repository.master.classification.bidang;

import com.rendyrobbani.keuangan.persistence.entity.master.classification.bidang.DataMasterBidangEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DataMasterBidangJpaRepository extends JpaRepository<DataMasterBidangEntity, String> {

	List<DataMasterBidangEntity> findByIsDeleted(boolean isDeleted);

}
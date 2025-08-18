package com.rendyrobbani.keuangan.persistence.repository.master.classification.program;

import com.rendyrobbani.keuangan.persistence.entity.master.classification.program.DataMasterProgramEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DataMasterProgramJpaRepository extends JpaRepository<DataMasterProgramEntity, String> {

	List<DataMasterProgramEntity> findByIsDeleted(boolean isDeleted);

}
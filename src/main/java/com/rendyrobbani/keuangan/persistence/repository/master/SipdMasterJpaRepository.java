package com.rendyrobbani.keuangan.persistence.repository.master;

import com.rendyrobbani.keuangan.core.domain.entity.master.DataMasterEntity;
import com.rendyrobbani.keuangan.core.domain.entity.master.SipdMasterEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.AbstractSipdMasterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface SipdMasterJpaRepository<
		ENTITY extends AbstractSipdMasterEntity<DOMAIN, SUBJECT, SUBJECTID, ID>,
		DOMAIN extends SipdMasterEntity<SUBJECT, SUBJECTID, ID>,
		SUBJECT extends DataMasterEntity<SUBJECTID>,
		SUBJECTID,
		ID
		>
		extends JpaRepository<ENTITY, ID> {

	List<ENTITY> findByIsDeleted(boolean isDeleted);

	List<ENTITY> findBySubjectId(SUBJECTID subjectId);

	List<ENTITY> findBySubjectIdAndIsDeleted(SUBJECTID subjectId, boolean isDeleted);

}
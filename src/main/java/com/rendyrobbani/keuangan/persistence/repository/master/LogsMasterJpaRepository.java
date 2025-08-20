package com.rendyrobbani.keuangan.persistence.repository.master;

import com.rendyrobbani.keuangan.core.domain.entity.master.DataMasterEntity;
import com.rendyrobbani.keuangan.core.domain.entity.master.LogsMasterEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.AbstractLogsMasterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface LogsMasterJpaRepository<
		ENTITY extends AbstractLogsMasterEntity<DOMAIN, SUBJECT, SUBJECTID>,
		DOMAIN extends LogsMasterEntity<SUBJECT, SUBJECTID>,
		SUBJECT extends DataMasterEntity<SUBJECTID>,
		SUBJECTID
		>
		extends JpaRepository<ENTITY, Long> {

	List<ENTITY> findBySubjectId(SUBJECTID subjectId);

	List<ENTITY> findBySubjectIdAndIsDeleted(SUBJECTID subjectId, boolean isDeleted);

}
package com.rendyrobbani.keuangan.persistence.repository.budget;

import com.rendyrobbani.keuangan.core.domain.entity.budget.DataBudgetEntity;
import com.rendyrobbani.keuangan.core.domain.entity.budget.LogsBudgetEntity;
import com.rendyrobbani.keuangan.persistence.entity.budget.AbstractLogsBudgetEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface LogsBudgetJpaRepository<
		ENTITY extends AbstractLogsBudgetEntity<DOMAIN, SUBJECT, SUBJECTID>,
		DOMAIN extends LogsBudgetEntity<SUBJECT, SUBJECTID>,
		SUBJECT extends DataBudgetEntity<SUBJECTID>,
		SUBJECTID
		>
		extends JpaRepository<ENTITY, Long> {

	List<ENTITY> findBySubjectId(SUBJECTID subjectId);

	List<ENTITY> findBySubjectIdAndIsDeleted(SUBJECTID subjectId, boolean isDeleted);

}
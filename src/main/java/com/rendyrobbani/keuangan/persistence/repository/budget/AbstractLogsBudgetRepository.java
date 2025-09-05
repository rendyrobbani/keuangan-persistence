package com.rendyrobbani.keuangan.persistence.repository.budget;

import com.rendyrobbani.keuangan.core.domain.entity.budget.DataBudgetEntity;
import com.rendyrobbani.keuangan.core.domain.entity.budget.LogsBudgetEntity;
import com.rendyrobbani.keuangan.core.domain.repository.budget.LogsBudgetRepository;
import com.rendyrobbani.keuangan.persistence.entity.AbstractBaseEntity;
import com.rendyrobbani.keuangan.persistence.entity.budget.AbstractLogsBudgetEntity;
import com.rendyrobbani.keuangan.persistence.repository.AbstractRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public abstract class AbstractLogsBudgetRepository<
		ENTITY extends AbstractLogsBudgetEntity<DOMAIN, SUBJECT, SUBJECTID>,
		DOMAIN extends LogsBudgetEntity<SUBJECT, SUBJECTID>,
		SUBJECT extends DataBudgetEntity<SUBJECTID>,
		SUBJECTID
		>
		extends AbstractRepository<ENTITY, DOMAIN, Long>
		implements LogsBudgetRepository<DOMAIN, SUBJECT, SUBJECTID> {

	@Override
	protected JpaRepository<ENTITY, Long> repository() {
		return this.repositoryOfBudget();
	}

	protected abstract LogsBudgetJpaRepository<ENTITY, DOMAIN, SUBJECT, SUBJECTID> repositoryOfBudget();

	@Override
	public List<DOMAIN> findBySubjectId(SUBJECTID subjectId) {
		return this.repositoryOfBudget().findBySubjectId(subjectId).stream().map(AbstractBaseEntity::toDomain).toList();
	}

	@Override
	public List<DOMAIN> findBySubjectIdAndIsDeletedFalse(SUBJECTID subjectId) {
		return this.repositoryOfBudget().findBySubjectIdAndIsDeleted(subjectId, false).stream().map(AbstractBaseEntity::toDomain).toList();
	}

	@Override
	public List<DOMAIN> findBySubjectIdAndIsDeletedTrue(SUBJECTID subjectId) {
		return this.repositoryOfBudget().findBySubjectIdAndIsDeleted(subjectId, true).stream().map(AbstractBaseEntity::toDomain).toList();
	}

}
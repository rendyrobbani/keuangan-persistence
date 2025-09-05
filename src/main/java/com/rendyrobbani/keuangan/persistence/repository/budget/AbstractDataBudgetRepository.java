package com.rendyrobbani.keuangan.persistence.repository.budget;

import com.rendyrobbani.keuangan.core.domain.entity.budget.DataBudgetEntity;
import com.rendyrobbani.keuangan.core.domain.repository.budget.DataBudgetRepository;
import com.rendyrobbani.keuangan.persistence.entity.AbstractBaseEntity;
import com.rendyrobbani.keuangan.persistence.entity.budget.AbstractDataBudgetEntity;
import com.rendyrobbani.keuangan.persistence.repository.AbstractRepository;

import java.util.List;

public abstract class AbstractDataBudgetRepository<
		ENTITY extends AbstractDataBudgetEntity<DOMAIN, ID>,
		DOMAIN extends DataBudgetEntity<ID>,
		ID
		>
		extends AbstractRepository<ENTITY, DOMAIN, ID>
		implements DataBudgetRepository<DOMAIN, ID> {

	protected abstract DataBudgetJpaRepository<ENTITY, DOMAIN, ID> repositoryOfBudget();

	@Override
	protected DataBudgetJpaRepository<ENTITY, DOMAIN, ID> repository() {
		return this.repositoryOfBudget();
	}

	@Override
	public List<DOMAIN> findByIsDeletedFalse() {
		return this.repositoryOfBudget().findByIsDeleted(false).stream().map(AbstractBaseEntity::toDomain).toList();
	}

	@Override
	public List<DOMAIN> findByIsDeletedTrue() {
		return this.repositoryOfBudget().findByIsDeleted(true).stream().map(AbstractBaseEntity::toDomain).toList();
	}

}
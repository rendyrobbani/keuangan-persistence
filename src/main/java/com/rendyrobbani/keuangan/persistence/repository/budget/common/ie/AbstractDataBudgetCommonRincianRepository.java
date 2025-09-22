package com.rendyrobbani.keuangan.persistence.repository.budget.common.ie;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.DataBudgetCommonRincianEntity;
import com.rendyrobbani.keuangan.core.domain.repository.budget.common.ie.DataBudgetCommonRincianRepository;
import com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.AbstractDataBudgetCommonRincianEntity;
import com.rendyrobbani.keuangan.persistence.repository.budget.AbstractDataBudgetRepository;
import com.rendyrobbani.keuangan.persistence.repository.budget.DataBudgetJpaRepository;

public abstract class AbstractDataBudgetCommonRincianRepository<
		ENTITY extends AbstractDataBudgetCommonRincianEntity<DOMAIN>,
		DOMAIN extends DataBudgetCommonRincianEntity
		>
		extends AbstractDataBudgetRepository<ENTITY, DOMAIN, Long>
		implements DataBudgetCommonRincianRepository<DOMAIN> {

	protected abstract DataBudgetCommonRincianJpaRepository<ENTITY, DOMAIN> repositoryOfBudgetRincian();

	@Override
	protected DataBudgetJpaRepository<ENTITY, DOMAIN, Long> repositoryOfBudget() {
		return this.repositoryOfBudgetRincian();
	}

}
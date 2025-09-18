package com.rendyrobbani.keuangan.persistence.repository.budget.common;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.DataBudgetCommonEntity;
import com.rendyrobbani.keuangan.core.domain.repository.budget.common.DataBudgetCommonRepository;
import com.rendyrobbani.keuangan.persistence.entity.budget.common.AbstractDataBudgetCommonEntity;
import com.rendyrobbani.keuangan.persistence.repository.budget.AbstractDataBudgetRepository;

public abstract class AbstractDataBudgetCommonRepository<
		ENTITY extends AbstractDataBudgetCommonEntity<DOMAIN, ID>,
		DOMAIN extends DataBudgetCommonEntity<ID>,
		ID
		>
		extends AbstractDataBudgetRepository<ENTITY, DOMAIN, ID>
		implements DataBudgetCommonRepository<DOMAIN, ID> {

}
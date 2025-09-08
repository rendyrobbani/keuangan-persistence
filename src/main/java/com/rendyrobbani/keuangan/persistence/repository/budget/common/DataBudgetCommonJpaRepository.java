package com.rendyrobbani.keuangan.persistence.repository.budget.common;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.DataBudgetCommonEntity;
import com.rendyrobbani.keuangan.persistence.entity.budget.common.AbstractDataBudgetCommonEntity;
import com.rendyrobbani.keuangan.persistence.repository.budget.DataBudgetJpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface DataBudgetCommonJpaRepository<
		ENTITY extends AbstractDataBudgetCommonEntity<DOMAIN, ID>,
		DOMAIN extends DataBudgetCommonEntity<ID>,
		ID
		>
		extends DataBudgetJpaRepository<ENTITY, DOMAIN, ID> {

}
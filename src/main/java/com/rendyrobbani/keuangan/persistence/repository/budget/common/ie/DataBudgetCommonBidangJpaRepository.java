package com.rendyrobbani.keuangan.persistence.repository.budget.common.ie;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.DataBudgetCommonBidangEntity;
import com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.AbstractDataBudgetCommonBidangEntity;
import com.rendyrobbani.keuangan.persistence.repository.budget.common.DataBudgetCommonJpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface DataBudgetCommonBidangJpaRepository<
		ENTITY extends AbstractDataBudgetCommonBidangEntity<DOMAIN>,
		DOMAIN extends DataBudgetCommonBidangEntity
		>
		extends DataBudgetCommonJpaRepository<ENTITY, DOMAIN, String> {

}
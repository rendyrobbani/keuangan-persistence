package com.rendyrobbani.keuangan.persistence.repository.budget.common.ie;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.DataBudgetCommonRekeningEntity;
import com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.AbstractDataBudgetCommonRekeningEntity;
import com.rendyrobbani.keuangan.persistence.repository.budget.common.DataBudgetCommonJpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface DataBudgetCommonRekeningJpaRepository<
		ENTITY extends AbstractDataBudgetCommonRekeningEntity<DOMAIN>,
		DOMAIN extends DataBudgetCommonRekeningEntity
		>
		extends DataBudgetCommonJpaRepository<ENTITY, DOMAIN, String> {

}
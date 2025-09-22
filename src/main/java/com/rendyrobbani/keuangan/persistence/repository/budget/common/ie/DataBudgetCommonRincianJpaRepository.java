package com.rendyrobbani.keuangan.persistence.repository.budget.common.ie;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.DataBudgetCommonRincianEntity;
import com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.AbstractDataBudgetCommonRincianEntity;
import com.rendyrobbani.keuangan.persistence.repository.budget.common.DataBudgetCommonJpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface DataBudgetCommonRincianJpaRepository<
		ENTITY extends AbstractDataBudgetCommonRincianEntity<DOMAIN>,
		DOMAIN extends DataBudgetCommonRincianEntity
		>
		extends DataBudgetCommonJpaRepository<ENTITY, DOMAIN, Long> {

}
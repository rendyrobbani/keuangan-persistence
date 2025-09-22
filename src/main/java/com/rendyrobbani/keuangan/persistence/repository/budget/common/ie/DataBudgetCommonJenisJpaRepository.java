package com.rendyrobbani.keuangan.persistence.repository.budget.common.ie;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.DataBudgetCommonJenisEntity;
import com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.AbstractDataBudgetCommonJenisEntity;
import com.rendyrobbani.keuangan.persistence.repository.budget.common.DataBudgetCommonJpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface DataBudgetCommonJenisJpaRepository<
		ENTITY extends AbstractDataBudgetCommonJenisEntity<DOMAIN>,
		DOMAIN extends DataBudgetCommonJenisEntity
		>
		extends DataBudgetCommonJpaRepository<ENTITY, DOMAIN, String> {

}
package com.rendyrobbani.keuangan.persistence.repository.budget.common.ie;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.DataBudgetCommonOrganisasiEntity;
import com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.AbstractDataBudgetCommonOrganisasiEntity;
import com.rendyrobbani.keuangan.persistence.repository.budget.common.DataBudgetCommonJpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface DataBudgetCommonOrganisasiJpaRepository<
		ENTITY extends AbstractDataBudgetCommonOrganisasiEntity<DOMAIN>,
		DOMAIN extends DataBudgetCommonOrganisasiEntity
		>
		extends DataBudgetCommonJpaRepository<ENTITY, DOMAIN, String> {

}
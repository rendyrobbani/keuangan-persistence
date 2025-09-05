package com.rendyrobbani.keuangan.persistence.repository.budget;

import com.rendyrobbani.keuangan.core.domain.entity.budget.DataBudgetEntity;
import com.rendyrobbani.keuangan.persistence.entity.budget.AbstractDataBudgetEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface DataBudgetJpaRepository<
		ENTITY extends AbstractDataBudgetEntity<DOMAIN, ID>,
		DOMAIN extends DataBudgetEntity<ID>,
		ID
		>
		extends JpaRepository<ENTITY, ID> {

	List<ENTITY> findByIsDeleted(boolean isDeleted);

}
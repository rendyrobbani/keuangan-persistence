package com.rendyrobbani.keuangan.persistence.repository.budget.record;

import com.rendyrobbani.keuangan.core.domain.entity.DataEntity;
import com.rendyrobbani.keuangan.core.domain.entity.budget.record.DataBudgetRecordEntity;
import com.rendyrobbani.keuangan.persistence.entity.budget.record.AbstractDataBudgetRecordEntity;
import com.rendyrobbani.keuangan.persistence.repository.budget.DataBudgetJpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface DataBudgetRecordJpaRepository<
		ENTITY extends AbstractDataBudgetRecordEntity<DOMAIN, COMMON, COMMONID>,
		DOMAIN extends DataBudgetRecordEntity<COMMON, COMMONID>,
		COMMON extends DataEntity<COMMONID>,
		COMMONID
		> extends DataBudgetJpaRepository<ENTITY, DOMAIN, String> {

	List<ENTITY> findByJadwalId(Long jadwalId);

	List<ENTITY> findByJadwalIdAndIsDeleted(Long jadwalId, boolean isDeleted);

}
package com.rendyrobbani.keuangan.persistence.repository.budget.jadwal;

import com.rendyrobbani.keuangan.core.domain.entity.budget.jadwal.DataBudgetJadwal;
import com.rendyrobbani.keuangan.core.domain.entity.budget.jadwal.LogsBudgetJadwal;
import com.rendyrobbani.keuangan.core.domain.repository.budget.jadwal.LogsBudgetJadwalRepository;
import com.rendyrobbani.keuangan.persistence.entity.budget.jadwal.LogsBudgetJadwalEntity;
import com.rendyrobbani.keuangan.persistence.repository.budget.AbstractLogsBudgetRepository;
import com.rendyrobbani.keuangan.persistence.repository.budget.LogsBudgetJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class LogsBudgetJadwalRepositoryImpl extends AbstractLogsBudgetRepository<LogsBudgetJadwalEntity, LogsBudgetJadwal, DataBudgetJadwal, Long> implements LogsBudgetJadwalRepository {

	private final LogsBudgetJadwalJpaRepository repository;

	@Override
	protected LogsBudgetJpaRepository<LogsBudgetJadwalEntity, LogsBudgetJadwal, DataBudgetJadwal, Long> repositoryOfBudget() {
		return this.repository;
	}

}
package com.rendyrobbani.keuangan.persistence.repository.budget.jadwal;

import com.rendyrobbani.keuangan.core.domain.entity.budget.jadwal.DataBudgetJadwal;
import com.rendyrobbani.keuangan.core.domain.entity.budget.jadwal.LogsBudgetJadwal;
import com.rendyrobbani.keuangan.persistence.entity.budget.jadwal.LogsBudgetJadwalEntity;
import com.rendyrobbani.keuangan.persistence.repository.budget.LogsBudgetJpaRepository;

public interface LogsBudgetJadwalJpaRepository extends LogsBudgetJpaRepository<LogsBudgetJadwalEntity, LogsBudgetJadwal, DataBudgetJadwal, Long> {

}
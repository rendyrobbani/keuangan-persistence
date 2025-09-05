package com.rendyrobbani.keuangan.persistence.repository.budget.jadwal;

import com.rendyrobbani.keuangan.core.domain.entity.budget.jadwal.DataBudgetJadwal;
import com.rendyrobbani.keuangan.core.domain.vo.BudgetTahapan;
import com.rendyrobbani.keuangan.persistence.entity.budget.jadwal.DataBudgetJadwalEntity;
import com.rendyrobbani.keuangan.persistence.repository.budget.DataBudgetJpaRepository;

import java.util.List;

public interface DataBudgetJadwalJpaRepository extends DataBudgetJpaRepository<DataBudgetJadwalEntity, DataBudgetJadwal, Long> {

	List<DataBudgetJadwalEntity> findByTahapan(BudgetTahapan tahapan);

}
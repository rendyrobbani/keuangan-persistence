package com.rendyrobbani.keuangan.persistence.repository.budget.jadwal;

import com.rendyrobbani.keuangan.core.domain.entity.budget.jadwal.DataBudgetJadwal;
import com.rendyrobbani.keuangan.core.domain.repository.budget.jadwal.DataBudgetJadwalRepository;
import com.rendyrobbani.keuangan.core.domain.vo.BudgetTahapan;
import com.rendyrobbani.keuangan.persistence.entity.budget.jadwal.DataBudgetJadwalEntity;
import com.rendyrobbani.keuangan.persistence.repository.budget.AbstractDataBudgetRepository;
import com.rendyrobbani.keuangan.persistence.repository.budget.DataBudgetJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class DataBudgetJadwalRepositoryImpl extends AbstractDataBudgetRepository<DataBudgetJadwalEntity, DataBudgetJadwal, Long> implements DataBudgetJadwalRepository {

	private final DataBudgetJadwalJpaRepository repository;

	@Override
	protected DataBudgetJpaRepository<DataBudgetJadwalEntity, DataBudgetJadwal, Long> repositoryOfBudget() {
		return this.repository;
	}

	@Override
	public List<DataBudgetJadwal> findByTahapan(BudgetTahapan tahapan) {
		return this.repository.findByTahapan(tahapan).stream().map(DataBudgetJadwalEntity::toDomain).toList();
	}

	@Override
	public DataBudgetJadwal findLatest() {
		var entities = this.repository.findByIsDeleted(false);
		if (!entities.isEmpty()) return entities.getLast().toDomain();
		return null;
	}

	@Override
	public DataBudgetJadwal findRKPDMurni() {
		var entities = this.repository.findByTahapan(BudgetTahapan.RKPD_MURNI_PENETAPAN);
		if (!entities.isEmpty()) return entities.getFirst().toDomain();
		return null;
	}

	@Override
	public DataBudgetJadwal findPPASMurni() {
		var entities = this.repository.findByTahapan(BudgetTahapan.PPAS_MURNI_PENETAPAN);
		if (!entities.isEmpty()) return entities.getFirst().toDomain();
		return null;
	}

	@Override
	public DataBudgetJadwal findAPBDMurni() {
		var entities = this.repository.findByTahapan(BudgetTahapan.APBD_MURNI_PENETAPAN);
		if (!entities.isEmpty()) return entities.getFirst().toDomain();
		return null;
	}

	@Override
	public DataBudgetJadwal findRKPDPerubahan() {
		var entities = this.repository.findByTahapan(BudgetTahapan.RKPD_PERUBAHAN_PENETAPAN);
		if (!entities.isEmpty()) return entities.getFirst().toDomain();
		return null;
	}

	@Override
	public DataBudgetJadwal findPPASPerubahan() {
		var entities = this.repository.findByTahapan(BudgetTahapan.PPAS_PERUBAHAN_PENETAPAN);
		if (!entities.isEmpty()) return entities.getFirst().toDomain();
		return null;
	}

	@Override
	public DataBudgetJadwal findAPBDPerubahan() {
		var entities = this.repository.findByTahapan(BudgetTahapan.APBD_PERUBAHAN_PENETAPAN);
		if (!entities.isEmpty()) return entities.getFirst().toDomain();
		return null;
	}

}
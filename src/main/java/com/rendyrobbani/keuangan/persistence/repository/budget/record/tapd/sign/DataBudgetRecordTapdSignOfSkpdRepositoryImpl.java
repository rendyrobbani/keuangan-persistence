package com.rendyrobbani.keuangan.persistence.repository.budget.record.tapd.sign;

import com.rendyrobbani.keuangan.core.domain.entity.budget.record.tapd.sign.DataBudgetRecordTapdSignOfSkpd;
import com.rendyrobbani.keuangan.core.domain.entity.master.tapd.sign.DataMasterTapdSignOfSkpd;
import com.rendyrobbani.keuangan.core.domain.repository.budget.record.tapd.sign.DataBudgetRecordTapdSignOfSkpdRepository;
import com.rendyrobbani.keuangan.persistence.entity.budget.record.tapd.sign.DataBudgetRecordTapdSignOfSkpdEntity;
import com.rendyrobbani.keuangan.persistence.repository.budget.record.AbstractDataBudgetRecordRepository;
import com.rendyrobbani.keuangan.persistence.repository.budget.record.DataBudgetRecordJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataBudgetRecordTapdSignOfSkpdRepositoryImpl extends AbstractDataBudgetRecordRepository<DataBudgetRecordTapdSignOfSkpdEntity, DataBudgetRecordTapdSignOfSkpd, DataMasterTapdSignOfSkpd, String> implements DataBudgetRecordTapdSignOfSkpdRepository {

	private final DataBudgetRecordTapdSignOfSkpdJpaRepository repository;

	@Override
	protected DataBudgetRecordJpaRepository<DataBudgetRecordTapdSignOfSkpdEntity, DataBudgetRecordTapdSignOfSkpd, DataMasterTapdSignOfSkpd, String> repositoryOfBudgetRecord() {
		return this.repository;
	}

	@Override
	protected String saveByJadwalSql() {
		System.out.println(super.saveByJadwalSql());
		return super.saveByJadwalSql();
	}

}
package com.rendyrobbani.keuangan.persistence.repository.budget.record.tapd.sign;

import com.rendyrobbani.keuangan.core.domain.entity.budget.record.tapd.sign.DataBudgetRecordTapdSign;
import com.rendyrobbani.keuangan.core.domain.entity.master.tapd.sign.DataMasterTapdSign;
import com.rendyrobbani.keuangan.core.domain.repository.budget.record.tapd.sign.DataBudgetRecordTapdSignRepository;
import com.rendyrobbani.keuangan.persistence.entity.budget.record.tapd.sign.DataBudgetRecordTapdSignEntity;
import com.rendyrobbani.keuangan.persistence.repository.budget.record.AbstractDataBudgetRecordRepository;
import com.rendyrobbani.keuangan.persistence.repository.budget.record.DataBudgetRecordJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataBudgetRecordTapdSignRepositoryImpl extends AbstractDataBudgetRecordRepository<DataBudgetRecordTapdSignEntity, DataBudgetRecordTapdSign, DataMasterTapdSign, String> implements DataBudgetRecordTapdSignRepository {

	private final DataBudgetRecordTapdSignJpaRepository repository;

	@Override
	protected DataBudgetRecordJpaRepository<DataBudgetRecordTapdSignEntity, DataBudgetRecordTapdSign, DataMasterTapdSign, String> repositoryOfBudgetRecord() {
		return this.repository;
	}

	@Override
	protected String saveByJadwalSql() {
		String sql = super.saveByJadwalSql();
		sql = sql.replace("t.name", "user.name");
		sql = sql.replace("t.title_prefix", "user.title_prefix");
		sql = sql.replace("t.title_suffix", "user.title_suffix");

		sql += System.lineSeparator() + "left join data_user user on t.team_id = user.id";
		return sql;
	}

}
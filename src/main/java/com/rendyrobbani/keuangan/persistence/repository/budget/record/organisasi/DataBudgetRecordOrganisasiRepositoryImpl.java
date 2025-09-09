package com.rendyrobbani.keuangan.persistence.repository.budget.record.organisasi;

import com.rendyrobbani.keuangan.core.domain.entity.budget.record.organisasi.DataBudgetRecordOrganisasi;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.organisasi.DataMasterOrganisasi;
import com.rendyrobbani.keuangan.core.domain.repository.budget.record.organisasi.DataBudgetRecordOrganisasiRepository;
import com.rendyrobbani.keuangan.persistence.entity.budget.record.organisasi.DataBudgetRecordOrganisasiEntity;
import com.rendyrobbani.keuangan.persistence.repository.budget.record.AbstractDataBudgetRecordRepository;
import com.rendyrobbani.keuangan.persistence.repository.budget.record.DataBudgetRecordJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataBudgetRecordOrganisasiRepositoryImpl extends AbstractDataBudgetRecordRepository<DataBudgetRecordOrganisasiEntity, DataBudgetRecordOrganisasi, DataMasterOrganisasi, String> implements DataBudgetRecordOrganisasiRepository {

	private final DataBudgetRecordOrganisasiJpaRepository repository;

	@Override
	protected DataBudgetRecordJpaRepository<DataBudgetRecordOrganisasiEntity, DataBudgetRecordOrganisasi, DataMasterOrganisasi, String> repositoryOfBudgetRecord() {
		return this.repository;
	}

	@Override
	protected String saveByJadwalSql() {
		String sql = super.saveByJadwalSql();
		sql = sql.replace("t.head_pangkat", "user.pangkat");
		sql = sql.replace("t.head_name", "user.name");
		sql = sql.replace("t.head_title_prefix", "user.title_prefix");
		sql = sql.replace("t.head_title_suffix", "user.title_suffix");

		sql += System.lineSeparator() + "left join data_user user on t.head_id = user.id";
		return sql;
	}

}
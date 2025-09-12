package com.rendyrobbani.keuangan.persistence.entity.budget.record.tapd.sign;

import com.rendyrobbani.keuangan.core.domain.entity.budget.record.tapd.sign.DataBudgetRecordTapdSignOfSkpd;
import com.rendyrobbani.keuangan.persistence.entity.budget.record.organisasi.DataBudgetRecordOrganisasiEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.organisasi.DataMasterOrganisasiEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.tapd.sign.DataMasterTapdSignEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.tapd.sign.DataMasterTapdSignOfSkpdEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.tapd.team.DataMasterTapdTeamEntity;
import com.rendyrobbani.keuangan.persistence.entity.user.DataUserEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.experimental.Accessors;

@Data
@Setter(AccessLevel.NONE)
@Accessors(fluent = true)
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = DataBudgetRecordTapdSignOfSkpd.TABLE_NAME, uniqueConstraints = {@UniqueConstraint(columnNames = {"jadwal_id", "common_id"})})
public class DataBudgetRecordTapdSignOfSkpdEntity extends AbstractDataBudgetRecordTapdSignOfSkpdEntity {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "common_id", referencedColumnName = "id", insertable = false, updatable = false)
	})
	protected DataMasterTapdSignOfSkpdEntity common;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "team_id", referencedColumnName = "id", insertable = false, updatable = false)
	})
	private DataUserEntity user;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "team_id", referencedColumnName = "id", insertable = false, updatable = false)
	})
	private DataMasterTapdTeamEntity team;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "sign_id", referencedColumnName = "id", insertable = false, updatable = false)
	})
	private DataMasterTapdSignEntity sign;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "jadwal_id", referencedColumnName = "jadwal_id", insertable = false, updatable = false),
			@JoinColumn(name = "sign_id", referencedColumnName = "common_id", insertable = false, updatable = false)
	})
	private DataBudgetRecordTapdSignEntity signRecord;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "skpd_id", referencedColumnName = "id", insertable = false, updatable = false)
	})
	private DataMasterOrganisasiEntity skpd;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "jadwal_id", referencedColumnName = "jadwal_id", insertable = false, updatable = false),
			@JoinColumn(name = "skpd_id", referencedColumnName = "common_id", insertable = false, updatable = false)
	})
	private DataBudgetRecordOrganisasiEntity skpdRecord;

	@Override
	public DataBudgetRecordTapdSignOfSkpd toDomain() {
		return this;
	}

}
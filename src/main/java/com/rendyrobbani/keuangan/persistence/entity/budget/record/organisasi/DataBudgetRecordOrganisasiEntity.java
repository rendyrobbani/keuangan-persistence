package com.rendyrobbani.keuangan.persistence.entity.budget.record.organisasi;

import com.rendyrobbani.keuangan.core.domain.entity.budget.record.organisasi.DataBudgetRecordOrganisasi;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.bidang.DataMasterBidangEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.organisasi.DataMasterOrganisasiEntity;
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
@Table(name = DataBudgetRecordOrganisasi.TABLE_NAME, uniqueConstraints = {@UniqueConstraint(columnNames = {"jadwal_id", "common_id"}), @UniqueConstraint(columnNames = {"jadwal_id", "skpd_id", "unit_id"})})
public class DataBudgetRecordOrganisasiEntity extends AbstractDataBudgetRecordOrganisasiEntity {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "bidang1_id", referencedColumnName = "id", insertable = false, updatable = false)
	})
	private DataMasterBidangEntity bidang1;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "bidang2_id", referencedColumnName = "id", insertable = false, updatable = false)
	})
	private DataMasterBidangEntity bidang2;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "bidang3_id", referencedColumnName = "id", insertable = false, updatable = false)
	})
	private DataMasterBidangEntity bidang3;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "common_id", referencedColumnName = "id", insertable = false, updatable = false)
	})
	private DataMasterOrganisasiEntity common;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "jadwal_id", referencedColumnName = "jadwal_id", insertable = false, updatable = false),
			@JoinColumn(name = "skpd_id", referencedColumnName = "common_id", insertable = false, updatable = false),
	})
	private DataBudgetRecordOrganisasiEntity skpd;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "head_id", referencedColumnName = "id", insertable = false, updatable = false)
	})
	private DataUserEntity head;

	@Override
	public DataBudgetRecordOrganisasi toDomain() {
		return this;
	}

}
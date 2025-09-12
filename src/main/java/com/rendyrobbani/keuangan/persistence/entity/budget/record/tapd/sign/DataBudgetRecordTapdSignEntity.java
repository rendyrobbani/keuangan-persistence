package com.rendyrobbani.keuangan.persistence.entity.budget.record.tapd.sign;

import com.rendyrobbani.keuangan.core.domain.entity.budget.record.tapd.sign.DataBudgetRecordTapdSign;
import com.rendyrobbani.keuangan.persistence.entity.master.tapd.sign.DataMasterTapdSignEntity;
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
@Table(name = DataBudgetRecordTapdSign.TABLE_NAME, uniqueConstraints = {@UniqueConstraint(columnNames = {"jadwal_id", "common_id"})})
public class DataBudgetRecordTapdSignEntity extends AbstractDataBudgetRecordTapdSignEntity {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "common_id", referencedColumnName = "id", insertable = false, updatable = false)
	})
	private DataMasterTapdSignEntity common;

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

	@Override
	public DataBudgetRecordTapdSign toDomain() {
		return this;
	}

}
package com.rendyrobbani.keuangan.persistence.entity.budget.record.mayor;

import com.rendyrobbani.keuangan.core.domain.entity.budget.record.mayor.DataBudgetRecordMayor;
import com.rendyrobbani.keuangan.persistence.entity.master.mayor.DataMasterMayorEntity;
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
@Table(name = DataBudgetRecordMayor.TABLE_NAME, uniqueConstraints = {@UniqueConstraint(columnNames = {"jadwal_id", "common_id"})})
public class DataBudgetRecordMayorEntity extends AbstractDataBudgetRecordMayorEntity {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "common_id", referencedColumnName = "id", insertable = false, updatable = false)
	})
	private DataMasterMayorEntity common;

	@Override
	public DataBudgetRecordMayor toDomain() {
		return this;
	}

}
package com.rendyrobbani.keuangan.persistence.entity.budget.record;

import com.rendyrobbani.keuangan.core.domain.entity.DataEntity;
import com.rendyrobbani.keuangan.core.domain.entity.budget.record.DataBudgetRecordEntity;
import com.rendyrobbani.keuangan.persistence.entity.budget.AbstractDataBudgetEntity;
import com.rendyrobbani.keuangan.persistence.entity.budget.jadwal.DataBudgetJadwalEntity;
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
@MappedSuperclass
public abstract class AbstractDataBudgetRecordEntity<DOMAIN extends DataBudgetRecordEntity<COMMON, COMMONID>, COMMON extends DataEntity<COMMONID>, COMMONID> extends AbstractDataBudgetEntity<DOMAIN, String> {

	@Column(name = "jadwal_id", nullable = false, updatable = false)
	protected Long jadwalId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "jadwal_id", referencedColumnName = "id", insertable = false, updatable = false)
	})
	protected DataBudgetJadwalEntity jadwal;

}
package com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.income.pendapatan.jenis;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.income.pendapatan.jenis.DataBudgetCommonIncomePendapatanJenis;
import com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.AbstractDataBudgetCommonJenisEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan1.DataMasterPendapatan1Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan2.DataMasterPendapatan2Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan3.DataMasterPendapatan3Entity;
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
public abstract class AbstractDataBudgetCommonIncomePendapatanJenisEntity extends AbstractDataBudgetCommonJenisEntity<DataBudgetCommonIncomePendapatanJenis> implements DataBudgetCommonIncomePendapatanJenis {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "rekening1_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	protected DataMasterPendapatan1Entity rekening1;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "rekening1_id", referencedColumnName = "rekening1_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening2_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	protected DataMasterPendapatan2Entity rekening2;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "rekening1_id", referencedColumnName = "rekening1_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening2_id", referencedColumnName = "rekening2_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening3_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	protected DataMasterPendapatan3Entity rekening3;

}
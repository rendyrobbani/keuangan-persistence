package com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.income.pendapatan.rincian;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.income.pendapatan.rincian.DataBudgetCommonIncomePendapatanRincian;
import com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.AbstractDataBudgetCommonRincianEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan1.DataMasterPendapatan1Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan2.DataMasterPendapatan2Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan3.DataMasterPendapatan3Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan4.DataMasterPendapatan4Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan5.DataMasterPendapatan5Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan6.DataMasterPendapatan6Entity;
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
public abstract class AbstractDataBudgetCommonIncomePendapatanRincianEntity extends AbstractDataBudgetCommonRincianEntity<DataBudgetCommonIncomePendapatanRincian> implements DataBudgetCommonIncomePendapatanRincian {

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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "rekening1_id", referencedColumnName = "rekening1_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening2_id", referencedColumnName = "rekening2_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening3_id", referencedColumnName = "rekening3_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening4_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	protected DataMasterPendapatan4Entity rekening4;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "rekening1_id", referencedColumnName = "rekening1_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening2_id", referencedColumnName = "rekening2_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening3_id", referencedColumnName = "rekening3_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening4_id", referencedColumnName = "rekening4_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening5_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	protected DataMasterPendapatan5Entity rekening5;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "rekening1_id", referencedColumnName = "rekening1_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening2_id", referencedColumnName = "rekening2_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening3_id", referencedColumnName = "rekening3_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening4_id", referencedColumnName = "rekening4_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening5_id", referencedColumnName = "rekening5_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening6_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	protected DataMasterPendapatan6Entity rekening6;

}
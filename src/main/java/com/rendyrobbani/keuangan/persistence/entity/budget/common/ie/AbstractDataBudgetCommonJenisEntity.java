package com.rendyrobbani.keuangan.persistence.entity.budget.common.ie;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.DataBudgetCommonJenisEntity;
import com.rendyrobbani.keuangan.persistence.entity.budget.common.AbstractDataBudgetCommonEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.bidang.DataMasterBidangEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.organisasi.DataMasterOrganisasiEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.urusan.DataMasterUrusanEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.hibernate.annotations.Check;

import java.math.BigDecimal;

@Data
@Setter(AccessLevel.NONE)
@Accessors(fluent = true)
@EqualsAndHashCode(callSuper = true)
@MappedSuperclass
public abstract class AbstractDataBudgetCommonJenisEntity<DOMAIN extends DataBudgetCommonJenisEntity> extends AbstractDataBudgetCommonEntity<DOMAIN, String> implements DataBudgetCommonJenisEntity {

	@Id
	@Check(constraints = "id = concat_ws('|', unit_id, bidang_id, rekening3_id)")
	@Column(name = "id", nullable = false, updatable = false)
	protected String id;

	@Column(name = "skpd_id", nullable = false, updatable = false)
	protected String skpdId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "skpd_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	protected DataMasterOrganisasiEntity skpd;

	@Column(name = "unit_id", nullable = false, updatable = false)
	protected String unitId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "skpd_id", referencedColumnName = "skpd_id", insertable = false, updatable = false),
			@JoinColumn(name = "unit_id", referencedColumnName = "unit_id", insertable = false, updatable = false),
	})
	protected DataMasterOrganisasiEntity unit;

	@Column(name = "urusan_id", nullable = false, updatable = false)
	protected String urusanId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "urusan_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	protected DataMasterUrusanEntity urusan;

	@Column(name = "bidang_id", nullable = false, updatable = false)
	protected String bidangId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "urusan_id", referencedColumnName = "urusan_id", insertable = false, updatable = false),
			@JoinColumn(name = "bidang_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	protected DataMasterBidangEntity bidang;

	@Column(name = "rekening1_id", nullable = false, updatable = false)
	protected String rekening1Id;

	@Column(name = "rekening2_id", nullable = false, updatable = false)
	protected String rekening2Id;

	@Column(name = "rekening3_id", nullable = false, updatable = false)
	protected String rekening3Id;

	@Column(name = "total", nullable = false)
	protected BigDecimal total;

	@Column(name = "sebelum", nullable = false)
	protected BigDecimal sebelum;

}
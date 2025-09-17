package com.rendyrobbani.keuangan.persistence.entity.budget.common.ie;

import com.rendyrobbani.keuangan.core.common.util.koefisien.KoefisienUtil;
import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.DataBudgetCommonRincianEntity;
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

import java.math.BigDecimal;

@Data
@Setter(AccessLevel.NONE)
@Accessors(fluent = true)
@EqualsAndHashCode(callSuper = true)
@MappedSuperclass
public abstract class AbstractDataBudgetCommonRincianEntity extends AbstractDataBudgetCommonEntity<DataBudgetCommonRincianEntity, Long> implements DataBudgetCommonRincianEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, updatable = false)
	protected Long id;

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
			@JoinColumn(name = "unit_id", referencedColumnName = "id", insertable = false, updatable = false),
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

	@Column(name = "rekening4_id", nullable = false, updatable = false)
	protected String rekening4Id;

	@Column(name = "rekening5_id", nullable = false, updatable = false)
	protected String rekening5Id;

	@Column(name = "rekening6_id", nullable = false, updatable = false)
	protected String rekening6Id;

	@Column(name = "description")
	protected String description;

	@Column(name = "information")
	protected String information;

	@Column(name = "volume1")
	protected BigDecimal volume1;

	@Column(name = "satuan1")
	protected String satuan1;

	@Column(name = "volume2")
	protected BigDecimal volume2;

	@Column(name = "satuan2")
	protected String satuan2;

	@Column(name = "volume3")
	protected BigDecimal volume3;

	@Column(name = "satuan3")
	protected String satuan3;

	@Column(name = "volume4")
	protected BigDecimal volume4;

	@Column(name = "satuan4")
	protected String satuan4;

	@Column(name = "volume")
	protected BigDecimal volume;

	@Column(name = "satuan")
	protected String satuan;

	@Column(name = "price")
	protected BigDecimal price;

	@Column(name = "total", nullable = false)
	protected BigDecimal total;

	@Column(name = "sebelum", nullable = false)
	protected BigDecimal sebelum;

}
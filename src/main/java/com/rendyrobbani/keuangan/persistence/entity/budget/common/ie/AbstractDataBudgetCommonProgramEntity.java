package com.rendyrobbani.keuangan.persistence.entity.budget.common.ie;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.DataBudgetCommonProgramEntity;
import com.rendyrobbani.keuangan.persistence.entity.budget.common.AbstractDataBudgetCommonEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.bidang.DataMasterBidangEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.program.DataMasterProgramEntity;
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
public abstract class AbstractDataBudgetCommonProgramEntity<DOMAIN extends DataBudgetCommonProgramEntity> extends AbstractDataBudgetCommonEntity<DOMAIN, String> implements DataBudgetCommonProgramEntity {

	@Id
	@Check(constraints = "id = concat_ws('|', unit_id, bidang_id, program_id)")
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

	@Check(constraints = "program_code = if(program_id not like '0.00.01%', program_id, concat(bidang_id, substring(program_id, 5)))")
	@Column(name = "program_code", nullable = false, updatable = false)
	protected String programCode;

	@Column(name = "program_id", nullable = false, updatable = false)
	protected String programId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "program_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	protected DataMasterProgramEntity program;

	@Column(name = "total", nullable = false)
	protected BigDecimal total;

	@Column(name = "sebelum", nullable = false)
	protected BigDecimal sebelum;

}
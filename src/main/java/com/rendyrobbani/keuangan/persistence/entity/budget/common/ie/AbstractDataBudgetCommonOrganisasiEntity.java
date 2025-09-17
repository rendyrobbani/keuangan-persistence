package com.rendyrobbani.keuangan.persistence.entity.budget.common.ie;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.DataBudgetCommonOrganisasiEntity;
import com.rendyrobbani.keuangan.persistence.entity.budget.common.AbstractDataBudgetCommonEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.organisasi.DataMasterOrganisasiEntity;
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
public abstract class AbstractDataBudgetCommonOrganisasiEntity extends AbstractDataBudgetCommonEntity<DataBudgetCommonOrganisasiEntity, String> implements DataBudgetCommonOrganisasiEntity {

	@Id
	@Check(constraints = "id = unit_id")
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
			@JoinColumn(name = "unit_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	protected DataMasterOrganisasiEntity unit;

	@Column(name = "total", nullable = false)
	protected BigDecimal total;

	@Column(name = "sebelum", nullable = false)
	protected BigDecimal sebelum;

}
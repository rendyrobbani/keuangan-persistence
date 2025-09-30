package com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.expend.belanja.subkegiatan;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.expend.belanja.subkegiatan.DataBudgetCommonExpendBelanjaSubkegiatan;
import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.expend.belanja.subkegiatan.SipdBudgetCommonExpendBelanjaSubkegiatan;
import com.rendyrobbani.keuangan.persistence.entity.budget.common.AbstractSipdBudgetCommonEntity;
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
public abstract class AbstractSipdBudgetCommonExpendBelanjaSubkegiatanEntity extends AbstractSipdBudgetCommonEntity<SipdBudgetCommonExpendBelanjaSubkegiatan, DataBudgetCommonExpendBelanjaSubkegiatan, String, Long> implements SipdBudgetCommonExpendBelanjaSubkegiatan {

	@Id
	@Column(name = "id")
	protected Long id;

	@Column(name = "unit_id")
	protected Long unitId;

	@Column(name = "unit_code")
	protected String unitCode;

	@Column(name = "skpd_id")
	protected Long skpdId;

	@Column(name = "skpd_code")
	protected String skpdCode;

	@Column(name = "unit_skpd_id")
	protected Long unitSkpdId;

	@Column(name = "unit_skpd_code")
	protected String unitSkpdCode;

	@Column(name = "urusan_id")
	protected Long urusanId;

	@Column(name = "urusan_code")
	protected String urusanCode;

	@Column(name = "bidang_id")
	protected Long bidangId;

	@Column(name = "bidang_code")
	protected String bidangCode;

	@Column(name = "program_id")
	protected Long programId;

	@Column(name = "program_code")
	protected String programCode;

	@Column(name = "kegiatan_id")
	protected Long kegiatanId;

	@Column(name = "kegiatan_code")
	protected String kegiatanCode;

	@Column(name = "subkegiatan_id")
	protected Long subkegiatanId;

	@Column(name = "subkegiatan_code")
	protected String subkegiatanCode;

	@Column(name = "subject_id")
	protected String subjectId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false)
	})
	protected DataBudgetCommonExpendBelanjaSubkegiatanEntity subject;

}
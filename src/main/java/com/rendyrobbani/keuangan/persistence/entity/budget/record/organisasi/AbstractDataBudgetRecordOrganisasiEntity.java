package com.rendyrobbani.keuangan.persistence.entity.budget.record.organisasi;

import com.rendyrobbani.keuangan.core.domain.entity.budget.record.organisasi.DataBudgetRecordOrganisasi;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.organisasi.DataMasterOrganisasi;
import com.rendyrobbani.keuangan.core.domain.vo.JabatanStatus;
import com.rendyrobbani.keuangan.core.domain.vo.Pangkat;
import com.rendyrobbani.keuangan.persistence.converter.JabatanStatusConverter;
import com.rendyrobbani.keuangan.persistence.converter.PangkatConverter;
import com.rendyrobbani.keuangan.persistence.entity.budget.record.AbstractDataBudgetRecordEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.hibernate.annotations.Check;

@Data
@Setter(AccessLevel.NONE)
@Accessors(fluent = true)
@EqualsAndHashCode(callSuper = true)
@MappedSuperclass
public abstract class AbstractDataBudgetRecordOrganisasiEntity extends AbstractDataBudgetRecordEntity<DataBudgetRecordOrganisasi, DataMasterOrganisasi, String> implements DataBudgetRecordOrganisasi {

	@Id
	@Check(constraints = "id = concat_ws('|', jadwal_id, common_id)")
	@Column(name = "id", nullable = false, updatable = false)
	protected String id;

	@Check(constraints = "common_id = code")
	@Column(name = "common_id", length = 22, nullable = false, updatable = false)
	protected String commonId;

	@Check(constraints = "common_id = unit_id")
	@Column(name = "code", length = 22, nullable = false, updatable = false)
	protected String code;

	@Column(name = "name", nullable = false)
	protected String name;

	@Check(constraints = "is_skpd is null or (is_skpd = (code like '%0000'))")
	@Column(name = "is_skpd", nullable = false)
	protected boolean isSkpd;

	@Check(constraints = "is_unit is null or (is_unit = (code not like '%0000'))")
	@Column(name = "is_unit", nullable = false)
	protected boolean isUnit;

	@Check(constraints = "is_setda is null or (is_setda = (code like '4.01%0000'))")
	@Column(name = "is_setda", nullable = false)
	protected boolean isSetda;

	@Column(name = "is_skpkd", nullable = false)
	protected boolean isSkpkd;

	@Check(constraints = "skpd_id = concat(left(unit_id, 18), '0000')")
	@Column(name = "skpd_id", length = 22, nullable = false, updatable = false)
	protected String skpdId;

	@Column(name = "unit_id", length = 22, nullable = false, updatable = false)
	protected String unitId;

	@Check(constraints = "main_bidang between 1 and 3")
	@Column(name = "main_bidang", nullable = false)
	protected Byte mainBidangIndex;

	@Column(name = "bidang1_id", length = 4, nullable = false, updatable = false)
	protected String bidang1Id;

	@Column(name = "bidang2_id", length = 4, updatable = false)
	protected String bidang2Id;

	@Column(name = "bidang3_id", length = 4, updatable = false)
	protected String bidang3Id;

	@Column(name = "head_id", length = 22)
	protected String headId;

	@Check(constraints = "head_status is null or head_status between 1 and 5")
	@Convert(converter = JabatanStatusConverter.class)
	@Column(name = "head_status")
	protected JabatanStatus headStatus;

	@Check(constraints = "head_pangkat regexp '" + Pangkat.REGEX + "'")
	@Convert(converter = PangkatConverter.class)
	@Column(name = "head_pangkat", length = 2)
	protected Pangkat headPangkat;

	@Column(name = "head_name")
	protected String headName;

	@Column(name = "head_title_prefix")
	protected String headTitlePrefix;

	@Column(name = "head_title_suffix")
	protected String headTitleSuffix;

}
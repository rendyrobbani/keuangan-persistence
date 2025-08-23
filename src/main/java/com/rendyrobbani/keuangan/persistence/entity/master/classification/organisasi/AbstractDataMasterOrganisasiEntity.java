package com.rendyrobbani.keuangan.persistence.entity.master.classification.organisasi;

import com.rendyrobbani.keuangan.core.common.classification.organisasi.OrganisasiClassification;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.organisasi.DataMasterOrganisasi;
import com.rendyrobbani.keuangan.core.domain.vo.JabatanStatus;
import com.rendyrobbani.keuangan.persistence.converter.JabatanStatusConverter;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.AbstractDataMasterClassificationEntity;
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

import java.time.LocalDateTime;

@Data
@Setter(AccessLevel.NONE)
@Accessors(fluent = true)
@EqualsAndHashCode(callSuper = true)
@MappedSuperclass
public abstract class AbstractDataMasterOrganisasiEntity extends AbstractDataMasterClassificationEntity<DataMasterOrganisasi> implements DataMasterOrganisasi {

	@Id
	@Check(constraints = "id = code")
	@Column(name = "id", length = 22, nullable = false, updatable = false)
	protected String id;

	@Check(constraints = "id = unit_id")
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

	@Override
	public void create(OrganisasiClassification classification, String name, boolean isSetda, boolean isSkpkd, Byte mainBidangIndex, String headId, JabatanStatus headStatus, LocalDateTime createdAt, String createdBy) {
		this.id = classification.unitCode();
		this.code = classification.unitCode();
		this.skpdId = classification.skpdCode();
		this.unitId = classification.unitCode();
		this.bidang1Id = classification.bidang1Code();
		this.bidang2Id = classification.bidang2Code();
		this.bidang3Id = classification.bidang3Code();
		this.name = name;
		this.isSkpd = classification.isSkpd();
		this.isUnit = classification.isUnit();
		this.isSetda = isSetda;
		this.isSkpkd = isSkpkd;
		this.mainBidangIndex = mainBidangIndex;
		this.headId = headId;
		this.headStatus = headStatus;
		this.create(createdAt, createdBy);
	}

	@Override
	public void update(String name, boolean isSetda, boolean isSkpkd, Byte mainBidangIndex, String headId, JabatanStatus headStatus, LocalDateTime updatedAt, String updatedBy) {
		this.name = name;
		this.isSetda = isSetda;
		this.isSkpkd = isSkpkd;
		this.mainBidangIndex = mainBidangIndex;
		this.headId = headId;
		this.headStatus = headStatus;
		this.update(updatedAt, updatedBy);
	}

}
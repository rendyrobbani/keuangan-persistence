package com.rendyrobbani.keuangan.persistence.entity.master.classification.organisasi;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.organisasi.DataMasterOrganisasi;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.organisasi.LogsMasterOrganisasi;
import com.rendyrobbani.keuangan.core.domain.vo.JabatanStatus;
import com.rendyrobbani.keuangan.persistence.converter.JabatanStatusConverter;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.AbstractLogsMasterClassifcationEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
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
public abstract class AbstractLogsMasterOrganisasiEntity extends AbstractLogsMasterClassifcationEntity<LogsMasterOrganisasi, DataMasterOrganisasi> implements LogsMasterOrganisasi {

	@Column(name = "code", length = 22, nullable = false, updatable = false)
	protected String code;

	@Column(name = "name", nullable = false)
	protected String name;

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

	@Column(name = "bidang2_id", length = 4, nullable = false, updatable = false)
	protected String bidang2Id;

	@Column(name = "bidang3_id", length = 4, nullable = false, updatable = false)
	protected String bidang3Id;

	@Column(name = "head_id", length = 22)
	protected String headId;

	@Check(constraints = "head_status is null or head_status between 1 and 5")
	@Convert(converter = JabatanStatusConverter.class)
	@Column(name = "head_status")
	protected JabatanStatus headStatus;

	@Check(constraints = "subject_id = unit_id")
	@Column(name = "subject_id", length = 22, nullable = false)
	protected String subjectId;

	@Override
	public void create(DataMasterOrganisasi data, LocalDateTime createdAt, String createdBy) {
		this.code = data.code();
		this.name = data.name();
		this.skpdId = data.skpdId();
		this.unitId = data.unitId();
		this.mainBidangIndex = data.mainBidangIndex();
		this.bidang1Id = data.bidang1Id();
		this.bidang2Id = data.bidang2Id();
		this.bidang3Id = data.bidang3Id();
		this.headId = data.headId();
		this.headStatus = data.headStatus();
		this.isLocked = data.isLocked();
		this.isDeleted = data.isDeleted();
		this.create(createdAt, createdBy);
	}

}
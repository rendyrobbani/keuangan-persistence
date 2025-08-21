package com.rendyrobbani.keuangan.persistence.entity.master.classification.sumber;

import com.rendyrobbani.keuangan.core.common.classification.sumber.SumberClassification;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.sumber.DataMasterSumber;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.AbstractDataMasterClassificationEntity;
import jakarta.persistence.Column;
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
public abstract class AbstractDataMasterSumberEntity extends AbstractDataMasterClassificationEntity<DataMasterSumber> implements DataMasterSumber {

	@Id
	@Check(constraints = "id = code")
	@Column(name = "id", length = 17, nullable = false, updatable = false)
	protected String id;

	@Check(constraints = "code = coalesce(sumber6_id, sumber5_id, sumber4_id, sumber3_id, sumber2_id, sumber1_id)")
	@Column(name = "code", length = 17, nullable = false, updatable = false)
	protected String code;

	@Column(name = "name", nullable = false)
	protected String name;

	@Check(constraints = "level = (case when sumber6_id is not null then 6 when sumber5_id is not null then 5 when sumber4_id is not null then 4 when sumber3_id is not null then 3 when sumber2_id is not null then 2 when sumber1_id is not null then 1 end)")
	@Column(name = "level", nullable = false)
	private Integer level;

	@Column(name = "is_enabled", nullable = false)
	private boolean isEnabled;

	@Column(name = "is_umum", nullable = false)
	private boolean isUmum;

	@Column(name = "is_khusus", nullable = false)
	private boolean isKhusus;

	@Check(constraints = "sumber1_id = left(id, length(sumber1_id))")
	@Column(name = "sumber1_id", length = 1, updatable = false)
	protected String sumber1Id;

	@Check(constraints = "sumber2_id = left(id, length(sumber2_id))")
	@Column(name = "sumber2_id", length = 3, updatable = false)
	protected String sumber2Id;

	@Check(constraints = "sumber3_id = left(id, length(sumber3_id))")
	@Column(name = "sumber3_id", length = 6, updatable = false)
	protected String sumber3Id;

	@Check(constraints = "sumber4_id = left(id, length(sumber4_id))")
	@Column(name = "sumber4_id", length = 9, updatable = false)
	protected String sumber4Id;

	@Check(constraints = "sumber5_id = left(id, length(sumber5_id))")
	@Column(name = "sumber5_id", length = 12, updatable = false)
	protected String sumber5Id;

	@Check(constraints = "sumber6_Id = left(id, length(sumber6_Id))")
	@Column(name = "sumber6_Id", length = 17, updatable = false)
	protected String sumber6Id;

	@Override
	public void create(SumberClassification classification, String name, boolean isEnabled, LocalDateTime createdAt, String createdBy) {
		this.sumber1Id = classification.sumber1Code();
		this.sumber2Id = classification.sumber2Code();
		this.sumber3Id = classification.sumber3Code();
		this.sumber4Id = classification.sumber4Code();
		this.sumber5Id = classification.sumber5Code();
		this.sumber6Id = classification.sumber6Code();
		this.level = classification.level();

		switch (classification.level()) {
			case 1 -> this.id = classification.sumber1Code();
			case 2 -> this.id = classification.sumber2Code();
			case 3 -> this.id = classification.sumber3Code();
			case 4 -> this.id = classification.sumber4Code();
			case 5 -> this.id = classification.sumber5Code();
			case 6 -> this.id = classification.sumber6Code();
		}

		this.code = this.id;
		this.name = name;
		this.isEnabled = isEnabled;
		this.create(createdAt, createdBy);
	}

	@Override
	public void update(String name, boolean isEnabled, LocalDateTime updatedAt, String updatedBy) {
		this.name = name;
		this.isEnabled = isEnabled;
		this.create(createdAt, createdBy);
	}

}
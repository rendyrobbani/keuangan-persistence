package com.rendyrobbani.keuangan.persistence.entity.master.classification.subfungsi;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.subfungsi.DataMasterSubfungsi;
import com.rendyrobbani.keuangan.core.domain.vo.classification.fungsi.SubfungsiClassification;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.AbstractDataMasterClassifcationEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Data
@Setter(AccessLevel.NONE)
@Accessors(fluent = true)
@EqualsAndHashCode(callSuper = true)
@MappedSuperclass
public abstract class AbstractDataMasterSubfungsiEntity extends AbstractDataMasterClassifcationEntity<DataMasterSubfungsi> implements DataMasterSubfungsi {

	@Id
	@Column(name = "id", length = 5, nullable = false, updatable = false)
	protected String id;

	@Column(name = "code", length = 5, nullable = false, updatable = false)
	protected String code;

	@Column(name = "name", nullable = false)
	protected String name;

	@Column(name = "fungsi_id", length = 2, nullable = false)
	protected String fungsiId;

	@Override
	public void create(SubfungsiClassification classification, String name, LocalDateTime createdAt, String createdBy) {
		this.id = classification.subfungsiCode();
		this.code = classification.subfungsiCode();
		this.name = name;
		this.fungsiId = classification.fungsiCode();
		this.create(createdAt, createdBy);
	}

	@Override
	public void update(String name, LocalDateTime updatedAt, String updatedBy) {
		this.name = name;
		this.create(createdAt, createdBy);
	}

}
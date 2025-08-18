package com.rendyrobbani.keuangan.persistence.entity.master.classification.fungsi;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.fungsi.DataMasterFungsi;
import com.rendyrobbani.keuangan.core.domain.vo.classification.fungsi.FungsiClassification;
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
public abstract class AbstractDataMasterFungsiEntity extends AbstractDataMasterClassifcationEntity<DataMasterFungsi> implements DataMasterFungsi {

	@Id
	@Column(name = "id", length = 2, nullable = false)
	protected String id;

	@Column(name = "code", length = 2, nullable = false)
	protected String code;

	@Column(name = "name", nullable = false)
	protected String name;

	@Override
	public void create(FungsiClassification classification, String name, LocalDateTime createdAt, String createdBy) {
		this.id = classification.fungsiCode();
		this.code = classification.fungsiCode();
		this.name = name;
		this.create(createdAt, createdBy);
	}

	@Override
	public void update(String name, LocalDateTime updatedAt, String updatedBy) {
		this.name = name;
		this.create(createdAt, createdBy);
	}

}
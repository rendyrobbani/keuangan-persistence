package com.rendyrobbani.keuangan.persistence.entity.master.classification.provinsi;

import com.rendyrobbani.keuangan.core.common.classification.daerah.ProvinsiClassification;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.provinsi.DataMasterProvinsi;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.AbstractDataMasterClassifcationEntity;
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
public abstract class AbstractDataMasterProvinsiEntity extends AbstractDataMasterClassifcationEntity<DataMasterProvinsi> implements DataMasterProvinsi {

	@Id
	@Check(constraints = "id = code")
	@Column(name = "id", length = 2, nullable = false, updatable = false)
	protected String id;

	@Column(name = "code", length = 2, nullable = false, updatable = false)
	protected String code;

	@Column(name = "name", nullable = false)
	protected String name;

	@Override
	public void create(ProvinsiClassification classification, String name, LocalDateTime createdAt, String createdBy) {
		this.id = classification.provinsiCode();
		this.code = classification.provinsiCode();
		this.name = name;
		this.create(createdAt, createdBy);
	}

	@Override
	public void update(String name, LocalDateTime updatedAt, String updatedBy) {
		this.name = name;
		this.create(createdAt, createdBy);
	}

}
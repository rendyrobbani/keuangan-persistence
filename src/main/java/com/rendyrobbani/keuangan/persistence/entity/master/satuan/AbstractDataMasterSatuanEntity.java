package com.rendyrobbani.keuangan.persistence.entity.master.satuan;

import com.rendyrobbani.keuangan.core.domain.entity.master.satuan.DataMasterSatuan;
import com.rendyrobbani.keuangan.persistence.entity.master.AbstractDataMasterEntity;
import jakarta.persistence.*;
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
public abstract class AbstractDataMasterSatuanEntity extends AbstractDataMasterEntity<DataMasterSatuan, Long> implements DataMasterSatuan {

	@Id
	@Column(name = "id", nullable = false, updatable = false)
	protected Long id;

	@Column(name = "name", nullable = false)
	protected String name;

	@Override
	public void create(Long id, String name, LocalDateTime createdAt, String createdBy) {
		this.id = id;
		this.name = name;
		this.create(createdAt, createdBy);
	}

	@Override
	public void update(String name, LocalDateTime updatedAt, String updatedBy) {
		this.name = name;
		this.update(updatedAt, updatedBy);
	}

}
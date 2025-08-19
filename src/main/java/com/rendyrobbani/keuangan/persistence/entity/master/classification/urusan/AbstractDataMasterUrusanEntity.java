package com.rendyrobbani.keuangan.persistence.entity.master.classification.urusan;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.urusan.DataMasterUrusan;
import com.rendyrobbani.keuangan.core.domain.vo.classification.urusan.UrusanClassification;
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
public abstract class AbstractDataMasterUrusanEntity extends AbstractDataMasterClassifcationEntity<DataMasterUrusan> implements DataMasterUrusan {

	@Id
	@Check(constraints = "id = replace(code, 'X', '0')")
	@Column(name = "id", length = 1, nullable = false, updatable = false)
	protected String id;

	@Column(name = "code", length = 1, nullable = false, updatable = false)
	protected String code;

	@Column(name = "name", nullable = false)
	protected String name;

	@Override
	public void create(UrusanClassification classification, String name, LocalDateTime createdAt, String createdBy) {
		this.id = classification.urusanCode().replaceAll("X", "0");
		this.code = classification.urusanCode();
		this.name = name;
		this.create(createdAt, createdBy);
	}

	@Override
	public void update(String name, LocalDateTime updatedAt, String updatedBy) {
		this.name = name;
		this.create(createdAt, createdBy);
	}

}
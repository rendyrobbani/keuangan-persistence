package com.rendyrobbani.keuangan.persistence.entity.master.classification.bidang;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.bidang.DataMasterBidang;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.bidang.SipdMasterBidang;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.AbstractSipdMasterClassificationEntity;
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
public abstract class AbstractSipdMasterBidangEntity extends AbstractSipdMasterClassificationEntity<SipdMasterBidang, DataMasterBidang> implements SipdMasterBidang {

	@Id
	@Column(name = "id", nullable = false, updatable = false)
	protected Long id;

	@Column(name = "code", length = 4, nullable = false)
	protected String code;

	@Column(name = "name", nullable = false)
	protected String name;

	@Check(constraints = "subject_id = replace(code, 'X', '0')")
	@Column(name = "subject_id", length = 4, nullable = false)
	protected String subjectId;

	@Override
	public void create(Long id, String code, String name, String subjectId, boolean isLocked, LocalDateTime createdAt, String createdBy) {
		this.id = id;
		this.code = code;
		this.name = name;
		this.subjectId = subjectId;
		this.isLocked = isLocked;
		this.create(createdAt, createdBy);
	}

	@Override
	public void update(String code, String name, String subjectId, boolean isLocked, LocalDateTime updatedAt, String updatedBy) {
		this.code = code;
		this.name = name;
		this.subjectId = subjectId;
		this.isLocked = isLocked;
		this.update(updatedAt, updatedBy);
	}

}
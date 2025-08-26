package com.rendyrobbani.keuangan.persistence.entity.master.tapd.sign;

import com.rendyrobbani.keuangan.core.domain.entity.master.tapd.sign.DataMasterTapdSign;
import com.rendyrobbani.keuangan.core.domain.entity.master.tapd.sign.LogsMasterTapdSign;
import com.rendyrobbani.keuangan.persistence.entity.master.AbstractLogsMasterEntity;
import jakarta.persistence.Column;
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
public abstract class AbstractLogsMasterTapdSignEntity extends AbstractLogsMasterEntity<LogsMasterTapdSign, DataMasterTapdSign, String> implements LogsMasterTapdSign {

	@Column(name = "number")
	protected Short number;

	@Column(name = "position")
	protected String position;

	@Column(name = "is_locked", nullable = false)
	protected boolean isLocked;

	@Column(name = "is_deleted", nullable = false)
	protected boolean isDeleted;

	@Column(name = "subject_id", length = 18, nullable = false)
	protected String subjectId;

	@Override
	public void create(DataMasterTapdSign data, LocalDateTime createdAt, String createdBy) {
		this.number = data.number();
		this.position = data.position();
		this.isLocked = data.isLocked();
		this.isDeleted = data.isDeleted();
		this.subjectId = data.id();
		this.create(createdAt, createdBy);
	}

}
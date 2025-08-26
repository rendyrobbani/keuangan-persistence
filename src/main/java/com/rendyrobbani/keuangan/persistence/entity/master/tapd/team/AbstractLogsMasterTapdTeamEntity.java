package com.rendyrobbani.keuangan.persistence.entity.master.tapd.team;

import com.rendyrobbani.keuangan.core.domain.entity.master.tapd.team.DataMasterTapdTeam;
import com.rendyrobbani.keuangan.core.domain.entity.master.tapd.team.LogsMasterTapdTeam;
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
public abstract class AbstractLogsMasterTapdTeamEntity extends AbstractLogsMasterEntity<LogsMasterTapdTeam, DataMasterTapdTeam, String> implements LogsMasterTapdTeam {

	@Column(name = "position")
	protected String position;

	@Column(name = "is_can_lock_create", nullable = false)
	protected boolean isCanLockCreate;

	@Column(name = "is_can_lock_update", nullable = false)
	protected boolean isCanLockUpdate;

	@Column(name = "is_can_lock_detail", nullable = false)
	protected boolean isCanLockDetail;

	@Column(name = "is_locked", nullable = false)
	protected boolean isLocked;

	@Column(name = "is_deleted", nullable = false)
	protected boolean isDeleted;

	@Column(name = "subject_id", nullable = false)
	protected String subjectId;

	@Override
	public void create(DataMasterTapdTeam data, LocalDateTime createdAt, String createdBy) {
		this.position = data.position();
		this.isCanLockCreate = data.isCanLockCreate();
		this.isCanLockUpdate = data.isCanLockUpdate();
		this.isCanLockDetail = data.isCanLockDetail();
		this.isLocked = data.isLocked();
		this.isDeleted = data.isDeleted();
		this.subjectId = data.id();
		this.create(createdAt, createdBy);
	}

}
package com.rendyrobbani.keuangan.persistence.entity.master.tapd.team;

import com.rendyrobbani.keuangan.core.domain.entity.master.tapd.team.DataMasterTapdTeam;
import com.rendyrobbani.keuangan.core.domain.entity.user.DataUser;
import com.rendyrobbani.keuangan.persistence.entity.master.AbstractDataMasterEntity;
import com.rendyrobbani.keuangan.persistence.entity.user.DataUserEntity;
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
public abstract class AbstractDataMasterTapdTeamEntity extends AbstractDataMasterEntity<DataMasterTapdTeam, String> implements DataMasterTapdTeam {

	@Id
	@Column(name = "id", length = 18, nullable = false, updatable = false)
	protected String id;

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

	@Column(name = "locked_at")
	protected LocalDateTime lockedAt;

	@Column(name = "locked_by", length = 18)
	protected String lockedBy;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "locked_by", referencedColumnName = "id", insertable = false, updatable = false)
	})
	protected DataUserEntity lockedByAsDataUser;

	@Override
	public void lock(LocalDateTime lockedAt, String lockedBy) {
		this.isLocked = true;
		this.lockedAt = lockedAt;
		this.lockedBy = lockedBy;
	}

	@Override
	public void unlock(LocalDateTime updatedAt, String updatedBy) {
		this.isLocked = false;
		this.lockedAt = null;
		this.lockedBy = null;
		this.updatedAt = updatedAt;
		this.updatedBy = updatedBy;
	}

	@Override
	public void delete(LocalDateTime deletedAt, String deletedBy) {
		lock(deletedAt, deletedBy);
		super.delete(deletedAt, deletedBy);
	}

	@Override
	public void create(DataUser user, String position, boolean isCanLockCreate, boolean isCanLockUpdate, boolean isCanLockDetail, LocalDateTime createdAt, String createdBy) {
		this.id = user().id();
		this.position = position;
		this.isCanLockCreate = isCanLockCreate;
		this.isCanLockUpdate = isCanLockUpdate;
		this.isCanLockDetail = isCanLockDetail;
		this.create(createdAt, createdBy);
	}

	@Override
	public void update(DataUser user, String position, boolean isCanLockCreate, boolean isCanLockUpdate, boolean isCanLockDetail, LocalDateTime updatedAt, String updatedBy) {
		this.id = user().id();
		this.position = position;
		this.isCanLockCreate = isCanLockCreate;
		this.isCanLockUpdate = isCanLockUpdate;
		this.isCanLockDetail = isCanLockDetail;
		this.update(updatedAt, updatedBy);
	}

}
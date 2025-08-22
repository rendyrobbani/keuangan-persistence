package com.rendyrobbani.keuangan.persistence.entity.master.priority;

import com.rendyrobbani.keuangan.core.domain.entity.master.priority.DataMasterPriorityEntity;
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
public abstract class AbstractDataMasterPriorityEntity<DOMAIN extends DataMasterPriorityEntity> extends AbstractDataMasterEntity<DOMAIN, Long> implements DataMasterPriorityEntity {

	@Id
	@Column(name = "id", nullable = false, updatable = false)
	protected Long id;

	@Column(name = "year", nullable = false)
	protected Short year;

	@Column(name = "number", nullable = false)
	protected Byte number;

	@Column(name = "name", nullable = false)
	protected String name;

	@Column(name = "sipdName", nullable = false)
	protected String sipdName;

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
	public void create(Long id, Short year, Byte number, String name, String sipdName, LocalDateTime createdAt, String createdBy) {
		this.id = id;
		this.year = year;
		this.number = number;
		this.name = name;
		this.sipdName = sipdName;
		this.create(createdAt, createdBy);
	}

	@Override
	public void update(Short year, Byte number, String name, String sipdName, LocalDateTime updatedAt, String updatedBy) {
		this.year = year;
		this.number = number;
		this.name = name;
		this.sipdName = sipdName;
		this.update(createdAt, createdBy);
	}

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

}
package com.rendyrobbani.keuangan.persistence.entity;

import com.rendyrobbani.keuangan.core.domain.entity.DataEntity;
import com.rendyrobbani.keuangan.core.domain.entity.SipdEntity;
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
public abstract class AbstractSipdEntity<DOMAIN extends SipdEntity<SUBJECT, SUBJECTID, ID>, SUBJECT extends DataEntity<SUBJECTID>, SUBJECTID, ID> extends AbstractBaseEntity<DOMAIN, ID> implements SipdEntity<SUBJECT, SUBJECTID, ID> {

	@Column(name = "created_at", updatable = false)
	protected LocalDateTime createdAt;

	@Column(name = "created_by", length = 18, updatable = false)
	protected String createdBy;

	@Column(name = "updated_at")
	protected LocalDateTime updatedAt;

	@Column(name = "updated_by", length = 18)
	protected String updatedBy;

	@Column(name = "is_deleted")
	protected boolean isDeleted;

	@Column(name = "deleted_at")
	protected LocalDateTime deletedAt;

	@Column(name = "deleted_by", length = 18)
	protected String deletedBy;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "created_by", referencedColumnName = "id", insertable = false, updatable = false)
	})
	protected DataUserEntity createdByAsDataUser;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "updated_by", referencedColumnName = "id", insertable = false, updatable = false)
	})
	protected DataUserEntity updatedByAsDataUser;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "deleted_by", referencedColumnName = "id", insertable = false, updatable = false)
	})
	protected DataUserEntity deletedByAsDataUser;

	@Override
	public void create(LocalDateTime createdAt, String createdBy) {
		this.createdAt = createdAt;
		this.createdBy = createdBy;
	}

	@Override
	public void update(LocalDateTime updatedAt, String updatedBy) {
		this.updatedAt = updatedAt;
		this.updatedBy = updatedBy;
	}

	@Override
	public void delete(LocalDateTime deletedAt, String deletedBy) {
		this.isDeleted = true;
		this.deletedAt = deletedAt;
		this.deletedBy = deletedBy;
	}

	@Override
	public void revive(LocalDateTime updatedAt, String updatedBy) {
		this.isDeleted = false;
		this.deletedAt = null;
		this.deletedBy = null;
		this.updatedAt = updatedAt;
		this.updatedBy = updatedBy;
	}

}
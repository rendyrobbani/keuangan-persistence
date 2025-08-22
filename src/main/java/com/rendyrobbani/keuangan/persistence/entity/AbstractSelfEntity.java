package com.rendyrobbani.keuangan.persistence.entity;

import com.rendyrobbani.keuangan.core.domain.entity.SelfEntity;
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
public abstract class AbstractSelfEntity<DOMAIN extends SelfEntity> extends AbstractBaseEntity<DOMAIN, Long> implements SelfEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, updatable = false)
	protected Long id;

	@Column(name = "created_at", updatable = false)
	protected LocalDateTime createdAt;

	@Column(name = "created_by", length = 18, updatable = false)
	protected String createdBy;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "created_by", referencedColumnName = "id", insertable = false, updatable = false)
	})
	protected DataUserEntity createdByAsDataUser;

	@Override
	public void create(LocalDateTime createdAt, String createdBy) {
		this.createdAt = createdAt;
		this.createdBy = createdBy;
	}

}
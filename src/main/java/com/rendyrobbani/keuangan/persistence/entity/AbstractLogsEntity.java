package com.rendyrobbani.keuangan.persistence.entity;

import com.rendyrobbani.keuangan.core.domain.entity.DataEntity;
import com.rendyrobbani.keuangan.core.domain.entity.LogsEntity;
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
public abstract class AbstractLogsEntity<DOMAIN extends LogsEntity<SUBJECT, SUBJECTID>, SUBJECT extends DataEntity<SUBJECTID>, SUBJECTID> extends AbstractBaseEntity<DOMAIN, Long> implements LogsEntity<SUBJECT, SUBJECTID> {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	protected Long id;

	@Column(name = "logged_at", nullable = false)
	private LocalDateTime loggedAt;

	@Column(name = "logged_by", length = 18, nullable = false)
	private String loggedBy;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "logged_by", referencedColumnName = "id", insertable = false, updatable = false)
	})
	protected DataUserEntity loggedByByAsDataUser;

	public void create(LocalDateTime createdAt, String createdBy) {
		this.loggedAt = createdAt;
		this.loggedBy = createdBy;
	}

}
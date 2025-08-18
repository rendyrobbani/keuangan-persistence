package com.rendyrobbani.keuangan.persistence.entity.user;

import com.rendyrobbani.keuangan.core.domain.entity.user.DataUser;
import com.rendyrobbani.keuangan.core.domain.entity.user.LogsUser;
import com.rendyrobbani.keuangan.core.domain.vo.Gender;
import com.rendyrobbani.keuangan.core.domain.vo.Pangkat;
import com.rendyrobbani.keuangan.persistence.converter.GenderConverter;
import com.rendyrobbani.keuangan.persistence.converter.PangkatConverter;
import com.rendyrobbani.keuangan.persistence.entity.AbstractLogsEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.MappedSuperclass;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Setter(AccessLevel.NONE)
@Accessors(fluent = true)
@EqualsAndHashCode(callSuper = true)
@MappedSuperclass
public abstract class AbstractLogsUserEntity extends AbstractLogsEntity<LogsUser, DataUser, String> implements LogsUser {

	@Convert(converter = PangkatConverter.class)
	@Column(name = "pangkat", length = 2, nullable = false)
	protected Pangkat pangkat;

	@Column(name = "name", nullable = false)
	protected String name;

	@Column(name = "title_prefix")
	protected String titlePrefix;

	@Column(name = "title_suffix")
	protected String titleSuffix;

	@Column(name = "password", nullable = false)
	protected String password;

	@Column(name = "date_of_birth", nullable = false, updatable = false)
	protected LocalDate dateOfBirth;

	@Column(name = "date_of_start")
	protected LocalDate dateOfStart;

	@Convert(converter = GenderConverter.class)
	@Column(name = "gender", nullable = false, updatable = false)
	protected Gender gender;

	@Column(name = "number", nullable = false, updatable = false)
	protected Short number;

	@Column(name = "is_pns", nullable = false)
	protected boolean isPNS;

	@Column(name = "is_p3k", nullable = false)
	protected boolean isP3K;

	@Column(name = "is_locked", nullable = false)
	protected boolean isLocked;

	@Column(name = "is_deleted", nullable = false)
	protected boolean isDeleted;

	@Column(name = "subject_id", length = 18, nullable = false)
	protected String subjectId;

	@Override
	public void create(DataUser subject, LocalDateTime createdAt, String createdBy) {
		if (subject == null) throw new RuntimeException("subject cannot be null");
		this.subjectId = subject.id();
		this.pangkat = subject.pangkat();
		this.name = subject.name();
		this.titlePrefix = subject.titlePrefix();
		this.titleSuffix = subject.titleSuffix();
		this.password = subject.password();
		this.dateOfBirth = subject.dateOfBirth();
		this.dateOfStart = subject.dateOfStart();
		this.gender = subject.gender();
		this.number = subject.number();
		this.isPNS = subject.isPNS();
		this.isP3K = subject.isP3K();
		this.isLocked = subject.isLocked();
		this.isDeleted = subject.isDeleted();
		this.create(createdAt, createdBy);
	}

}
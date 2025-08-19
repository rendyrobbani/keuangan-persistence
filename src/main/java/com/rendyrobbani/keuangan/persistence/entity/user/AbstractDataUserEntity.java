package com.rendyrobbani.keuangan.persistence.entity.user;

import com.rendyrobbani.keuangan.core.domain.entity.user.DataUser;
import com.rendyrobbani.keuangan.core.domain.vo.Gender;
import com.rendyrobbani.keuangan.core.domain.vo.Nip;
import com.rendyrobbani.keuangan.core.domain.vo.Pangkat;
import com.rendyrobbani.keuangan.persistence.converter.GenderConverter;
import com.rendyrobbani.keuangan.persistence.converter.PangkatConverter;
import com.rendyrobbani.keuangan.persistence.entity.AbstractDataEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.hibernate.annotations.Check;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Setter(AccessLevel.NONE)
@Accessors(fluent = true)
@EqualsAndHashCode(callSuper = true)
@MappedSuperclass
public abstract class AbstractDataUserEntity extends AbstractDataEntity<DataUser, String> implements DataUser {

	@Id
	@Column(name = "id", length = 18, nullable = false, updatable = false)
	protected String id;

	@Check(constraints = "pangkat regexp '" + Pangkat.REGEX + "'")
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

	@Check(constraints = "gender between 1 and 2")
	@Convert(converter = GenderConverter.class)
	@Column(name = "gender", nullable = false, updatable = false)
	protected Gender gender;

	@Check(constraints = "number between 1 and 999")
	@Column(name = "number", nullable = false, updatable = false)
	protected Short number;

	@Check(constraints = "pangkat regexp '" + Pangkat.REGEX_PNS + "'")
	@Column(name = "is_pns", nullable = false)
	protected boolean isPNS;

	@Check(constraints = "pangkat regexp '" + Pangkat.REGEX_P3K + "'")
	@Column(name = "is_p3k", nullable = false)
	protected boolean isP3K;

	@Column(name = "is_locked", nullable = false)
	protected boolean isLocked;

	@Column(name = "locked_at")
	protected LocalDateTime lockedAt;

	@Column(name = "locked_by", length = 18)
	protected String lockedBy;

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
	public void create(String id, Pangkat pangkat, String name, String titlePrefix, String titleSuffix, String password, LocalDate dateOfStart, LocalDateTime createdAt, String createdBy) {
		Nip nip = Nip.parse(id);
		this.id = id;
		this.dateOfBirth = nip.dateOfBirth();
		this.dateOfStart = nip.dateOfStart();
		this.gender = nip.gender();
		this.number = nip.number();
		this.isLocked = false;
		this.isDeleted = false;
		this.sync(pangkat, name, titlePrefix, titleSuffix, password, dateOfStart);
		this.create(createdAt, createdBy);
	}

	@Override
	public void update(Pangkat pangkat, String name, String titlePrefix, String titleSuffix, String password, LocalDate dateOfStart, LocalDateTime updatedAt, String updatedBy) {
		this.sync(pangkat, name, titlePrefix, titleSuffix, password, dateOfStart);
		this.update(updatedAt, updatedBy);
	}

	@Override
	public void delete(LocalDateTime deletedAt, String deletedBy) {
		lock(deletedAt, deletedBy);
		super.delete(deletedAt, deletedBy);
	}

	protected void sync(Pangkat pangkat, String name, String titlePrefix, String titleSuffix, String password, LocalDate dateOfStart) {
		if (pangkat == null) throw new RuntimeException("pangkat cannot be null");
		this.pangkat = pangkat;
		this.name = name;
		this.titlePrefix = titlePrefix;
		this.titleSuffix = titleSuffix;
		this.password = password;
		this.isPNS = pangkat.isPNS();
		this.isP3K = pangkat.isP3K();
		if (pangkat.isP3K()) this.dateOfStart = dateOfStart;
	}

}
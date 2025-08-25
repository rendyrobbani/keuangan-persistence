package com.rendyrobbani.keuangan.persistence.entity.master.mayor;

import com.rendyrobbani.keuangan.core.domain.entity.master.mayor.DataMasterMayor;
import com.rendyrobbani.keuangan.core.domain.vo.JabatanStatus;
import com.rendyrobbani.keuangan.persistence.converter.JabatanStatusConverter;
import com.rendyrobbani.keuangan.persistence.entity.master.AbstractDataMasterEntity;
import com.rendyrobbani.keuangan.persistence.entity.user.DataUserEntity;
import jakarta.persistence.*;
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
public abstract class AbstractDataMasterMayorEntity extends AbstractDataMasterEntity<DataMasterMayor, Byte> implements DataMasterMayor {

	@Id
	@Check(constraints = "id = 1")
	@Column(name = "id", nullable = false, updatable = false)
	protected Byte id;

	@Convert(converter = JabatanStatusConverter.class)
	@Column(name = "status", nullable = false)
	protected JabatanStatus status;

	@Column(name = "name", nullable = false)
	protected String name;

	@Column(name = "title_prefix")
	protected String titlePrefix;

	@Column(name = "title_suffix")
	protected String titleSuffix;

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
	public void create(JabatanStatus status, String name, String titlePrefix, String titleSuffix, LocalDateTime createdAt, String createdBy) {
		this.status = status;
		this.name = name;
		this.titlePrefix = titlePrefix;
		this.titleSuffix = titleSuffix;
		this.create(createdAt, createdBy);
	}

	@Override
	public void update(JabatanStatus status, String name, String titlePrefix, String titleSuffix, LocalDateTime updatedAt, String updatedBy) {
		this.status = status;
		this.name = name;
		this.titlePrefix = titlePrefix;
		this.titleSuffix = titleSuffix;
		this.update(updatedAt, updatedBy);
	}

}
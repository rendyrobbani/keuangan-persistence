package com.rendyrobbani.keuangan.persistence.entity.master.tapd.sign;

import com.rendyrobbani.keuangan.core.common.util.number.NumberUtil;
import com.rendyrobbani.keuangan.core.domain.entity.master.tapd.sign.DataMasterTapdSign;
import com.rendyrobbani.keuangan.core.domain.entity.user.DataUser;
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
public abstract class AbstractDataMasterTapdSignEntity extends AbstractDataMasterEntity<DataMasterTapdSign, String> implements DataMasterTapdSign {

	@Id
	@Check(constraints = "id = concat_ws('|', lpad(number, 2, '0'), team_id)")
	@Column(name = "id", length = 21, nullable = false, updatable = false)
	protected String id;

	@Column(name = "number")
	protected Short number;

	@Column(name = "team_id", length = 18, nullable = false, updatable = false)
	protected String teamId;

	@Column(name = "position")
	protected String position;

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
	public void create(DataUser user, Short number, String position, LocalDateTime createdAt, String createdBy) {
		this.id = String.join("|", NumberUtil.lpadZero(number.intValue(), 2), user.id());
		this.number = number;
		this.position = position;
		this.create(createdAt, createdBy);
	}

	@Override
	public void update(DataUser user, Short number, String position, LocalDateTime updatedAt, String updatedBy) {
		this.id = String.join("|", NumberUtil.lpadZero(number.intValue(), 2), user.id());
		this.number = number;
		this.position = position;
		this.update(updatedAt, updatedBy);
	}

}
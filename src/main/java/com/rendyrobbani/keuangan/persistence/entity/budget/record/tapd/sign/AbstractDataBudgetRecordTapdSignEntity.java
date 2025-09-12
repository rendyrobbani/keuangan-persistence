package com.rendyrobbani.keuangan.persistence.entity.budget.record.tapd.sign;

import com.rendyrobbani.keuangan.core.domain.entity.budget.record.tapd.sign.DataBudgetRecordTapdSign;
import com.rendyrobbani.keuangan.core.domain.entity.master.tapd.sign.DataMasterTapdSign;
import com.rendyrobbani.keuangan.persistence.entity.budget.record.AbstractDataBudgetRecordEntity;
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
public abstract class AbstractDataBudgetRecordTapdSignEntity extends AbstractDataBudgetRecordEntity<DataBudgetRecordTapdSign, DataMasterTapdSign, String> implements DataBudgetRecordTapdSign {

	@Id
	@Check(constraints = "id = concat_ws('|', jadwal_id, common_id)")
	@Column(name = "id", nullable = false, updatable = false)
	protected String id;

	@Column(name = "common_id", length = 21, nullable = false, updatable = false)
	protected String commonId;

	@Column(name = "number")
	protected Short number;

	@Column(name = "team_id", length = 18, nullable = false, updatable = false)
	protected String teamId;

	@Column(name = "position")
	protected String position;

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

}
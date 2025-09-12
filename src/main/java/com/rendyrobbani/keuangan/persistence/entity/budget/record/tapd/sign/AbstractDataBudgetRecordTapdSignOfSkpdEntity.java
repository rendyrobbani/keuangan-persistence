package com.rendyrobbani.keuangan.persistence.entity.budget.record.tapd.sign;

import com.rendyrobbani.keuangan.core.domain.entity.budget.record.tapd.sign.DataBudgetRecordTapdSignOfSkpd;
import com.rendyrobbani.keuangan.core.domain.entity.master.tapd.sign.DataMasterTapdSignOfSkpd;
import com.rendyrobbani.keuangan.persistence.entity.budget.record.AbstractDataBudgetRecordEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.hibernate.annotations.Check;

@Data
@Setter(AccessLevel.NONE)
@Accessors(fluent = true)
@EqualsAndHashCode(callSuper = true)
@MappedSuperclass
public abstract class AbstractDataBudgetRecordTapdSignOfSkpdEntity extends AbstractDataBudgetRecordEntity<DataBudgetRecordTapdSignOfSkpd, DataMasterTapdSignOfSkpd, String> implements DataBudgetRecordTapdSignOfSkpd {

	@Id
	@Check(constraints = "id = concat_ws('|', jadwal_id, common_id)")
	@Column(name = "id", nullable = false, updatable = false)
	protected String id;

	@Column(name = "common_id", length = 44, nullable = false, updatable = false)
	protected String commonId;

	@Column(name = "team_id", length = 18, nullable = false, updatable = false)
	protected String teamId;

	@Column(name = "sign_id", length = 21, nullable = false, updatable = false)
	protected String signId;

	@Check(constraints = "skpd_id like '%0000'")
	@Column(name = "skpd_id", length = 22, nullable = false, updatable = false)
	protected String skpdId;

}
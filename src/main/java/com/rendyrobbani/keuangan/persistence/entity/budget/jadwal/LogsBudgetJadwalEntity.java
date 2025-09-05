package com.rendyrobbani.keuangan.persistence.entity.budget.jadwal;

import com.rendyrobbani.keuangan.core.domain.entity.budget.jadwal.LogsBudgetJadwal;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.experimental.Accessors;

@Data
@Setter(AccessLevel.NONE)
@Accessors(fluent = true)
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = LogsBudgetJadwal.TABLE_NAME)
public class LogsBudgetJadwalEntity extends AbstractLogsBudgetJadwalEntity {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "rkpd_id", referencedColumnName = "id", insertable = false, updatable = false)
	})
	private DataBudgetJadwalEntity rkpd;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "ppas_id", referencedColumnName = "id", insertable = false, updatable = false)
	})
	private DataBudgetJadwalEntity ppas;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "apbd_id", referencedColumnName = "id", insertable = false, updatable = false)
	})
	private DataBudgetJadwalEntity apbd;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false)
	})
	private DataBudgetJadwalEntity subject;

	@Override
	public LogsBudgetJadwal toDomain() {
		return this;
	}

}
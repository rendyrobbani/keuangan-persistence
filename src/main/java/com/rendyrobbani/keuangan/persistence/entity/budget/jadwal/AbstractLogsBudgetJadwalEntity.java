package com.rendyrobbani.keuangan.persistence.entity.budget.jadwal;

import com.rendyrobbani.keuangan.core.domain.entity.budget.jadwal.DataBudgetJadwal;
import com.rendyrobbani.keuangan.core.domain.entity.budget.jadwal.LogsBudgetJadwal;
import com.rendyrobbani.keuangan.core.domain.vo.BudgetTahapan;
import com.rendyrobbani.keuangan.persistence.converter.BudgetTahapanConverter;
import com.rendyrobbani.keuangan.persistence.entity.budget.AbstractLogsBudgetEntity;
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
public abstract class AbstractLogsBudgetJadwalEntity extends AbstractLogsBudgetEntity<LogsBudgetJadwal, DataBudgetJadwal, Long> implements LogsBudgetJadwal {

	@Column(name = "subject_id", updatable = false)
	protected Long subjectId;

	@Column(name = "year", nullable = false, updatable = false)
	protected Short year;

	@Convert(converter = BudgetTahapanConverter.class)
	@Column(name = "tahapan_id", nullable = false, updatable = false)
	protected BudgetTahapan tahapan;

	@Column(name = "rkpd_id", updatable = false)
	protected Long rkpdId;

	@Column(name = "ppas_id", updatable = false)
	protected Long ppasId;

	@Column(name = "apbd_id", updatable = false)
	protected Long apbdId;

	@Column(name = "sipd_id", updatable = false)
	protected Long sipdId;

	@Column(name = "name", nullable = false)
	protected String name;

	@Column(name = "from_time")
	protected LocalDateTime fromTime;

	@Column(name = "into_time")
	protected LocalDateTime intoTime;

	@Column(name = "is_perda", nullable = false)
	protected boolean isPerda;

	@Column(name = "perda_date")
	protected LocalDate perdaDate;

	@Column(name = "perda_number")
	protected String perdaNumber;

	@Column(name = "is_perkada", nullable = false)
	protected boolean isPerkada;

	@Column(name = "perkada_date")
	protected LocalDate perkadaDate;

	@Column(name = "perkada_number")
	protected String perkadaNumber;

	@Column(name = "is_locked", nullable = false)
	protected boolean isLocked;

	@Column(name = "is_deleted", nullable = false)
	protected boolean isDeleted;

	@Override
	public void create(DataBudgetJadwal subject, LocalDateTime createdAt, String createdBy) {
		this.subjectId = subject.id();
		this.year = subject.year();
		this.tahapan = subject.tahapan();
		this.rkpdId = subject.rkpdId();
		this.ppasId = subject.ppasId();
		this.apbdId = subject.apbdId();
		this.sipdId = subject.sipdId();
		this.name = subject.name();
		this.fromTime = subject.fromTime();
		this.intoTime = subject.intoTime();
		this.isPerda = subject.isPerda();
		this.perdaDate = subject.perdaDate();
		this.perdaNumber = subject.perdaNumber();
		this.isPerkada = subject.isPerkada();
		this.perkadaDate = subject.perkadaDate();
		this.perkadaNumber = subject.perkadaNumber();
		this.isLocked = subject.isLocked();
		this.isDeleted = subject.isDeleted();
	}

}
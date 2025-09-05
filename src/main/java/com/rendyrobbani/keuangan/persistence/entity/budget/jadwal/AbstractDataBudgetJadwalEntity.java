package com.rendyrobbani.keuangan.persistence.entity.budget.jadwal;

import com.rendyrobbani.keuangan.core.domain.entity.budget.jadwal.DataBudgetJadwal;
import com.rendyrobbani.keuangan.core.domain.vo.BudgetTahapan;
import com.rendyrobbani.keuangan.persistence.converter.BudgetTahapanConverter;
import com.rendyrobbani.keuangan.persistence.entity.budget.AbstractDataBudgetEntity;
import jakarta.persistence.*;
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
public abstract class AbstractDataBudgetJadwalEntity extends AbstractDataBudgetEntity<DataBudgetJadwal, Long> implements DataBudgetJadwal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, updatable = false)
	protected Long id;

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

	@Column(name = "locked_at")
	protected LocalDateTime lockedAt;

	@Column(name = "locked_by", length = 18)
	protected String lockedBy;

	@Override
	public void create(BudgetTahapan tahapan, DataBudgetJadwal rkpd, DataBudgetJadwal ppas, DataBudgetJadwal apbd, Long sipdId, String name, LocalDateTime fromTime, LocalDateTime intoTime, boolean isPerda, LocalDate perdaDate, String perdaNumber, boolean isPerkada, LocalDate perkadaDate, String perkadaNumber, LocalDateTime createdAt, String createdBy) {
		this.sync(tahapan, rkpd, ppas, apbd, sipdId, name, fromTime, intoTime, isPerda, perdaDate, perdaNumber, isPerkada, perkadaDate, perkadaNumber);
		this.isLocked = false;
		this.isDeleted = false;
		this.create(createdAt, createdBy);
	}

	@Override
	public void update(BudgetTahapan tahapan, DataBudgetJadwal rkpd, DataBudgetJadwal ppas, DataBudgetJadwal apbd, Long sipdId, String name, LocalDateTime fromTime, LocalDateTime intoTime, boolean isPerda, LocalDate perdaDate, String perdaNumber, boolean isPerkada, LocalDate perkadaDate, String perkadaNumber, LocalDateTime updatedAt, String updatedBy) {
		this.sync(tahapan, rkpd, ppas, apbd, sipdId, name, fromTime, intoTime, isPerda, perdaDate, perdaNumber, isPerkada, perkadaDate, perkadaNumber);
		this.update(updatedAt, updatedBy);
	}

	private void sync(BudgetTahapan tahapan, DataBudgetJadwal rkpd, DataBudgetJadwal ppas, DataBudgetJadwal apbd, Long sipdId, String name, LocalDateTime fromTime, LocalDateTime intoTime, boolean isPerda, LocalDate perdaDate, String perdaNumber, boolean isPerkada, LocalDate perkadaDate, String perkadaNumber) {
		this.tahapan = tahapan;
		this.rkpdId = rkpd.id();
		this.ppasId = ppas.id();
		this.apbdId = apbd.id();
		this.sipdId = sipdId;
		this.name = name;
		this.fromTime = fromTime;
		this.intoTime = intoTime;
		this.isPerda = isPerda;
		this.perdaDate = perdaDate;
		this.perdaNumber = perdaNumber;
		this.isPerkada = isPerkada;
		this.perkadaDate = perkadaDate;
		this.perkadaNumber = perkadaNumber;
	}

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
}
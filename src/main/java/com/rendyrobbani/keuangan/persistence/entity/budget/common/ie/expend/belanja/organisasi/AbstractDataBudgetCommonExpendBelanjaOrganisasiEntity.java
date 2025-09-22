package com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.expend.belanja.organisasi;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.expend.belanja.organisasi.DataBudgetCommonExpendBelanjaOrganisasi;
import com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.AbstractDataBudgetCommonOrganisasiEntity;
import com.rendyrobbani.keuangan.persistence.entity.user.DataUserEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.hibernate.annotations.Check;
import org.hibernate.annotations.Checks;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Setter(AccessLevel.NONE)
@Accessors(fluent = true)
@EqualsAndHashCode(callSuper = true)
@MappedSuperclass
@Checks(value = {
		@Check(constraints = "sebelum = belanja_operasi_sebelum + belanja_modal_sebelum + belanja_tidak_terduga_sebelum + belanja_transfer_sebelum"),
		@Check(constraints = "total = belanja_operasi + belanja_modal + belanja_tidak_terduga + belanja_transfer"),
})
public abstract class AbstractDataBudgetCommonExpendBelanjaOrganisasiEntity extends AbstractDataBudgetCommonOrganisasiEntity<DataBudgetCommonExpendBelanjaOrganisasi> implements DataBudgetCommonExpendBelanjaOrganisasi {

	@Column(name = "belanja_operasi_sebelum", nullable = false)
	protected BigDecimal belanjaOperasiSebelum;

	@Column(name = "belanja_modal_sebelum", nullable = false)
	protected BigDecimal belanjaModalSebelum;

	@Column(name = "belanja_tidak_terduga_sebelum", nullable = false)
	protected BigDecimal belanjaTidakTerdugaSebelum;

	@Column(name = "belanja_transfer_sebelum", nullable = false)
	protected BigDecimal belanjaTransferSebelum;

	@Column(name = "belanja_operasi", nullable = false)
	protected BigDecimal belanjaOperasi;

	@Column(name = "belanja_modal", nullable = false)
	protected BigDecimal belanjaModal;

	@Column(name = "belanja_tidak_terduga", nullable = false)
	protected BigDecimal belanjaTidakTerduga;

	@Column(name = "belanja_transfer", nullable = false)
	protected BigDecimal belanjaTransfer;

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

}
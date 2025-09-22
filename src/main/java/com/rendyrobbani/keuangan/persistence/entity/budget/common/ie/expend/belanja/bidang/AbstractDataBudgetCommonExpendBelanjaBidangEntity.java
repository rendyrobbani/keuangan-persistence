package com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.expend.belanja.bidang;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.expend.belanja.bidang.DataBudgetCommonExpendBelanjaBidang;
import com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.AbstractDataBudgetCommonBidangEntity;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.hibernate.annotations.Check;
import org.hibernate.annotations.Checks;

import java.math.BigDecimal;

@Data
@Setter(AccessLevel.NONE)
@Accessors(fluent = true)
@EqualsAndHashCode(callSuper = true)
@MappedSuperclass
@Checks(value = {
		@Check(constraints = "sebelum = belanja_operasi_sebelum + belanja_modal_sebelum + belanja_tidak_terduga_sebelum + belanja_transfer_sebelum"),
		@Check(constraints = "total = belanja_operasi + belanja_modal + belanja_tidak_terduga + belanja_transfer"),
})
public abstract class AbstractDataBudgetCommonExpendBelanjaBidangEntity extends AbstractDataBudgetCommonBidangEntity<DataBudgetCommonExpendBelanjaBidang> implements DataBudgetCommonExpendBelanjaBidang {

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

}
package com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.income.pendapatan.organisasi;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.income.pendapatan.organisasi.DataBudgetCommonIncomePendapatanOrganisasi;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
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
@Table(name = DataBudgetCommonIncomePendapatanOrganisasi.TABLE_NAME)
public class DataBudgetCommonIncomePendapatanOrganisasiEntity extends AbstractDataBudgetCommonIncomePendapatanOrganisasiEntity {

	@Override
	public DataBudgetCommonIncomePendapatanOrganisasiEntity toDomain() {
		return this;
	}

}
package com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.income.pembiayaan.organisasi;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.income.pembiayaan.organisasi.DataBudgetCommonIncomePembiayaanOrganisasi;
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
@Table(name = DataBudgetCommonIncomePembiayaanOrganisasi.TABLE_NAME)
public class DataBudgetCommonIncomePembiayaanOrganisasiEntity extends AbstractDataBudgetCommonIncomePembiayaanOrganisasiEntity {

	@Override
	public DataBudgetCommonIncomePembiayaanOrganisasiEntity toDomain() {
		return this;
	}

}
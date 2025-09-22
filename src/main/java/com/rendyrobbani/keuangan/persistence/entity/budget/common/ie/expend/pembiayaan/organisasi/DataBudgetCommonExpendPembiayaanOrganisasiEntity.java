package com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.expend.pembiayaan.organisasi;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.expend.pembiayaan.organisasi.DataBudgetCommonExpendPembiayaanOrganisasi;
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
@Table(name = DataBudgetCommonExpendPembiayaanOrganisasi.TABLE_NAME)
public class DataBudgetCommonExpendPembiayaanOrganisasiEntity extends AbstractDataBudgetCommonExpendPembiayaanOrganisasiEntity {

	@Override
	public DataBudgetCommonExpendPembiayaanOrganisasiEntity toDomain() {
		return this;
	}

}
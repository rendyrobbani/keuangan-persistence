package com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.expend.belanja.organisasi;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.expend.belanja.organisasi.DataBudgetCommonExpendBelanjaOrganisasi;
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
@Table(name = DataBudgetCommonExpendBelanjaOrganisasi.TABLE_NAME)
public class DataBudgetCommonExpendBelanjaOrganisasiEntity extends AbstractDataBudgetCommonExpendBelanjaOrganisasiEntity {

	@Override
	public DataBudgetCommonExpendBelanjaOrganisasiEntity toDomain() {
		return this;
	}

}
package com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.expend.belanja.jenis;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.expend.belanja.jenis.DataBudgetCommonExpendBelanjaJenis;
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
@Table(name = DataBudgetCommonExpendBelanjaJenis.TABLE_NAME)
public class DataBudgetCommonExpendBelanjaJenisEntity extends AbstractDataBudgetCommonExpendBelanjaJenisEntity {

	@Override
	public DataBudgetCommonExpendBelanjaJenisEntity toDomain() {
		return this;
	}

}
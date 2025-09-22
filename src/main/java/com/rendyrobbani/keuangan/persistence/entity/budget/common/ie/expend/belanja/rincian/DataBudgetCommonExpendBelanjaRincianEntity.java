package com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.expend.belanja.rincian;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.expend.belanja.rincian.DataBudgetCommonExpendBelanjaRincian;
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
@Table(name = DataBudgetCommonExpendBelanjaRincian.TABLE_NAME)
public class DataBudgetCommonExpendBelanjaRincianEntity extends AbstractDataBudgetCommonExpendBelanjaRincianEntity {

	@Override
	public DataBudgetCommonExpendBelanjaRincianEntity toDomain() {
		return this;
	}

}
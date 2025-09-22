package com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.expend.belanja.rekening;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.DataBudgetCommonRekeningEntity;
import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.expend.belanja.rekening.DataBudgetCommonExpendBelanjaRekening;
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
@Table(name = DataBudgetCommonExpendBelanjaRekening.TABLE_NAME)
public class DataBudgetCommonExpendBelanjaRekeningEntity extends AbstractDataBudgetCommonExpendBelanjaRekeningEntity {

	@Override
	public DataBudgetCommonExpendBelanjaRekeningEntity toDomain() {
		return this;
	}

}
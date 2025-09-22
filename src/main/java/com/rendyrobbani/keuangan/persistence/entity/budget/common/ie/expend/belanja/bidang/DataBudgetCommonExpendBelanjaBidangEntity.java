package com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.expend.belanja.bidang;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.DataBudgetCommonBidangEntity;
import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.expend.belanja.bidang.DataBudgetCommonExpendBelanjaBidang;
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
@Table(name = DataBudgetCommonExpendBelanjaBidang.TABLE_NAME)
public class DataBudgetCommonExpendBelanjaBidangEntity extends AbstractDataBudgetCommonExpendBelanjaBidangEntity {

	@Override
	public DataBudgetCommonExpendBelanjaBidangEntity toDomain() {
		return this;
	}

}
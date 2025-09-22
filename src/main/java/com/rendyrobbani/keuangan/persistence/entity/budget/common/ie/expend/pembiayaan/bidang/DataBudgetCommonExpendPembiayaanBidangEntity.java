package com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.expend.pembiayaan.bidang;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.DataBudgetCommonBidangEntity;
import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.expend.pembiayaan.bidang.DataBudgetCommonExpendPembiayaanBidang;
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
@Table(name = DataBudgetCommonExpendPembiayaanBidang.TABLE_NAME)
public class DataBudgetCommonExpendPembiayaanBidangEntity extends AbstractDataBudgetCommonExpendPembiayaanBidangEntity {

	@Override
	public DataBudgetCommonExpendPembiayaanBidangEntity toDomain() {
		return this;
	}

}
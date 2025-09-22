package com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.expend.pembiayaan.rincian;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.expend.pembiayaan.rincian.DataBudgetCommonExpendPembiayaanRincian;
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
@Table(name = DataBudgetCommonExpendPembiayaanRincian.TABLE_NAME)
public class DataBudgetCommonExpendPembiayaanRincianEntity extends AbstractDataBudgetCommonExpendPembiayaanRincianEntity {

	@Override
	public DataBudgetCommonExpendPembiayaanRincianEntity toDomain() {
		return this;
	}

}
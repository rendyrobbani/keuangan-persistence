package com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.expend.pembiayaan.jenis;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.DataBudgetCommonJenisEntity;
import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.expend.pembiayaan.jenis.DataBudgetCommonExpendPembiayaanJenis;
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
@Table(name = DataBudgetCommonExpendPembiayaanJenis.TABLE_NAME)
public class DataBudgetCommonExpendPembiayaanJenisEntity extends AbstractDataBudgetCommonExpendPembiayaanJenisEntity {

	@Override
	public DataBudgetCommonExpendPembiayaanJenisEntity toDomain() {
		return this;
	}

}
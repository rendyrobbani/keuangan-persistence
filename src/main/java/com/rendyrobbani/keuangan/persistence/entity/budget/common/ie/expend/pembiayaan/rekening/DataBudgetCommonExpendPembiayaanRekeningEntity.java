package com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.expend.pembiayaan.rekening;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.DataBudgetCommonRekeningEntity;
import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.expend.pembiayaan.rekening.DataBudgetCommonExpendPembiayaanRekening;
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
@Table(name = DataBudgetCommonExpendPembiayaanRekening.TABLE_NAME)
public class DataBudgetCommonExpendPembiayaanRekeningEntity extends AbstractDataBudgetCommonExpendPembiayaanRekeningEntity {

	@Override
	public DataBudgetCommonExpendPembiayaanRekeningEntity toDomain() {
		return this;
	}

}
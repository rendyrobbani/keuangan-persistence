package com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.expend.belanja.program;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.DataBudgetCommonProgramEntity;
import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.expend.belanja.program.DataBudgetCommonExpendBelanjaProgram;
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
@Table(name = DataBudgetCommonExpendBelanjaProgram.TABLE_NAME)
public class DataBudgetCommonExpendBelanjaProgramEntity extends AbstractDataBudgetCommonExpendBelanjaProgramEntity {

	@Override
	public DataBudgetCommonExpendBelanjaProgramEntity toDomain() {
		return this;
	}

}
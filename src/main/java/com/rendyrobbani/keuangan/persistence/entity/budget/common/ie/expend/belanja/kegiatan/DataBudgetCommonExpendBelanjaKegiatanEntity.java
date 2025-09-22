package com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.expend.belanja.kegiatan;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.DataBudgetCommonKegiatanEntity;
import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.expend.belanja.kegiatan.DataBudgetCommonExpendBelanjaKegiatan;
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
@Table(name = DataBudgetCommonExpendBelanjaKegiatan.TABLE_NAME)
public class DataBudgetCommonExpendBelanjaKegiatanEntity extends AbstractDataBudgetCommonExpendBelanjaKegiatanEntity {

	@Override
	public DataBudgetCommonExpendBelanjaKegiatanEntity toDomain() {
		return this;
	}

}
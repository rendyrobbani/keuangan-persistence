package com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.expend.belanja.subkegiatan;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.expend.belanja.subkegiatan.SipdBudgetCommonExpendBelanjaSubkegiatan;
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
@Table(name = SipdBudgetCommonExpendBelanjaSubkegiatan.TABLE_NAME)
public class SipdBudgetCommonExpendBelanjaSubkegiatanEntity extends AbstractSipdBudgetCommonExpendBelanjaSubkegiatanEntity {

	@Override
	public SipdBudgetCommonExpendBelanjaSubkegiatan toDomain() {
		return this;
	}

}
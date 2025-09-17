package com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.income.pendapatan.bidang;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.income.pendapatan.bidang.DataBudgetCommonIncomePendapatanBidang;
import com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.AbstractDataBudgetCommonBidangEntity;
import jakarta.persistence.MappedSuperclass;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.experimental.Accessors;

@Data
@Setter(AccessLevel.NONE)
@Accessors(fluent = true)
@EqualsAndHashCode(callSuper = true)
@MappedSuperclass
public abstract class AbstractDataBudgetCommonIncomePendapatanBidangEntity extends AbstractDataBudgetCommonBidangEntity implements DataBudgetCommonIncomePendapatanBidang {

}
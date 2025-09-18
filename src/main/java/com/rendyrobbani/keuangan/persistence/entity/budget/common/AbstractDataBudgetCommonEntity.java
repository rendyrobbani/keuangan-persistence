package com.rendyrobbani.keuangan.persistence.entity.budget.common;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.DataBudgetCommonEntity;
import com.rendyrobbani.keuangan.persistence.entity.budget.AbstractDataBudgetEntity;
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
public abstract class AbstractDataBudgetCommonEntity<DOMAIN extends DataBudgetCommonEntity<ID>, ID> extends AbstractDataBudgetEntity<DOMAIN, ID> implements DataBudgetCommonEntity<ID> {

}
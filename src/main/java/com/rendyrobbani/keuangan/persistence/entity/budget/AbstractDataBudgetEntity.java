package com.rendyrobbani.keuangan.persistence.entity.budget;

import com.rendyrobbani.keuangan.core.domain.entity.budget.DataBudgetEntity;
import com.rendyrobbani.keuangan.persistence.entity.AbstractDataEntity;
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
public abstract class AbstractDataBudgetEntity<DOMAIN extends DataBudgetEntity<ID>, ID> extends AbstractDataEntity<DOMAIN, ID> implements DataBudgetEntity<ID> {

}
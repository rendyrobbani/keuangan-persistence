package com.rendyrobbani.keuangan.persistence.entity.budget.common;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.DataBudgetCommonEntity;
import com.rendyrobbani.keuangan.core.domain.entity.budget.common.SipdBudgetCommonEntity;
import com.rendyrobbani.keuangan.persistence.entity.budget.AbstractSipdBudgetEntity;
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
public abstract class AbstractSipdBudgetCommonEntity<DOMAIN extends SipdBudgetCommonEntity<SUBJECT, SUBJECTID, ID>, SUBJECT extends DataBudgetCommonEntity<SUBJECTID>, SUBJECTID, ID> extends AbstractSipdBudgetEntity<DOMAIN, SUBJECT, SUBJECTID, ID> implements SipdBudgetCommonEntity<SUBJECT, SUBJECTID, ID> {

}
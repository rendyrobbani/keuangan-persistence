package com.rendyrobbani.keuangan.persistence.entity.budget;

import com.rendyrobbani.keuangan.core.domain.entity.budget.DataBudgetEntity;
import com.rendyrobbani.keuangan.core.domain.entity.budget.SipdBudgetEntity;
import com.rendyrobbani.keuangan.persistence.entity.AbstractSipdEntity;
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
public abstract class AbstractSipdBudgetEntity<DOMAIN extends SipdBudgetEntity<SUBJECT, SUBJECTID, ID>, SUBJECT extends DataBudgetEntity<SUBJECTID>, SUBJECTID, ID> extends AbstractSipdEntity<DOMAIN, SUBJECT, SUBJECTID, ID> implements SipdBudgetEntity<SUBJECT, SUBJECTID, ID> {

}
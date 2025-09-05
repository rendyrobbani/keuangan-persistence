package com.rendyrobbani.keuangan.persistence.entity.budget;

import com.rendyrobbani.keuangan.core.domain.entity.budget.DataBudgetEntity;
import com.rendyrobbani.keuangan.core.domain.entity.budget.LogsBudgetEntity;
import com.rendyrobbani.keuangan.persistence.entity.AbstractLogsEntity;
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
public abstract class AbstractLogsBudgetEntity<DOMAIN extends LogsBudgetEntity<SUBJECT, SUBJECTID>, SUBJECT extends DataBudgetEntity<SUBJECTID>, SUBJECTID> extends AbstractLogsEntity<DOMAIN, SUBJECT, SUBJECTID> implements LogsBudgetEntity<SUBJECT, SUBJECTID> {

	@Override
	public abstract SUBJECTID subjectId();

}
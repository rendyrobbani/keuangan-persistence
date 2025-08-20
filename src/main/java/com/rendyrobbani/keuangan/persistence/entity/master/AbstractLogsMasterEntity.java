package com.rendyrobbani.keuangan.persistence.entity.master;

import com.rendyrobbani.keuangan.core.domain.entity.master.DataMasterEntity;
import com.rendyrobbani.keuangan.core.domain.entity.master.LogsMasterEntity;
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
public abstract class AbstractLogsMasterEntity<DOMAIN extends LogsMasterEntity<SUBJECT, SUBJECTID>, SUBJECT extends DataMasterEntity<SUBJECTID>, SUBJECTID> extends AbstractLogsEntity<DOMAIN, SUBJECT, SUBJECTID> implements LogsMasterEntity<SUBJECT, SUBJECTID> {

	@Override
	public abstract SUBJECTID subjectId();

}
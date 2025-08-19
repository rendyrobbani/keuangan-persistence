package com.rendyrobbani.keuangan.persistence.entity.master.classification;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.DataMasterClassificationEntity;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.LogsMasterClassificationEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.AbstractLogsMasterEntity;
import jakarta.persistence.Column;
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
public abstract class AbstractLogsMasterClassifcationEntity<DOMAIN extends LogsMasterClassificationEntity<SUBJECT>, SUBJECT extends DataMasterClassificationEntity> extends AbstractLogsMasterEntity<DOMAIN, SUBJECT, String> implements LogsMasterClassificationEntity<SUBJECT> {

	@Column(name = "is_locked", nullable = false)
	protected boolean isLocked;

	@Column(name = "is_deleted", nullable = false)
	protected boolean isDeleted;

}
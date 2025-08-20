package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.rekening1;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening1.DataMasterRekening1;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening1.SipdMasterRekening1;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.AbstractSipdMasterClassificationEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.hibernate.annotations.Check;

import java.time.LocalDateTime;

@Data
@Setter(AccessLevel.NONE)
@Accessors(fluent = true)
@EqualsAndHashCode(callSuper = true)
@MappedSuperclass
public abstract class AbstractSipdMasterRekening1Entity<DOMAIN extends SipdMasterRekening1<SUBJECT>, SUBJECT extends DataMasterRekening1> extends AbstractSipdMasterClassificationEntity<DOMAIN, SUBJECT> implements SipdMasterRekening1<SUBJECT> {

	@Id
	@Column(name = "id", nullable = false, updatable = false)
	protected Long id;

	@Column(name = "code", length = 1, nullable = false)
	protected String code;

	@Column(name = "name", nullable = false)
	protected String name;

	@Check(constraints = "subject_id = code")
	@Column(name = "subject_id", length = 1, nullable = false)
	protected String subjectId;

	@Override
	public void create(Long id, String code, String name, String subjectId, boolean isLocked, LocalDateTime createdAt, String createdBy) {
		this.id = id;
		this.code = code;
		this.name = name;
		this.subjectId = subjectId;
		this.isLocked = isLocked;
		this.isDeleted = false;
		this.create(createdAt, createdBy);
	}

	@Override
	public void update(String code, String name, String subjectId, boolean isLocked, LocalDateTime updatedAt, String updatedBy) {
		this.code = code;
		this.name = name;
		this.subjectId = subjectId;
		this.isLocked = isLocked;
		this.update(updatedAt, updatedBy);
	}

}
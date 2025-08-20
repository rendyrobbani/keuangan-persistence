package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.base.rekening2;

import com.rendyrobbani.keuangan.core.common.classification.rekening.RekeningClassification;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening2.DataMasterRekening2;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.AbstractDataMasterClassificationEntity;
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
public abstract class AbstractDataMasterRekening2Entity<DOMAIN extends DataMasterRekening2> extends AbstractDataMasterClassificationEntity<DOMAIN> implements DataMasterRekening2 {

	@Id
	@Check(constraints = "id = code")
	@Column(name = "id", length = 3, nullable = false)
	protected String id;

	@Column(name = "code", length = 3, nullable = false)
	protected String code;

	@Column(name = "name", nullable = false)
	protected String name;

	@Check(constraints = "rekening1_id = left(id, length(rekening1_id))")
	@Column(name = "rekening1_id", length = 1, nullable = false)
	protected String rekening1Id;

	public void create(RekeningClassification classification, String name, LocalDateTime createdAt, String createdBy) {
		if (classification.level() != 2) throw new RuntimeException("Invalid classification");

		this.id = classification.rekening2Code();
		this.code = classification.rekening2Code();

		this.name = name;
		this.isLocked = false;
		this.isDeleted = false;
		this.create(createdAt, createdBy);
	}

	public void update(String name, LocalDateTime updatedAt, String updatedBy) {
		this.name = name;
		this.update(updatedAt, updatedBy);
	}

}
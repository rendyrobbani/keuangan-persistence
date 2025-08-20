package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.base.rekening4;

import com.rendyrobbani.keuangan.core.common.classification.rekening.RekeningClassification;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening4.DataMasterRekening4;
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
public abstract class AbstractDataMasterRekening4Entity<DOMAIN extends DataMasterRekening4> extends AbstractDataMasterClassificationEntity<DOMAIN> implements DataMasterRekening4 {

	@Id
	@Check(constraints = "id = code")
	@Column(name = "id", length = 9, nullable = false)
	protected String id;

	@Column(name = "code", length = 9, nullable = false)
	protected String code;

	@Column(name = "name", nullable = false)
	protected String name;

	@Column(name = "rekening1_id", length = 1, nullable = false)
	protected String rekening1Id;

	@Column(name = "rekening2_id", length = 3, nullable = false)
	protected String rekening2Id;

	@Column(name = "rekening3_id", length = 6, nullable = false)
	protected String rekening3Id;

	public void create(RekeningClassification classification, String name, LocalDateTime createdAt, String createdBy) {
		if (classification.level() != 4) throw new RuntimeException("Invalid classification");

		this.id = classification.rekening4Code();
		this.code = classification.rekening4Code();

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
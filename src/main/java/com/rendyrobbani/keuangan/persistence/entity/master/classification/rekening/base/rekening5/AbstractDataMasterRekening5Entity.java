package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.base.rekening5;

import com.rendyrobbani.keuangan.core.common.classification.rekening.RekeningClassification;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening5.DataMasterRekening5;
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
public abstract class AbstractDataMasterRekening5Entity<DOMAIN extends DataMasterRekening5> extends AbstractDataMasterClassificationEntity<DOMAIN> implements DataMasterRekening5 {

	@Id
	@Check(constraints = "id = code")
	@Column(name = "id", length = 12, nullable = false)
	protected String id;

	@Column(name = "code", length = 12, nullable = false)
	protected String code;

	@Column(name = "name", length = 510, nullable = false)
	protected String name;

	@Check(constraints = "rekening1_id = left(id, length(rekening1_id))")
	@Column(name = "rekening1_id", length = 1, nullable = false)
	protected String rekening1Id;

	@Check(constraints = "rekening2_id = left(id, length(rekening2_id))")
	@Column(name = "rekening2_id", length = 3, nullable = false)
	protected String rekening2Id;

	@Check(constraints = "rekening3_id = left(id, length(rekening3_id))")
	@Column(name = "rekening3_id", length = 6, nullable = false)
	protected String rekening3Id;

	@Check(constraints = "rekening4_id = left(id, length(rekening4_id))")
	@Column(name = "rekening4_id", length = 9, nullable = false)
	protected String rekening4Id;

	public void create(RekeningClassification classification, String name, LocalDateTime createdAt, String createdBy) {
		if (classification.level() != 5) throw new RuntimeException("Invalid classification");

		this.id = classification.rekening5Code();
		this.code = classification.rekening5Code();

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
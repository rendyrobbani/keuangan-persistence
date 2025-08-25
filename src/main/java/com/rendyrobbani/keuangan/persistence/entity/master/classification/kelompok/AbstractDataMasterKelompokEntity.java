package com.rendyrobbani.keuangan.persistence.entity.master.classification.kelompok;

import com.rendyrobbani.keuangan.core.common.classification.kelompok.KelompokClassification;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kelompok.DataMasterKelompok;
import com.rendyrobbani.keuangan.core.domain.vo.KomponenType;
import com.rendyrobbani.keuangan.persistence.converter.KomponenTypeConverter;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.AbstractDataMasterClassificationEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
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
public abstract class AbstractDataMasterKelompokEntity extends AbstractDataMasterClassificationEntity<DataMasterKelompok> implements DataMasterKelompok {

	@Id
	@Check(constraints = "id = code")
	@Column(name = "id", length = 17, nullable = false, updatable = false)
	protected String id;

	@Check(constraints = "code = coalesce(kelompok6_id, kelompok5_id, kelompok4_id, kelompok3_id, kelompok2_id, kelompok1_id)")
	@Column(name = "code", length = 17, nullable = false, updatable = false)
	protected String code;

	@Column(name = "name", length = 510, nullable = false)
	protected String name;

	@Convert(converter = KomponenTypeConverter.class)
	@Column(name = "type")
	protected KomponenType type;

	@Check(constraints = "level = (case when kelompok6_id is not null then 6 when kelompok5_id is not null then 5 when kelompok4_id is not null then 4 when kelompok3_id is not null then 3 when kelompok2_id is not null then 2 when kelompok1_id is not null then 1 end)")
	@Column(name = "level", nullable = false)
	private Byte level;

	@Check(constraints = "kelompok1_id = left(id, length(kelompok1_id))")
	@Column(name = "kelompok1_id", length = 1, updatable = false)
	protected String kelompok1Id;

	@Check(constraints = "kelompok2_id = left(id, length(kelompok2_id))")
	@Column(name = "kelompok2_id", length = 3, updatable = false)
	protected String kelompok2Id;

	@Check(constraints = "kelompok3_id = left(id, length(kelompok3_id))")
	@Column(name = "kelompok3_id", length = 6, updatable = false)
	protected String kelompok3Id;

	@Check(constraints = "kelompok4_id = left(id, length(kelompok4_id))")
	@Column(name = "kelompok4_id", length = 9, updatable = false)
	protected String kelompok4Id;

	@Check(constraints = "kelompok5_id = left(id, length(kelompok5_id))")
	@Column(name = "kelompok5_id", length = 12, updatable = false)
	protected String kelompok5Id;

	@Check(constraints = "kelompok6_id = left(id, length(kelompok6_id))")
	@Column(name = "kelompok6_id", length = 17, updatable = false)
	protected String kelompok6Id;

	@Override
	public void create(KelompokClassification classification, String name, KomponenType type, boolean isEnabled, LocalDateTime createdAt, String createdBy) {
		this.kelompok1Id = classification.kelompok1Code();
		this.kelompok2Id = classification.kelompok2Code();
		this.kelompok3Id = classification.kelompok3Code();
		this.kelompok4Id = classification.kelompok4Code();
		this.kelompok5Id = classification.kelompok5Code();
		this.kelompok6Id = classification.kelompok6Code();
		this.level = classification.level();

		switch (classification.level()) {
			case 1 -> this.id = classification.kelompok1Code();
			case 2 -> this.id = classification.kelompok2Code();
			case 3 -> this.id = classification.kelompok3Code();
			case 4 -> this.id = classification.kelompok4Code();
			case 5 -> this.id = classification.kelompok5Code();
			case 6 -> this.id = classification.kelompok6Code();
		}

		this.code = this.id;
		this.name = name;
		this.type = type;
		this.create(createdAt, createdBy);
	}

	@Override
	public void update(String name, KomponenType type, boolean isEnabled, LocalDateTime updatedAt, String updatedBy) {
		this.name = name;
		this.type = type;
		this.create(createdAt, createdBy);
	}

}
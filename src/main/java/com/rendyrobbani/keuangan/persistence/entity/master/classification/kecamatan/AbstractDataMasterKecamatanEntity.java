package com.rendyrobbani.keuangan.persistence.entity.master.classification.kecamatan;

import com.rendyrobbani.keuangan.core.common.classification.lokasi.KecamatanClassification;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kecamatan.DataMasterKecamatan;
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
public abstract class AbstractDataMasterKecamatanEntity extends AbstractDataMasterClassificationEntity<DataMasterKecamatan> implements DataMasterKecamatan {

	@Id
	@Check(constraints = "id = code")
	@Column(name = "id", length = 8, nullable = false)
	protected String id;

	@Column(name = "code", length = 8, nullable = false)
	protected String code;

	@Column(name = "name", nullable = false)
	protected String name;

	@Check(constraints = "provinsi_id = left(id, length(provinsi_id))")
	@Column(name = "provinsi_id", length = 2, nullable = false)
	protected String provinsiId;

	@Check(constraints = "kabupaten_id = left(id, length(kabupaten_id))")
	@Column(name = "kabupaten_id", length = 5, nullable = false)
	protected String kabupatenId;

	@Override
	public void create(KecamatanClassification classification, String name, LocalDateTime createdAt, String createdBy) {
		this.id = classification.kecamatanCode();
		this.code = classification.kecamatanCode();
		this.name = name;
		this.provinsiId = classification.provinsiCode();
		this.kabupatenId = classification.kabupatenCode();
		this.create(createdAt, createdBy);
	}

	@Override
	public void update(String name, LocalDateTime updatedAt, String updatedBy) {
		this.name = name;
		this.create(createdAt, createdBy);
	}

}
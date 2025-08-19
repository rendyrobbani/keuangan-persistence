package com.rendyrobbani.keuangan.persistence.entity.master.classification.kelurahan;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kelurahan.DataMasterKelurahan;
import com.rendyrobbani.keuangan.core.domain.vo.classification.lokasi.KelurahanClassification;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.AbstractDataMasterClassifcationEntity;
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
public abstract class AbstractDataMasterKelurahanEntity extends AbstractDataMasterClassifcationEntity<DataMasterKelurahan> implements DataMasterKelurahan {

	@Id
	@Check(constraints = "id = code")
	@Column(name = "id", length = 13, nullable = false)
	protected String id;

	@Column(name = "code", length = 13, nullable = false)
	protected String code;

	@Column(name = "name", nullable = false)
	protected String name;

	@Column(name = "provinsi_id", length = 2, nullable = false)
	protected String provinsiId;

	@Column(name = "kabupaten_id", length = 5, nullable = false)
	protected String kabupatenId;

	@Column(name = "kecamatan_id", length = 8, nullable = false)
	protected String kecamatanId;

	@Override
	public void create(KelurahanClassification classification, String name, LocalDateTime createdAt, String createdBy) {
		this.id = classification.kelurahanCode();
		this.code = classification.kelurahanCode();
		this.name = name;
		this.provinsiId = classification.provinsiCode();
		this.kabupatenId = classification.kabupatenCode();
		this.kecamatanId = classification.kecamatanCode();
		this.create(createdAt, createdBy);
	}

	@Override
	public void update(String name, LocalDateTime updatedAt, String updatedBy) {
		this.name = name;
		this.create(createdAt, createdBy);
	}

}
package com.rendyrobbani.keuangan.persistence.entity.master.classification.subkegiatan;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.subkegiatan.DataMasterSubkegiatan;
import com.rendyrobbani.keuangan.core.domain.vo.classification.kegiatan.SubkegiatanClassification;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.AbstractDataMasterClassifcationEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Data
@Setter(AccessLevel.NONE)
@Accessors(fluent = true)
@EqualsAndHashCode(callSuper = true)
@MappedSuperclass
public abstract class AbstractDataMasterSubkegiatanEntity extends AbstractDataMasterClassifcationEntity<DataMasterSubkegiatan> implements DataMasterSubkegiatan {

	@Id
	@Column(name = "id", length = 15, nullable = false)
	protected String id;

	@Column(name = "code", length = 15, nullable = false)
	protected String code;

	@Column(name = "name", nullable = false)
	protected String name;

	@Column(name = "urusan_id", length = 1, nullable = false)
	protected String urusanId;

	@Column(name = "bidang_id", length = 4, nullable = false)
	protected String bidangId;

	@Column(name = "program_id", length = 7, nullable = false)
	protected String programId;

	@Column(name = "kegiatan_id", length = 12, nullable = false)
	protected String kegiatanId;

	@Column(name = "fungsi_id", length = 2, nullable = false)
	protected String fungsiId;

	@Column(name = "subfungsi_id", length = 5, nullable = false)
	protected String subfungsiId;

	@Override
	public void create(SubkegiatanClassification classification, String name, LocalDateTime createdAt, String createdBy) {
		this.id = classification.subkegiatanCode().replaceAll("X", "0");
		this.code = classification.subkegiatanCode();
		this.name = name;
		this.urusanId = classification.urusanCode().replaceAll("X", "0");
		this.bidangId = classification.bidangCode().replaceAll("X", "0");
		this.programId = classification.programCode().replaceAll("X", "0");
		this.kegiatanId = classification.kegiatanCode().replaceAll("X", "0");
		this.fungsiId = classification.fungsiCode();
		this.subfungsiId = classification.subfungsiCode();
		this.create(createdAt, createdBy);
	}

	@Override
	public void update(String name, LocalDateTime updatedAt, String updatedBy) {
		this.name = name;
		this.create(createdAt, createdBy);
	}

}
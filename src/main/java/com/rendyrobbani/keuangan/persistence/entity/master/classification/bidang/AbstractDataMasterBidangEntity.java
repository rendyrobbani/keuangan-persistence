package com.rendyrobbani.keuangan.persistence.entity.master.classification.bidang;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.bidang.DataMasterBidang;
import com.rendyrobbani.keuangan.core.domain.vo.classification.urusan.BidangClassification;
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
public abstract class AbstractDataMasterBidangEntity extends AbstractDataMasterClassifcationEntity<DataMasterBidang> implements DataMasterBidang {

	@Id
	@Column(name = "id", length = 4, nullable = false)
	protected String id;

	@Column(name = "code", length = 4, nullable = false)
	protected String code;

	@Column(name = "name", nullable = false)
	protected String name;

	@Column(name = "urusan_id", length = 1, nullable = false)
	protected String urusanId;

	@Override
	public void create(BidangClassification classification, String name, LocalDateTime createdAt, String createdBy) {
		this.id = classification.bidangCode().replaceAll("X", "0");
		this.code = classification.bidangCode();
		this.name = name;
		this.urusanId = classification.urusanCode().replaceAll("X", "0");
		this.create(createdAt, createdBy);
	}

	@Override
	public void update(String name, LocalDateTime updatedAt, String updatedBy) {
		this.name = name;
		this.create(createdAt, createdBy);
	}

}
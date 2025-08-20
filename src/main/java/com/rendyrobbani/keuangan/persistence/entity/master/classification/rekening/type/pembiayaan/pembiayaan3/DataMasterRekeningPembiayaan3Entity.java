package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pembiayaan.pembiayaan3;

import com.rendyrobbani.keuangan.core.common.classification.rekening.RekeningClassification;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pembiayaan.pembiayaan3.DataMasterRekeningPembiayaan3;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.base.rekening3.AbstractDataMasterRekening3Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pembiayaan.pembiayaan1.DataMasterRekeningPembiayaan1Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pembiayaan.pembiayaan2.DataMasterRekeningPembiayaan2Entity;
import jakarta.persistence.*;
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
@Entity
@Table(name = DataMasterRekeningPembiayaan3.TABLE_NAME, uniqueConstraints = {@UniqueConstraint(columnNames = {"rekening1_id", "rekening2_id", "id"})})
public class DataMasterRekeningPembiayaan3Entity extends AbstractDataMasterRekening3Entity<DataMasterRekeningPembiayaan3> implements DataMasterRekeningPembiayaan3 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "rekening1_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningPembiayaan1Entity rekening1;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "rekening1_id", referencedColumnName = "rekening1_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening2_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningPembiayaan2Entity rekening2;

	@Override
	public DataMasterRekeningPembiayaan3 toDomain() {
		return this;
	}

	@Override
	public void create(RekeningClassification classification, String name, LocalDateTime createdAt, String createdBy) {
		if (!classification.isPembiayaan()) throw new RuntimeException("Invalid classification");
		super.create(classification, name, createdAt, createdBy);
	}

}
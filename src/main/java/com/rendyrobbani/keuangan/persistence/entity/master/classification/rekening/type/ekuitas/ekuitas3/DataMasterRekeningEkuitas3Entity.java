package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas3;

import com.rendyrobbani.keuangan.core.common.classification.rekening.RekeningClassification;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.ekuitas.ekuitas3.DataMasterRekeningEkuitas3;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.base.rekening3.AbstractDataMasterRekening3Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas1.DataMasterRekeningEkuitas1Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas2.DataMasterRekeningEkuitas2Entity;
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
@Table(name = DataMasterRekeningEkuitas3.TABLE_NAME, uniqueConstraints = {@UniqueConstraint(columnNames = {"rekening1_id", "rekening2_id", "id"})})
public class DataMasterRekeningEkuitas3Entity extends AbstractDataMasterRekening3Entity<DataMasterRekeningEkuitas3> implements DataMasterRekeningEkuitas3 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "rekening1_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningEkuitas1Entity rekening1;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "rekening1_id", referencedColumnName = "rekening1_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening2_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningEkuitas2Entity rekening2;

	@Override
	public DataMasterRekeningEkuitas3 toDomain() {
		return this;
	}

	@Override
	public void create(RekeningClassification classification, String name, LocalDateTime createdAt, String createdBy) {
		if (!classification.isEkuitas()) throw new RuntimeException("Invalid classification");
		super.create(classification, name, createdAt, createdBy);
	}

}
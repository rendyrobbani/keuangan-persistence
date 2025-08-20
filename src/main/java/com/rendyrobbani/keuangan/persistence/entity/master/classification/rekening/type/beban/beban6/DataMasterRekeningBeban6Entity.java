package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban6;

import com.rendyrobbani.keuangan.core.common.classification.rekening.RekeningClassification;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban6.DataMasterRekeningBeban6;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.base.rekening6.AbstractDataMasterRekening6Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban1.DataMasterRekeningBeban1Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban2.DataMasterRekeningBeban2Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban3.DataMasterRekeningBeban3Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban4.DataMasterRekeningBeban4Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban5.DataMasterRekeningBeban5Entity;
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
@Table(name = DataMasterRekeningBeban6.TABLE_NAME, uniqueConstraints = {@UniqueConstraint(columnNames = {"rekening1_id", "rekening2_id", "rekening3_id", "rekening4_id", "rekening5_id", "id"})})
public class DataMasterRekeningBeban6Entity extends AbstractDataMasterRekening6Entity<DataMasterRekeningBeban6> implements DataMasterRekeningBeban6 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "rekening1_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningBeban1Entity rekening1;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "rekening1_id", referencedColumnName = "rekening1_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening2_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningBeban2Entity rekening2;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "rekening1_id", referencedColumnName = "rekening1_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening2_id", referencedColumnName = "rekening2_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening3_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningBeban3Entity rekening3;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "rekening1_id", referencedColumnName = "rekening1_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening2_id", referencedColumnName = "rekening2_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening3_id", referencedColumnName = "rekening3_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening4_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningBeban4Entity rekening4;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "rekening1_id", referencedColumnName = "rekening1_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening2_id", referencedColumnName = "rekening2_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening3_id", referencedColumnName = "rekening3_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening4_id", referencedColumnName = "rekening4_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening5_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningBeban5Entity rekening5;

	@Override
	public DataMasterRekeningBeban6 toDomain() {
		return this;
	}

	@Override
	public void create(RekeningClassification classification, String name, LocalDateTime createdAt, String createdBy) {
		if (!classification.isBeban()) throw new RuntimeException("Invalid classification");
		super.create(classification, name, createdAt, createdBy);
	}

}
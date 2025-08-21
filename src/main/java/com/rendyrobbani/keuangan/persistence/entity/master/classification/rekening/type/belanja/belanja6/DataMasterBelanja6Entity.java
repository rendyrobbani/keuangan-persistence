package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja6;

import com.rendyrobbani.keuangan.core.common.classification.rekening.RekeningClassification;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja6.DataMasterBelanja6;
import com.rendyrobbani.keuangan.core.domain.vo.BelanjaJenis;
import com.rendyrobbani.keuangan.core.domain.vo.BelanjaLokus;
import com.rendyrobbani.keuangan.persistence.converter.BelanjaJenisConverter;
import com.rendyrobbani.keuangan.persistence.converter.BelanjaLokusConverter;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.base.rekening6.AbstractDataMasterRekening6Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja1.DataMasterBelanja1Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja2.DataMasterBelanja2Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja3.DataMasterBelanja3Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja4.DataMasterBelanja4Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja5.DataMasterBelanja5Entity;
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
@Table(name = DataMasterBelanja6.TABLE_NAME, uniqueConstraints = {@UniqueConstraint(columnNames = {"rekening1_id", "rekening2_id", "rekening3_id", "rekening4_id", "rekening5_id", "id"})})
public class DataMasterBelanja6Entity extends AbstractDataMasterRekening6Entity<DataMasterBelanja6> implements DataMasterBelanja6 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "rekening1_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterBelanja1Entity rekening1;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "rekening1_id", referencedColumnName = "rekening1_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening2_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterBelanja2Entity rekening2;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "rekening1_id", referencedColumnName = "rekening1_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening2_id", referencedColumnName = "rekening2_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening3_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterBelanja3Entity rekening3;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "rekening1_id", referencedColumnName = "rekening1_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening2_id", referencedColumnName = "rekening2_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening3_id", referencedColumnName = "rekening3_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening4_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterBelanja4Entity rekening4;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "rekening1_id", referencedColumnName = "rekening1_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening2_id", referencedColumnName = "rekening2_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening3_id", referencedColumnName = "rekening3_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening4_id", referencedColumnName = "rekening4_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening5_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterBelanja5Entity rekening5;

	@Column(name = "is_enabled", nullable = false)
	private boolean isEnabled;

	@Convert(converter = BelanjaJenisConverter.class)
	@Column(name = "jenis", length = 50)
	private BelanjaJenis jenis;

	@Convert(converter = BelanjaLokusConverter.class)
	@Column(name = "lokus", length = 50)
	private BelanjaLokus lokus;

	@Override
	public DataMasterBelanja6 toDomain() {
		return this;
	}

	@Override
	public void create(RekeningClassification classification, String name, boolean isEnabled, BelanjaJenis jenis, BelanjaLokus lokus, LocalDateTime createdAt, String createdBy) {
		if (!classification.isBelanja()) throw new RuntimeException("Invalid classification");
		this.isEnabled = isEnabled;
		this.jenis = jenis;
		this.lokus = lokus;
		super.create(classification, name, createdAt, createdBy);
	}

	@Override
	public void update(String name, boolean isEnabled, BelanjaJenis jenis, BelanjaLokus lokus, LocalDateTime createdAt, String createdBy) {
		this.isEnabled = isEnabled;
		this.jenis = jenis;
		this.lokus = lokus;
		super.update(name, updatedAt, updatedBy);
	}

}
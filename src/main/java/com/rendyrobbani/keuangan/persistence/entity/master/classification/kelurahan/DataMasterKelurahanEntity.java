package com.rendyrobbani.keuangan.persistence.entity.master.classification.kelurahan;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kelurahan.DataMasterKelurahan;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.kabupaten.DataMasterKabupatenEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.kecamatan.DataMasterKecamatanEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.provinsi.DataMasterProvinsiEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.experimental.Accessors;

@Data
@Setter(AccessLevel.NONE)
@Accessors(fluent = true)
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = DataMasterKelurahan.TABLE_NAME, uniqueConstraints = {@UniqueConstraint(columnNames = {"provinsi_id", "kabupaten_id", "kecamatan_id", "id"})})
public class DataMasterKelurahanEntity extends AbstractDataMasterKelurahanEntity {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "provinsi_id", referencedColumnName = "id", insertable = false, updatable = false)
	})
	protected DataMasterProvinsiEntity provinsi;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "provinsi_id", referencedColumnName = "provinsi_id", insertable = false, updatable = false),
			@JoinColumn(name = "kabupaten_id", referencedColumnName = "id", insertable = false, updatable = false)
	})
	protected DataMasterKabupatenEntity kabupaten;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "provinsi_id", referencedColumnName = "provinsi_id", insertable = false, updatable = false),
			@JoinColumn(name = "kabupaten_id", referencedColumnName = "kabupaten_id", insertable = false, updatable = false),
			@JoinColumn(name = "kecamatan_id", referencedColumnName = "id", insertable = false, updatable = false)
	})
	protected DataMasterKecamatanEntity kecamatan;

	@Override
	public DataMasterKelurahan toDomain() {
		return this;
	}

}
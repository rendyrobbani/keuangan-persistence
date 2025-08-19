package com.rendyrobbani.keuangan.persistence.entity.master.classification.subkegiatan;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.subkegiatan.DataMasterSubkegiatan;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.bidang.DataMasterBidangEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.fungsi.DataMasterFungsiEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.kegiatan.DataMasterKegiatanEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.program.DataMasterProgramEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.subfungsi.DataMasterSubfungsiEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.urusan.DataMasterUrusanEntity;
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
@Table(name = DataMasterSubkegiatan.TABLE_NAME, uniqueConstraints = {@UniqueConstraint(columnNames = {"urusan_id", "bidang_id", "program_id", "kegiatan_id", "id"}), @UniqueConstraint(columnNames = {"fungsi_id", "subfungsi_id", "urusan_id", "bidang_id", "program_id", "kegiatan_id", "id"}), @UniqueConstraint(columnNames = {"fungsi_id", "subfungsi_id", "program_id", "kegiatan_id", "id"})})
public class DataMasterSubkegiatanEntity extends AbstractDataMasterSubkegiatanEntity {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "urusan_id", referencedColumnName = "id", insertable = false, updatable = false)
	})
	protected DataMasterUrusanEntity urusan;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "urusan_id", referencedColumnName = "urusan_id", insertable = false, updatable = false),
			@JoinColumn(name = "bidang_id", referencedColumnName = "id", insertable = false, updatable = false)
	})
	protected DataMasterBidangEntity bidang;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "urusan_id", referencedColumnName = "urusan_id", insertable = false, updatable = false),
			@JoinColumn(name = "bidang_id", referencedColumnName = "bidang_id", insertable = false, updatable = false),
			@JoinColumn(name = "program_id", referencedColumnName = "id", insertable = false, updatable = false)
	})
	protected DataMasterProgramEntity program;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "fungsi_id", referencedColumnName = "fungsi_id", insertable = false, updatable = false),
			@JoinColumn(name = "subfungsi_id", referencedColumnName = "subfungsi_id", insertable = false, updatable = false),
			@JoinColumn(name = "urusan_id", referencedColumnName = "urusan_id", insertable = false, updatable = false),
			@JoinColumn(name = "bidang_id", referencedColumnName = "bidang_id", insertable = false, updatable = false),
			@JoinColumn(name = "program_id", referencedColumnName = "program_id", insertable = false, updatable = false),
			@JoinColumn(name = "kegiatan_id", referencedColumnName = "id", insertable = false, updatable = false)
	})
	protected DataMasterKegiatanEntity kegiatan;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "fungsi_id", referencedColumnName = "id", insertable = false, updatable = false)
	})
	protected DataMasterFungsiEntity fungsi;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "fungsi_id", referencedColumnName = "fungsi_id", insertable = false, updatable = false),
			@JoinColumn(name = "subfungsi_id", referencedColumnName = "id", insertable = false, updatable = false)
	})
	protected DataMasterSubfungsiEntity subfungsi;

	@Override
	public DataMasterSubkegiatan toDomain() {
		return this;
	}

}
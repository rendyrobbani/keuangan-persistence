package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset6.DataMasterRekeningAset6;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.base.rekening6.AbstractDataMasterRekening6Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset1.DataMasterRekeningAset1Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset2.DataMasterRekeningAset2Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset3.DataMasterRekeningAset3Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset4.DataMasterRekeningAset4Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset5.DataMasterRekeningAset5Entity;
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
@Table(name = DataMasterRekeningAset6.TABLE_NAME, uniqueConstraints = {@UniqueConstraint(columnNames = {"rekening1_id", "rekening2_id", "rekening3_id", "rekening4_id", "id"})})
public class DataMasterRekeningAset6Entity extends AbstractDataMasterRekening6Entity<DataMasterRekeningAset6> implements DataMasterRekeningAset6 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "rekening1_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningAset1Entity rekening1;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "rekening1_id", referencedColumnName = "rekening1_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening2_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningAset2Entity rekening2;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "rekening1_id", referencedColumnName = "rekening1_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening2_id", referencedColumnName = "rekening2_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening3_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningAset3Entity rekening3;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "rekening1_id", referencedColumnName = "rekening1_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening2_id", referencedColumnName = "rekening2_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening3_id", referencedColumnName = "rekening3_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening4_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningAset4Entity rekening4;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "rekening1_id", referencedColumnName = "rekening1_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening2_id", referencedColumnName = "rekening2_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening3_id", referencedColumnName = "rekening3_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening4_id", referencedColumnName = "rekening4_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening5_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningAset5Entity rekening5;

	@Override
	public DataMasterRekeningAset6 toDomain() {
		return this;
	}

}
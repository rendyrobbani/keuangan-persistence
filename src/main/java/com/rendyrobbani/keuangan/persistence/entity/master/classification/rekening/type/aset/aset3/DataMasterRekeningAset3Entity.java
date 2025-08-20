package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset3;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset3.DataMasterRekeningAset3;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.base.rekening3.AbstractDataMasterRekening3Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset1.DataMasterRekeningAset1Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset2.DataMasterRekeningAset2Entity;
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
@Table(name = DataMasterRekeningAset3.TABLE_NAME, uniqueConstraints = {@UniqueConstraint(columnNames = {"rekening1_id", "rekening2_id", "id"})})
public class DataMasterRekeningAset3Entity extends AbstractDataMasterRekening3Entity<DataMasterRekeningAset3> implements DataMasterRekeningAset3 {

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

	@Override
	public DataMasterRekeningAset3 toDomain() {
		return this;
	}

}
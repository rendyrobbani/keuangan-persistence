package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset2;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset2.DataMasterRekeningAset2;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.base.rekening2.AbstractDataMasterRekening2Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset1.DataMasterRekeningAset1Entity;
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
@Table(name = DataMasterRekeningAset2.TABLE_NAME, uniqueConstraints = {@UniqueConstraint(columnNames = {"rekening1_id", "id"})})
public class DataMasterRekeningAset2Entity extends AbstractDataMasterRekening2Entity<DataMasterRekeningAset2> implements DataMasterRekeningAset2 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "rekening1_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningAset1Entity rekening1;

	@Override
	public DataMasterRekeningAset2 toDomain() {
		return this;
	}

}
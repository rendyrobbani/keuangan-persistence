package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset1;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset1.DataMasterRekeningAset1;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.base.rekening1.AbstractDataMasterRekening1Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
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
@Table(name = DataMasterRekeningAset1.TABLE_NAME)
public class DataMasterRekeningAset1Entity extends AbstractDataMasterRekening1Entity<DataMasterRekeningAset1> implements DataMasterRekeningAset1 {

	@Override
	public DataMasterRekeningAset1 toDomain() {
		return this;
	}

}
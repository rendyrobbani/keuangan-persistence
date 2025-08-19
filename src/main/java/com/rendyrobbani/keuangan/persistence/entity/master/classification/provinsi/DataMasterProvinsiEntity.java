package com.rendyrobbani.keuangan.persistence.entity.master.classification.provinsi;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.provinsi.DataMasterProvinsi;
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
@Table(name = DataMasterProvinsi.TABLE_NAME)
public class DataMasterProvinsiEntity extends AbstractDataMasterProvinsiEntity {

	@Override
	public DataMasterProvinsi toDomain() {
		return this;
	}

}
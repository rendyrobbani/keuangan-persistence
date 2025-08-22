package com.rendyrobbani.keuangan.persistence.entity.master.satuan;

import com.rendyrobbani.keuangan.core.domain.entity.master.satuan.DataMasterSatuan;
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
@Table(name = DataMasterSatuan.TABLE_NAME)
public class DataMasterSatuanEntity extends AbstractDataMasterSatuanEntity {

	@Override
	public DataMasterSatuan toDomain() {
		return this;
	}

}
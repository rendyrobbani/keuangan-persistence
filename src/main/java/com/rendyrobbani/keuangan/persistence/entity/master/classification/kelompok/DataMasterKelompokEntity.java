package com.rendyrobbani.keuangan.persistence.entity.master.classification.kelompok;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kelompok.DataMasterKelompok;
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
@Table(name = DataMasterKelompok.TABLE_NAME)
public class DataMasterKelompokEntity extends AbstractDataMasterKelompokEntity {

	@Override
	public DataMasterKelompok toDomain() {
		return this;
	}

}
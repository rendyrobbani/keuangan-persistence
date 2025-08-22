package com.rendyrobbani.keuangan.persistence.entity.master.penerima;

import com.rendyrobbani.keuangan.core.domain.entity.master.penerima.DataMasterPenerima;
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
@Table(name = DataMasterPenerima.TABLE_NAME)
public class DataMasterPenerimaEntity extends AbstractDataMasterPenerimaEntity {

	@Override
	public DataMasterPenerima toDomain() {
		return this;
	}

}
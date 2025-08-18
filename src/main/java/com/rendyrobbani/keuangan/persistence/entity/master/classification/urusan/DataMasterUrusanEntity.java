package com.rendyrobbani.keuangan.persistence.entity.master.classification.urusan;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.urusan.DataMasterUrusan;
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
@Table(name = DataMasterUrusan.TABLE_NAME)
public class DataMasterUrusanEntity extends AbstractDataMasterUrusanEntity {

	@Override
	public DataMasterUrusan toDomain() {
		return this;
	}

}
package com.rendyrobbani.keuangan.persistence.entity.master.classification.fungsi;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.fungsi.DataMasterFungsi;
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
@Table(name = DataMasterFungsi.TABLE_NAME)
public class DataMasterFungsiEntity extends AbstractDataMasterFungsiEntity {

	@Override
	public DataMasterFungsi toDomain() {
		return this;
	}

}
package com.rendyrobbani.keuangan.persistence.entity.master.mayor;

import com.rendyrobbani.keuangan.core.domain.entity.master.mayor.DataMasterMayor;
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
@Table(name = DataMasterMayor.TABLE_NAME)
public class DataMasterMayorEntity extends AbstractDataMasterMayorEntity {

	@Override
	public DataMasterMayor toDomain() {
		return this;
	}

}
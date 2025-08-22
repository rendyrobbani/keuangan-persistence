package com.rendyrobbani.keuangan.persistence.entity.master.priority.provinsi;

import com.rendyrobbani.keuangan.core.domain.entity.master.priority.provinsi.DataMasterPriorityOfProvinsi;
import com.rendyrobbani.keuangan.persistence.entity.master.priority.AbstractDataMasterPriorityEntity;
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
@Table(name = DataMasterPriorityOfProvinsi.TABLE_NAME)
public class DataMasterPriorityOfProvinsiEntity extends AbstractDataMasterPriorityEntity<DataMasterPriorityOfProvinsi> implements DataMasterPriorityOfProvinsi {

	@Override
	public DataMasterPriorityOfProvinsi toDomain() {
		return this;
	}

}
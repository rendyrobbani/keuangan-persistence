package com.rendyrobbani.keuangan.persistence.entity.master.priority.kabupaten;

import com.rendyrobbani.keuangan.core.domain.entity.master.priority.kabupaten.DataMasterPriorityOfKabupaten;
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
@Table(name = DataMasterPriorityOfKabupaten.TABLE_NAME)
public class DataMasterPriorityOfKabupatenEntity extends AbstractDataMasterPriorityEntity<DataMasterPriorityOfKabupaten> implements DataMasterPriorityOfKabupaten {

	@Override
	public DataMasterPriorityOfKabupaten toDomain() {
		return this;
	}

}
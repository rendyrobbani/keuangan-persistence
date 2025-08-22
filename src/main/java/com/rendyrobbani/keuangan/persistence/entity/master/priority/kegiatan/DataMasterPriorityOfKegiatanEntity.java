package com.rendyrobbani.keuangan.persistence.entity.master.priority.kegiatan;

import com.rendyrobbani.keuangan.core.domain.entity.master.priority.kegiatan.DataMasterPriorityOfKegiatan;
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
@Table(name = DataMasterPriorityOfKegiatan.TABLE_NAME)
public class DataMasterPriorityOfKegiatanEntity extends AbstractDataMasterPriorityEntity<DataMasterPriorityOfKegiatan> implements DataMasterPriorityOfKegiatan {

	@Override
	public DataMasterPriorityOfKegiatan toDomain() {
		return this;
	}

}
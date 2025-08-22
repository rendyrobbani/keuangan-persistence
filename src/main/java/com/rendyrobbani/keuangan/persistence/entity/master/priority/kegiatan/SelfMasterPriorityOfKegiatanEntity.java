package com.rendyrobbani.keuangan.persistence.entity.master.priority.kegiatan;

import com.rendyrobbani.keuangan.core.domain.entity.master.priority.kegiatan.SelfMasterPriorityOfKegiatan;
import com.rendyrobbani.keuangan.persistence.entity.AbstractSelfEntity;
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
@Table(name = SelfMasterPriorityOfKegiatan.TABLE_NAME)
public class SelfMasterPriorityOfKegiatanEntity extends AbstractSelfEntity<SelfMasterPriorityOfKegiatan> implements SelfMasterPriorityOfKegiatan {

	@Override
	public SelfMasterPriorityOfKegiatan toDomain() {
		return this;
	}

}
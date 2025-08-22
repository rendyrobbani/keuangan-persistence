package com.rendyrobbani.keuangan.persistence.entity.master.priority.kabupaten;

import com.rendyrobbani.keuangan.core.domain.entity.master.priority.kabupaten.SelfMasterPriorityOfKabupaten;
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
@Table(name = SelfMasterPriorityOfKabupaten.TABLE_NAME)
public class SelfMasterPriorityOfKabupatenEntity extends AbstractSelfEntity<SelfMasterPriorityOfKabupaten> implements SelfMasterPriorityOfKabupaten {

	@Override
	public SelfMasterPriorityOfKabupaten toDomain() {
		return this;
	}

}
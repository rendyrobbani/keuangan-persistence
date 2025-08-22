package com.rendyrobbani.keuangan.persistence.entity.master.priority.provinsi;

import com.rendyrobbani.keuangan.core.domain.entity.master.priority.provinsi.SelfMasterPriorityOfProvinsi;
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
@Table(name = SelfMasterPriorityOfProvinsi.TABLE_NAME)
public class SelfMasterPriorityOfProvinsiEntity extends AbstractSelfEntity<SelfMasterPriorityOfProvinsi> implements SelfMasterPriorityOfProvinsi {

	@Override
	public SelfMasterPriorityOfProvinsi toDomain() {
		return this;
	}

}
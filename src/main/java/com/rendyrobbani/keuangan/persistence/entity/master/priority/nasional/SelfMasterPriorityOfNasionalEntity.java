package com.rendyrobbani.keuangan.persistence.entity.master.priority.nasional;

import com.rendyrobbani.keuangan.core.domain.entity.master.priority.nasional.SelfMasterPriorityOfNasional;
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
@Table(name = SelfMasterPriorityOfNasional.TABLE_NAME)
public class SelfMasterPriorityOfNasionalEntity extends AbstractSelfEntity<SelfMasterPriorityOfNasional> implements SelfMasterPriorityOfNasional {

	@Override
	public SelfMasterPriorityOfNasional toDomain() {
		return this;
	}

}
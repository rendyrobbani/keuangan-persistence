package com.rendyrobbani.keuangan.persistence.entity.master.tapd.sign;

import com.rendyrobbani.keuangan.core.domain.entity.master.tapd.sign.LogsMasterTapdSign;
import jakarta.persistence.*;
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
@Table(name = LogsMasterTapdSign.TABLE_NAME)
public class LogsMasterTapdSignEntity extends AbstractLogsMasterTapdSignEntity {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false)
	})
	private DataMasterTapdSignEntity subject;

	@Override
	public LogsMasterTapdSign toDomain() {
		return this;
	}

}
package com.rendyrobbani.keuangan.persistence.entity.master.classification.sumber;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.sumber.SipdMasterSumber;
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
@Table(name = SipdMasterSumber.TABLE_NAME)
public class SipdMasterSumberEntity extends AbstractSipdMasterSumberEntity {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "subject_id", insertable = false, updatable = false)
	private DataMasterSumberEntity subject;

	@Override
	public SipdMasterSumber toDomain() {
		return this;
	}

}
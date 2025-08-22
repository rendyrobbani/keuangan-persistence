package com.rendyrobbani.keuangan.persistence.entity.master.classification.urusan;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.urusan.SipdMasterUrusan;
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
@Table(name = SipdMasterUrusan.TABLE_NAME)
public class SipdMasterUrusanEntity extends AbstractSipdMasterUrusanEntity {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false)
	})
	private DataMasterUrusanEntity subject;

	@Override
	public SipdMasterUrusan toDomain() {
		return this;
	}

}
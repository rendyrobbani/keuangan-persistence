package com.rendyrobbani.keuangan.persistence.entity.master.classification.kabupaten;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kabupaten.SipdMasterKabupaten;
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
@Table(name = SipdMasterKabupaten.TABLE_NAME)
public class SipdMasterKabupatenEntity extends AbstractSipdMasterKabupatenEntity {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false)
	})
	private DataMasterKabupatenEntity subject;

	@Override
	public SipdMasterKabupaten toDomain() {
		return this;
	}

}
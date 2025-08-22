package com.rendyrobbani.keuangan.persistence.entity.master.classification.kecamatan;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kecamatan.SipdMasterKecamatan;
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
@Table(name = SipdMasterKecamatan.TABLE_NAME)
public class SipdMasterKecamatanEntity extends AbstractSipdMasterKecamatanEntity {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", insertable = false, updatable = false)
	})
	private DataMasterKecamatanEntity subject;

	@Override
	public SipdMasterKecamatan toDomain() {
		return this;
	}

}
package com.rendyrobbani.keuangan.persistence.entity.master.classification.kegiatan;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kegiatan.SipdMasterKegiatan;
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
@Table(name = SipdMasterKegiatan.TABLE_NAME)
public class SipdMasterKegiatanEntity extends AbstractSipdMasterKegiatanEntity {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false)
	})
	private DataMasterKegiatanEntity subject;

	@Override
	public SipdMasterKegiatan toDomain() {
		return this;
	}

}
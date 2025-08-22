package com.rendyrobbani.keuangan.persistence.entity.master.classification.subkegiatan;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.subkegiatan.SipdMasterSubkegiatan;
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
@Table(name = SipdMasterSubkegiatan.TABLE_NAME)
public class SipdMasterSubkegiatanEntity extends AbstractSipdMasterSubkegiatanEntity {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false)
	})
	private DataMasterSubkegiatanEntity subject;

	@Override
	public SipdMasterSubkegiatan toDomain() {
		return this;
	}

}
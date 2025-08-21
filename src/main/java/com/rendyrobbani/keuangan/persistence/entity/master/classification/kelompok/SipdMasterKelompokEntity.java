package com.rendyrobbani.keuangan.persistence.entity.master.classification.kelompok;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kelompok.SipdMasterKelompok;
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
@Table(name = SipdMasterKelompok.TABLE_NAME)
public class SipdMasterKelompokEntity extends AbstractSipdMasterKelompokEntity {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "subject_id", insertable = false, updatable = false)
	private DataMasterKelompokEntity subject;

	@Override
	public SipdMasterKelompok toDomain() {
		return this;
	}

}
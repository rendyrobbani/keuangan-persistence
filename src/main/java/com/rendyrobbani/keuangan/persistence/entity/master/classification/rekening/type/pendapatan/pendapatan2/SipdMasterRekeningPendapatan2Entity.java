package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan2;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan.pendapatan2.DataMasterRekeningPendapatan2;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan.pendapatan2.SipdMasterRekeningPendapatan2;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.base.rekening2.AbstractSipdMasterRekening2Entity;
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
@Table(name = SipdMasterRekeningPendapatan2.TABLE_NAME)
public class SipdMasterRekeningPendapatan2Entity extends AbstractSipdMasterRekening2Entity<SipdMasterRekeningPendapatan2, DataMasterRekeningPendapatan2> implements SipdMasterRekeningPendapatan2 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningPendapatan2Entity subject;

	@Override
	public SipdMasterRekeningPendapatan2 toDomain() {
		return this;
	}

}
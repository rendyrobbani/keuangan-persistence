package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan1;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan.pendapatan1.DataMasterRekeningPendapatan1;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan.pendapatan1.SipdMasterRekeningPendapatan1;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.base.rekening1.AbstractSipdMasterRekening1Entity;
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
@Table(name = SipdMasterRekeningPendapatan1.TABLE_NAME)
public class SipdMasterRekeningPendapatan1Entity extends AbstractSipdMasterRekening1Entity<SipdMasterRekeningPendapatan1, DataMasterRekeningPendapatan1> implements SipdMasterRekeningPendapatan1 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningPendapatan1Entity subject;

	@Override
	public SipdMasterRekeningPendapatan1 toDomain() {
		return this;
	}

}
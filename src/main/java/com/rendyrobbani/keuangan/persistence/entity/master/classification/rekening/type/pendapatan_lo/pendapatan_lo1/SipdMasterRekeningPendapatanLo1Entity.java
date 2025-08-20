package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo1;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo1.DataMasterRekeningPendapatanLo1;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo1.SipdMasterRekeningPendapatanLo1;
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
@Table(name = SipdMasterRekeningPendapatanLo1.TABLE_NAME)
public class SipdMasterRekeningPendapatanLo1Entity extends AbstractSipdMasterRekening1Entity<SipdMasterRekeningPendapatanLo1, DataMasterRekeningPendapatanLo1> implements SipdMasterRekeningPendapatanLo1 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningPendapatanLo1Entity subject;

	@Override
	public SipdMasterRekeningPendapatanLo1 toDomain() {
		return this;
	}

}
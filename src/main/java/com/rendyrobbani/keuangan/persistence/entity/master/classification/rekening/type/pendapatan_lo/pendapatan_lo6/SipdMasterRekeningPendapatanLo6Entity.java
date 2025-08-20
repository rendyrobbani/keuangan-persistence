package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo6.DataMasterRekeningPendapatanLo6;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo6.SipdMasterRekeningPendapatanLo6;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.base.rekening6.AbstractSipdMasterRekening6Entity;
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
@Table(name = SipdMasterRekeningPendapatanLo6.TABLE_NAME)
public class SipdMasterRekeningPendapatanLo6Entity extends AbstractSipdMasterRekening6Entity<SipdMasterRekeningPendapatanLo6, DataMasterRekeningPendapatanLo6> implements SipdMasterRekeningPendapatanLo6 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningPendapatanLo6Entity subject;

	@Override
	public SipdMasterRekeningPendapatanLo6 toDomain() {
		return this;
	}

}
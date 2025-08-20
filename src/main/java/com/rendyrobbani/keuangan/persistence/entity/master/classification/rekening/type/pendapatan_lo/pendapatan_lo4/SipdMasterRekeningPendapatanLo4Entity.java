package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo4;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo4.DataMasterRekeningPendapatanLo4;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo4.SipdMasterRekeningPendapatanLo4;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.base.rekening4.AbstractSipdMasterRekening4Entity;
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
@Table(name = SipdMasterRekeningPendapatanLo4.TABLE_NAME)
public class SipdMasterRekeningPendapatanLo4Entity extends AbstractSipdMasterRekening4Entity<SipdMasterRekeningPendapatanLo4, DataMasterRekeningPendapatanLo4> implements SipdMasterRekeningPendapatanLo4 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningPendapatanLo4Entity subject;

	@Override
	public SipdMasterRekeningPendapatanLo4 toDomain() {
		return this;
	}

}
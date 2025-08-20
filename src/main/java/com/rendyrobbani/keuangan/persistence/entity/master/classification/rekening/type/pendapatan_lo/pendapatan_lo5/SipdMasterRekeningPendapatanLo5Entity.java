package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo5;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo5.DataMasterRekeningPendapatanLo5;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo5.SipdMasterRekeningPendapatanLo5;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.base.rekening5.AbstractSipdMasterRekening5Entity;
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
@Table(name = SipdMasterRekeningPendapatanLo5.TABLE_NAME)
public class SipdMasterRekeningPendapatanLo5Entity extends AbstractSipdMasterRekening5Entity<SipdMasterRekeningPendapatanLo5, DataMasterRekeningPendapatanLo5> implements SipdMasterRekeningPendapatanLo5 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningPendapatanLo5Entity subject;

	@Override
	public SipdMasterRekeningPendapatanLo5 toDomain() {
		return this;
	}

}
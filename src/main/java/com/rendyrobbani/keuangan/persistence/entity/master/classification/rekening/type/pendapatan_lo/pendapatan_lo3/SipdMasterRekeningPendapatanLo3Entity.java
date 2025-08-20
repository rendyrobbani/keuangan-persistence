package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo3;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo3.DataMasterRekeningPendapatanLo3;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo3.SipdMasterRekeningPendapatanLo3;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.base.rekening3.AbstractSipdMasterRekening3Entity;
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
@Table(name = SipdMasterRekeningPendapatanLo3.TABLE_NAME)
public class SipdMasterRekeningPendapatanLo3Entity extends AbstractSipdMasterRekening3Entity<SipdMasterRekeningPendapatanLo3, DataMasterRekeningPendapatanLo3> implements SipdMasterRekeningPendapatanLo3 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningPendapatanLo3Entity subject;

	@Override
	public SipdMasterRekeningPendapatanLo3 toDomain() {
		return this;
	}

}
package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan.pendapatan6.DataMasterRekeningPendapatan6;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan.pendapatan6.SipdMasterRekeningPendapatan6;
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
@Table(name = SipdMasterRekeningPendapatan6.TABLE_NAME)
public class SipdMasterRekeningPendapatan6Entity extends AbstractSipdMasterRekening6Entity<SipdMasterRekeningPendapatan6, DataMasterRekeningPendapatan6> implements SipdMasterRekeningPendapatan6 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningPendapatan6Entity subject;

	@Override
	public SipdMasterRekeningPendapatan6 toDomain() {
		return this;
	}

}
package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan4;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan.pendapatan4.DataMasterRekeningPendapatan4;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan.pendapatan4.SipdMasterRekeningPendapatan4;
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
@Table(name = SipdMasterRekeningPendapatan4.TABLE_NAME)
public class SipdMasterRekeningPendapatan4Entity extends AbstractSipdMasterRekening4Entity<SipdMasterRekeningPendapatan4, DataMasterRekeningPendapatan4> implements SipdMasterRekeningPendapatan4 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningPendapatan4Entity subject;

	@Override
	public SipdMasterRekeningPendapatan4 toDomain() {
		return this;
	}

}
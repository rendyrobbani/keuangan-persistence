package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan5;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan.pendapatan5.DataMasterRekeningPendapatan5;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan.pendapatan5.SipdMasterRekeningPendapatan5;
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
@Table(name = SipdMasterRekeningPendapatan5.TABLE_NAME)
public class SipdMasterRekeningPendapatan5Entity extends AbstractSipdMasterRekening5Entity<SipdMasterRekeningPendapatan5, DataMasterRekeningPendapatan5> implements SipdMasterRekeningPendapatan5 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningPendapatan5Entity subject;

	@Override
	public SipdMasterRekeningPendapatan5 toDomain() {
		return this;
	}

}
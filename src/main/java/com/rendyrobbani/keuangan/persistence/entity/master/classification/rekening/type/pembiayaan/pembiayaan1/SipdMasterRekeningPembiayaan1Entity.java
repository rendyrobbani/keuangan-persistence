package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pembiayaan.pembiayaan1;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pembiayaan.pembiayaan1.DataMasterRekeningPembiayaan1;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pembiayaan.pembiayaan1.SipdMasterRekeningPembiayaan1;
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
@Table(name = SipdMasterRekeningPembiayaan1.TABLE_NAME)
public class SipdMasterRekeningPembiayaan1Entity extends AbstractSipdMasterRekening1Entity<SipdMasterRekeningPembiayaan1, DataMasterRekeningPembiayaan1> implements SipdMasterRekeningPembiayaan1 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningPembiayaan1Entity subject;

	@Override
	public SipdMasterRekeningPembiayaan1 toDomain() {
		return this;
	}

}
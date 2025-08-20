package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pembiayaan.pembiayaan4;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pembiayaan.pembiayaan4.DataMasterRekeningPembiayaan4;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pembiayaan.pembiayaan4.SipdMasterRekeningPembiayaan4;
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
@Table(name = SipdMasterRekeningPembiayaan4.TABLE_NAME)
public class SipdMasterRekeningPembiayaan4Entity extends AbstractSipdMasterRekening4Entity<SipdMasterRekeningPembiayaan4, DataMasterRekeningPembiayaan4> implements SipdMasterRekeningPembiayaan4 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningPembiayaan4Entity subject;

	@Override
	public SipdMasterRekeningPembiayaan4 toDomain() {
		return this;
	}

}
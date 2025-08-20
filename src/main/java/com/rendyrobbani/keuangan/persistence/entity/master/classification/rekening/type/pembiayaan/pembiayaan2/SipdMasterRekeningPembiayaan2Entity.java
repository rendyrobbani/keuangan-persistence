package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pembiayaan.pembiayaan2;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pembiayaan.pembiayaan2.DataMasterRekeningPembiayaan2;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pembiayaan.pembiayaan2.SipdMasterRekeningPembiayaan2;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.base.rekening2.AbstractSipdMasterRekening2Entity;
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
@Table(name = SipdMasterRekeningPembiayaan2.TABLE_NAME)
public class SipdMasterRekeningPembiayaan2Entity extends AbstractSipdMasterRekening2Entity<SipdMasterRekeningPembiayaan2, DataMasterRekeningPembiayaan2> implements SipdMasterRekeningPembiayaan2 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningPembiayaan2Entity subject;

	@Override
	public SipdMasterRekeningPembiayaan2 toDomain() {
		return this;
	}

}
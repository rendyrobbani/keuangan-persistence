package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pembiayaan.pembiayaan6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pembiayaan.pembiayaan6.DataMasterRekeningPembiayaan6;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pembiayaan.pembiayaan6.SipdMasterRekeningPembiayaan6;
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
@Table(name = SipdMasterRekeningPembiayaan6.TABLE_NAME)
public class SipdMasterRekeningPembiayaan6Entity extends AbstractSipdMasterRekening6Entity<SipdMasterRekeningPembiayaan6, DataMasterRekeningPembiayaan6> implements SipdMasterRekeningPembiayaan6 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningPembiayaan6Entity subject;

	@Override
	public SipdMasterRekeningPembiayaan6 toDomain() {
		return this;
	}

}
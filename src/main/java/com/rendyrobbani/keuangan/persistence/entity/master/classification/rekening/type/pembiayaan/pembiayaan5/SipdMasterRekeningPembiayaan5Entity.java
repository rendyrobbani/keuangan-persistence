package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pembiayaan.pembiayaan5;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pembiayaan.pembiayaan5.DataMasterRekeningPembiayaan5;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pembiayaan.pembiayaan5.SipdMasterRekeningPembiayaan5;
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
@Table(name = SipdMasterRekeningPembiayaan5.TABLE_NAME)
public class SipdMasterRekeningPembiayaan5Entity extends AbstractSipdMasterRekening5Entity<SipdMasterRekeningPembiayaan5, DataMasterRekeningPembiayaan5> implements SipdMasterRekeningPembiayaan5 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningPembiayaan5Entity subject;

	@Override
	public SipdMasterRekeningPembiayaan5 toDomain() {
		return this;
	}

}
package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja6.DataMasterBelanja6;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja6.SipdMasterBelanja6;
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
@Table(name = SipdMasterBelanja6.TABLE_NAME)
public class SipdMasterBelanja6Entity extends AbstractSipdMasterRekening6Entity<SipdMasterBelanja6, DataMasterBelanja6> implements SipdMasterBelanja6 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterBelanja6Entity subject;

	@Override
	public SipdMasterBelanja6 toDomain() {
		return this;
	}

}
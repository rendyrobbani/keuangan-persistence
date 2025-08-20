package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja6.DataMasterRekeningBelanja6;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja6.SipdMasterRekeningBelanja6;
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
@Table(name = SipdMasterRekeningBelanja6.TABLE_NAME)
public class SipdMasterRekeningBelanja6Entity extends AbstractSipdMasterRekening6Entity<SipdMasterRekeningBelanja6, DataMasterRekeningBelanja6> implements SipdMasterRekeningBelanja6 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningBelanja6Entity subject;

	@Override
	public SipdMasterRekeningBelanja6 toDomain() {
		return this;
	}

}
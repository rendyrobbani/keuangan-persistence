package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja1;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja1.DataMasterRekeningBelanja1;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja1.SipdMasterRekeningBelanja1;
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
@Table(name = SipdMasterRekeningBelanja1.TABLE_NAME)
public class SipdMasterRekeningBelanja1Entity extends AbstractSipdMasterRekening1Entity<SipdMasterRekeningBelanja1, DataMasterRekeningBelanja1> implements SipdMasterRekeningBelanja1 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningBelanja1Entity subject;

	@Override
	public SipdMasterRekeningBelanja1 toDomain() {
		return this;
	}

}
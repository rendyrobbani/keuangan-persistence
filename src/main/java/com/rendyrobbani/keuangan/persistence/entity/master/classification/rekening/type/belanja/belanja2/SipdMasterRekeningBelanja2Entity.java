package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja2;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja2.DataMasterRekeningBelanja2;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja2.SipdMasterRekeningBelanja2;
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
@Table(name = SipdMasterRekeningBelanja2.TABLE_NAME)
public class SipdMasterRekeningBelanja2Entity extends AbstractSipdMasterRekening2Entity<SipdMasterRekeningBelanja2, DataMasterRekeningBelanja2> implements SipdMasterRekeningBelanja2 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningBelanja2Entity subject;

	@Override
	public SipdMasterRekeningBelanja2 toDomain() {
		return this;
	}

}
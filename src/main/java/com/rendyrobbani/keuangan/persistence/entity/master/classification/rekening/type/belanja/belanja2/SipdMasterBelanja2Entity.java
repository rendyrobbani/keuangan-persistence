package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja2;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja2.DataMasterBelanja2;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja2.SipdMasterBelanja2;
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
@Table(name = SipdMasterBelanja2.TABLE_NAME)
public class SipdMasterBelanja2Entity extends AbstractSipdMasterRekening2Entity<SipdMasterBelanja2, DataMasterBelanja2> implements SipdMasterBelanja2 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterBelanja2Entity subject;

	@Override
	public SipdMasterBelanja2 toDomain() {
		return this;
	}

}
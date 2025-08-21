package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja1;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja1.DataMasterBelanja1;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja1.SipdMasterBelanja1;
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
@Table(name = SipdMasterBelanja1.TABLE_NAME)
public class SipdMasterBelanja1Entity extends AbstractSipdMasterRekening1Entity<SipdMasterBelanja1, DataMasterBelanja1> implements SipdMasterBelanja1 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterBelanja1Entity subject;

	@Override
	public SipdMasterBelanja1 toDomain() {
		return this;
	}

}
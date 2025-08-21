package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja4;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja4.DataMasterBelanja4;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja4.SipdMasterBelanja4;
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
@Table(name = SipdMasterBelanja4.TABLE_NAME)
public class SipdMasterBelanja4Entity extends AbstractSipdMasterRekening4Entity<SipdMasterBelanja4, DataMasterBelanja4> implements SipdMasterBelanja4 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterBelanja4Entity subject;

	@Override
	public SipdMasterBelanja4 toDomain() {
		return this;
	}

}
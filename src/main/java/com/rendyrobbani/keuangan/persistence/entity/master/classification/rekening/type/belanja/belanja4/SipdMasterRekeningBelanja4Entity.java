package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja4;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja4.DataMasterRekeningBelanja4;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja4.SipdMasterRekeningBelanja4;
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
@Table(name = SipdMasterRekeningBelanja4.TABLE_NAME)
public class SipdMasterRekeningBelanja4Entity extends AbstractSipdMasterRekening4Entity<SipdMasterRekeningBelanja4, DataMasterRekeningBelanja4> implements SipdMasterRekeningBelanja4 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningBelanja4Entity subject;

	@Override
	public SipdMasterRekeningBelanja4 toDomain() {
		return this;
	}

}
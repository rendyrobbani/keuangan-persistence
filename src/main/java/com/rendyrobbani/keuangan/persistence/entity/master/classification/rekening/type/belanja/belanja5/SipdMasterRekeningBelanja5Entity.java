package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja5;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja5.DataMasterRekeningBelanja5;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja5.SipdMasterRekeningBelanja5;
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
@Table(name = SipdMasterRekeningBelanja5.TABLE_NAME)
public class SipdMasterRekeningBelanja5Entity extends AbstractSipdMasterRekening5Entity<SipdMasterRekeningBelanja5, DataMasterRekeningBelanja5> implements SipdMasterRekeningBelanja5 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningBelanja5Entity subject;

	@Override
	public SipdMasterRekeningBelanja5 toDomain() {
		return this;
	}

}
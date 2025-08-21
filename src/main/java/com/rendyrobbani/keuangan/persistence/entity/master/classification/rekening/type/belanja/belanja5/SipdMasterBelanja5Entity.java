package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja5;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja5.DataMasterBelanja5;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja5.SipdMasterBelanja5;
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
@Table(name = SipdMasterBelanja5.TABLE_NAME)
public class SipdMasterBelanja5Entity extends AbstractSipdMasterRekening5Entity<SipdMasterBelanja5, DataMasterBelanja5> implements SipdMasterBelanja5 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterBelanja5Entity subject;

	@Override
	public SipdMasterBelanja5 toDomain() {
		return this;
	}

}
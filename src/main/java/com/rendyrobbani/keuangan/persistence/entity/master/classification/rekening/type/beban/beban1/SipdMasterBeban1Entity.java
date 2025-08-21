package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban1;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban1.DataMasterBeban1;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban1.SipdMasterBeban1;
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
@Table(name = SipdMasterBeban1.TABLE_NAME)
public class SipdMasterBeban1Entity extends AbstractSipdMasterRekening1Entity<SipdMasterBeban1, DataMasterBeban1> implements SipdMasterBeban1 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterBeban1Entity subject;

	@Override
	public SipdMasterBeban1 toDomain() {
		return this;
	}

}
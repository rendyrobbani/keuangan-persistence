package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban2;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban2.DataMasterBeban2;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban2.SipdMasterBeban2;
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
@Table(name = SipdMasterBeban2.TABLE_NAME)
public class SipdMasterBeban2Entity extends AbstractSipdMasterRekening2Entity<SipdMasterBeban2, DataMasterBeban2> implements SipdMasterBeban2 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterBeban2Entity subject;

	@Override
	public SipdMasterBeban2 toDomain() {
		return this;
	}

}
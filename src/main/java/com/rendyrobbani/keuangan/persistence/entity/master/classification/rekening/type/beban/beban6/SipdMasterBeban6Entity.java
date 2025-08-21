package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban6.DataMasterBeban6;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban6.SipdMasterBeban6;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.base.rekening6.AbstractSipdMasterRekening6Entity;
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
@Table(name = SipdMasterBeban6.TABLE_NAME)
public class SipdMasterBeban6Entity extends AbstractSipdMasterRekening6Entity<SipdMasterBeban6, DataMasterBeban6> implements SipdMasterBeban6 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterBeban6Entity subject;

	@Override
	public SipdMasterBeban6 toDomain() {
		return this;
	}

}
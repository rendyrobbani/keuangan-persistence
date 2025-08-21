package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban4;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban4.DataMasterBeban4;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban4.SipdMasterBeban4;
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
@Table(name = SipdMasterBeban4.TABLE_NAME)
public class SipdMasterBeban4Entity extends AbstractSipdMasterRekening4Entity<SipdMasterBeban4, DataMasterBeban4> implements SipdMasterBeban4 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterBeban4Entity subject;

	@Override
	public SipdMasterBeban4 toDomain() {
		return this;
	}

}
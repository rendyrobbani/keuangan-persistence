package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban5;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban5.DataMasterBeban5;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban5.SipdMasterBeban5;
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
@Table(name = SipdMasterBeban5.TABLE_NAME)
public class SipdMasterBeban5Entity extends AbstractSipdMasterRekening5Entity<SipdMasterBeban5, DataMasterBeban5> implements SipdMasterBeban5 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterBeban5Entity subject;

	@Override
	public SipdMasterBeban5 toDomain() {
		return this;
	}

}
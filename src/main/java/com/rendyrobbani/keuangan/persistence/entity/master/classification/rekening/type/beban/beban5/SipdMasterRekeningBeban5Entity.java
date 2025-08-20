package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban5;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban5.DataMasterRekeningBeban5;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban5.SipdMasterRekeningBeban5;
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
@Table(name = SipdMasterRekeningBeban5.TABLE_NAME)
public class SipdMasterRekeningBeban5Entity extends AbstractSipdMasterRekening5Entity<SipdMasterRekeningBeban5, DataMasterRekeningBeban5> implements SipdMasterRekeningBeban5 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningBeban5Entity subject;

	@Override
	public SipdMasterRekeningBeban5 toDomain() {
		return this;
	}

}
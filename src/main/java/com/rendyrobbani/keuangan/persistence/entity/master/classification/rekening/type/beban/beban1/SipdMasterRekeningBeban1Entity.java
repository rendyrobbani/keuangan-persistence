package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban1;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban1.DataMasterRekeningBeban1;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban1.SipdMasterRekeningBeban1;
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
@Table(name = SipdMasterRekeningBeban1.TABLE_NAME)
public class SipdMasterRekeningBeban1Entity extends AbstractSipdMasterRekening1Entity<SipdMasterRekeningBeban1, DataMasterRekeningBeban1> implements SipdMasterRekeningBeban1 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningBeban1Entity subject;

	@Override
	public SipdMasterRekeningBeban1 toDomain() {
		return this;
	}

}
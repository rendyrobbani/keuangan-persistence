package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban2;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban2.DataMasterRekeningBeban2;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban2.SipdMasterRekeningBeban2;
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
@Table(name = SipdMasterRekeningBeban2.TABLE_NAME)
public class SipdMasterRekeningBeban2Entity extends AbstractSipdMasterRekening2Entity<SipdMasterRekeningBeban2, DataMasterRekeningBeban2> implements SipdMasterRekeningBeban2 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningBeban2Entity subject;

	@Override
	public SipdMasterRekeningBeban2 toDomain() {
		return this;
	}

}
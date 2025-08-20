package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban1;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.kewajiban.kewajiban1.DataMasterRekeningKewajiban1;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.kewajiban.kewajiban1.SipdMasterRekeningKewajiban1;
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
@Table(name = SipdMasterRekeningKewajiban1.TABLE_NAME)
public class SipdMasterRekeningKewajiban1Entity extends AbstractSipdMasterRekening1Entity<SipdMasterRekeningKewajiban1, DataMasterRekeningKewajiban1> implements SipdMasterRekeningKewajiban1 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningKewajiban1Entity subject;

	@Override
	public SipdMasterRekeningKewajiban1 toDomain() {
		return this;
	}

}
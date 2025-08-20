package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban2;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.kewajiban.kewajiban2.DataMasterRekeningKewajiban2;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.kewajiban.kewajiban2.SipdMasterRekeningKewajiban2;
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
@Table(name = SipdMasterRekeningKewajiban2.TABLE_NAME)
public class SipdMasterRekeningKewajiban2Entity extends AbstractSipdMasterRekening2Entity<SipdMasterRekeningKewajiban2, DataMasterRekeningKewajiban2> implements SipdMasterRekeningKewajiban2 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningKewajiban2Entity subject;

	@Override
	public SipdMasterRekeningKewajiban2 toDomain() {
		return this;
	}

}
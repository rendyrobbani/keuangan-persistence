package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.kewajiban.kewajiban6.DataMasterRekeningKewajiban6;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.kewajiban.kewajiban6.SipdMasterRekeningKewajiban6;
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
@Table(name = SipdMasterRekeningKewajiban6.TABLE_NAME)
public class SipdMasterRekeningKewajiban6Entity extends AbstractSipdMasterRekening6Entity<SipdMasterRekeningKewajiban6, DataMasterRekeningKewajiban6> implements SipdMasterRekeningKewajiban6 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningKewajiban6Entity subject;

	@Override
	public SipdMasterRekeningKewajiban6 toDomain() {
		return this;
	}

}
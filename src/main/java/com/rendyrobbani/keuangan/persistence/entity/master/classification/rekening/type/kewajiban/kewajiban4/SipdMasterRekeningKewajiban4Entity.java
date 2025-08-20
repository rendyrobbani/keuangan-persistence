package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban4;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.kewajiban.kewajiban4.DataMasterRekeningKewajiban4;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.kewajiban.kewajiban4.SipdMasterRekeningKewajiban4;
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
@Table(name = SipdMasterRekeningKewajiban4.TABLE_NAME)
public class SipdMasterRekeningKewajiban4Entity extends AbstractSipdMasterRekening4Entity<SipdMasterRekeningKewajiban4, DataMasterRekeningKewajiban4> implements SipdMasterRekeningKewajiban4 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningKewajiban4Entity subject;

	@Override
	public SipdMasterRekeningKewajiban4 toDomain() {
		return this;
	}

}
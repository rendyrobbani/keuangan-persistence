package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban6.DataMasterRekeningBeban6;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban6.SipdMasterRekeningBeban6;
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
@Table(name = SipdMasterRekeningBeban6.TABLE_NAME)
public class SipdMasterRekeningBeban6Entity extends AbstractSipdMasterRekening6Entity<SipdMasterRekeningBeban6, DataMasterRekeningBeban6> implements SipdMasterRekeningBeban6 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningBeban6Entity subject;

	@Override
	public SipdMasterRekeningBeban6 toDomain() {
		return this;
	}

}
package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban4;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban4.DataMasterRekeningBeban4;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban4.SipdMasterRekeningBeban4;
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
@Table(name = SipdMasterRekeningBeban4.TABLE_NAME)
public class SipdMasterRekeningBeban4Entity extends AbstractSipdMasterRekening4Entity<SipdMasterRekeningBeban4, DataMasterRekeningBeban4> implements SipdMasterRekeningBeban4 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningBeban4Entity subject;

	@Override
	public SipdMasterRekeningBeban4 toDomain() {
		return this;
	}

}
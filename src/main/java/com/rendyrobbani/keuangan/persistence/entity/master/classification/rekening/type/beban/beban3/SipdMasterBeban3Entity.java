package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban3;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban3.DataMasterBeban3;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban3.SipdMasterBeban3;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.base.rekening3.AbstractSipdMasterRekening3Entity;
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
@Table(name = SipdMasterBeban3.TABLE_NAME)
public class SipdMasterBeban3Entity extends AbstractSipdMasterRekening3Entity<SipdMasterBeban3, DataMasterBeban3> implements SipdMasterBeban3 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterBeban3Entity subject;

	@Override
	public SipdMasterBeban3 toDomain() {
		return this;
	}

}
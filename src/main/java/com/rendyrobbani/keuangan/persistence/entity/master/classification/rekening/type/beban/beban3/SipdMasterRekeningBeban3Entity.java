package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban3;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban3.DataMasterRekeningBeban3;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban3.SipdMasterRekeningBeban3;
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
@Table(name = SipdMasterRekeningBeban3.TABLE_NAME)
public class SipdMasterRekeningBeban3Entity extends AbstractSipdMasterRekening3Entity<SipdMasterRekeningBeban3, DataMasterRekeningBeban3> implements SipdMasterRekeningBeban3 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningBeban3Entity subject;

	@Override
	public SipdMasterRekeningBeban3 toDomain() {
		return this;
	}

}
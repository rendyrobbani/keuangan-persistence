package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset4;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset4.DataMasterAset4;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset4.SipdMasterAset4;
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
@Table(name = SipdMasterAset4.TABLE_NAME)
public class SipdMasterAset4Entity extends AbstractSipdMasterRekening4Entity<SipdMasterAset4, DataMasterAset4> implements SipdMasterAset4 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterAset4Entity subject;

	@Override
	public SipdMasterAset4 toDomain() {
		return this;
	}

}
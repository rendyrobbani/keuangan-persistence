package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset6.DataMasterAset6;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset6.SipdMasterAset6;
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
@Table(name = SipdMasterAset6.TABLE_NAME)
public class SipdMasterAset6Entity extends AbstractSipdMasterRekening6Entity<SipdMasterAset6, DataMasterAset6> implements SipdMasterAset6 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterAset6Entity subject;

	@Override
	public SipdMasterAset6 toDomain() {
		return this;
	}

}
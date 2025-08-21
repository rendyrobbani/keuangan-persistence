package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset1;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset1.DataMasterAset1;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset1.SipdMasterAset1;
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
@Table(name = SipdMasterAset1.TABLE_NAME)
public class SipdMasterAset1Entity extends AbstractSipdMasterRekening1Entity<SipdMasterAset1, DataMasterAset1> implements SipdMasterAset1 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterAset1Entity subject;

	@Override
	public SipdMasterAset1 toDomain() {
		return this;
	}

}
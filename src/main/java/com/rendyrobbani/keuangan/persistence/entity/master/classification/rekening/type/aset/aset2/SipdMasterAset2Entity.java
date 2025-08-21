package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset2;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset2.DataMasterAset2;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset2.SipdMasterAset2;
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
@Table(name = SipdMasterAset2.TABLE_NAME)
public class SipdMasterAset2Entity extends AbstractSipdMasterRekening2Entity<SipdMasterAset2, DataMasterAset2> implements SipdMasterAset2 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterAset2Entity subject;

	@Override
	public SipdMasterAset2 toDomain() {
		return this;
	}

}
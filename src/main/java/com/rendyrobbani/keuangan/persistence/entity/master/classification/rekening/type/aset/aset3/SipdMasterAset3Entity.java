package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset3;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset3.DataMasterAset3;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset3.SipdMasterAset3;
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
@Table(name = SipdMasterAset3.TABLE_NAME)
public class SipdMasterAset3Entity extends AbstractSipdMasterRekening3Entity<SipdMasterAset3, DataMasterAset3> implements SipdMasterAset3 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterAset3Entity subject;

	@Override
	public SipdMasterAset3 toDomain() {
		return this;
	}

}
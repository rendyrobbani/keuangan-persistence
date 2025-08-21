package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset5;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset5.DataMasterAset5;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset5.SipdMasterAset5;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.base.rekening5.AbstractSipdMasterRekening5Entity;
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
@Table(name = SipdMasterAset5.TABLE_NAME)
public class SipdMasterAset5Entity extends AbstractSipdMasterRekening5Entity<SipdMasterAset5, DataMasterAset5> implements SipdMasterAset5 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterAset5Entity subject;

	@Override
	public SipdMasterAset5 toDomain() {
		return this;
	}

}
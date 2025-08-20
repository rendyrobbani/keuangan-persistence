package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset4;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset4.DataMasterRekeningAset4;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset4.SipdMasterRekeningAset4;
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
@Table(name = SipdMasterRekeningAset4.TABLE_NAME)
public class SipdMasterRekeningAset4Entity extends AbstractSipdMasterRekening4Entity<SipdMasterRekeningAset4, DataMasterRekeningAset4> implements SipdMasterRekeningAset4 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningAset4Entity subject;

	@Override
	public SipdMasterRekeningAset4 toDomain() {
		return this;
	}

}
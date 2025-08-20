package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset1;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset1.DataMasterRekeningAset1;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset1.SipdMasterRekeningAset1;
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
@Table(name = SipdMasterRekeningAset1.TABLE_NAME)
public class SipdMasterRekeningAset1Entity extends AbstractSipdMasterRekening1Entity<SipdMasterRekeningAset1, DataMasterRekeningAset1> implements SipdMasterRekeningAset1 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningAset1Entity subject;

	@Override
	public SipdMasterRekeningAset1 toDomain() {
		return this;
	}

}
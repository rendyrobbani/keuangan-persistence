package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset2;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset2.DataMasterRekeningAset2;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset2.SipdMasterRekeningAset2;
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
@Table(name = SipdMasterRekeningAset2.TABLE_NAME)
public class SipdMasterRekeningAset2Entity extends AbstractSipdMasterRekening2Entity<SipdMasterRekeningAset2, DataMasterRekeningAset2> implements SipdMasterRekeningAset2 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningAset2Entity subject;

	@Override
	public SipdMasterRekeningAset2 toDomain() {
		return this;
	}

}
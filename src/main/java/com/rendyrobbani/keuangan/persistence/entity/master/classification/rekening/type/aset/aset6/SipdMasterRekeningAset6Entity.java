package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset6.DataMasterRekeningAset6;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset6.SipdMasterRekeningAset6;
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
@Table(name = SipdMasterRekeningAset6.TABLE_NAME)
public class SipdMasterRekeningAset6Entity extends AbstractSipdMasterRekening6Entity<SipdMasterRekeningAset6, DataMasterRekeningAset6> implements SipdMasterRekeningAset6 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningAset6Entity subject;

	@Override
	public SipdMasterRekeningAset6 toDomain() {
		return this;
	}

}
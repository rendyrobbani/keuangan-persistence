package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset3;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset3.DataMasterRekeningAset3;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset3.SipdMasterRekeningAset3;
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
@Table(name = SipdMasterRekeningAset3.TABLE_NAME)
public class SipdMasterRekeningAset3Entity extends AbstractSipdMasterRekening3Entity<SipdMasterRekeningAset3, DataMasterRekeningAset3> implements SipdMasterRekeningAset3 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningAset3Entity subject;

	@Override
	public SipdMasterRekeningAset3 toDomain() {
		return this;
	}

}
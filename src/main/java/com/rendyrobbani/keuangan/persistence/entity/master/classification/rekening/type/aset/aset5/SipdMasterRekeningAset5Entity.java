package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset5;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset5.DataMasterRekeningAset5;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset5.SipdMasterRekeningAset5;
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
@Table(name = SipdMasterRekeningAset5.TABLE_NAME)
public class SipdMasterRekeningAset5Entity extends AbstractSipdMasterRekening5Entity<SipdMasterRekeningAset5, DataMasterRekeningAset5> implements SipdMasterRekeningAset5 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningAset5Entity subject;

	@Override
	public SipdMasterRekeningAset5 toDomain() {
		return this;
	}

}
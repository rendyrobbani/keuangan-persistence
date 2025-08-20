package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas1;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.ekuitas.ekuitas1.DataMasterRekeningEkuitas1;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.ekuitas.ekuitas1.SipdMasterRekeningEkuitas1;
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
@Table(name = SipdMasterRekeningEkuitas1.TABLE_NAME)
public class SipdMasterRekeningEkuitas1Entity extends AbstractSipdMasterRekening1Entity<SipdMasterRekeningEkuitas1, DataMasterRekeningEkuitas1> implements SipdMasterRekeningEkuitas1 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningEkuitas1Entity subject;

	@Override
	public SipdMasterRekeningEkuitas1 toDomain() {
		return this;
	}

}
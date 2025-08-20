package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.ekuitas.ekuitas6.DataMasterRekeningEkuitas6;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.ekuitas.ekuitas6.SipdMasterRekeningEkuitas6;
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
@Table(name = SipdMasterRekeningEkuitas6.TABLE_NAME)
public class SipdMasterRekeningEkuitas6Entity extends AbstractSipdMasterRekening6Entity<SipdMasterRekeningEkuitas6, DataMasterRekeningEkuitas6> implements SipdMasterRekeningEkuitas6 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningEkuitas6Entity subject;

	@Override
	public SipdMasterRekeningEkuitas6 toDomain() {
		return this;
	}

}
package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas2;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.ekuitas.ekuitas2.DataMasterRekeningEkuitas2;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.ekuitas.ekuitas2.SipdMasterRekeningEkuitas2;
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
@Table(name = SipdMasterRekeningEkuitas2.TABLE_NAME)
public class SipdMasterRekeningEkuitas2Entity extends AbstractSipdMasterRekening2Entity<SipdMasterRekeningEkuitas2, DataMasterRekeningEkuitas2> implements SipdMasterRekeningEkuitas2 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningEkuitas2Entity subject;

	@Override
	public SipdMasterRekeningEkuitas2 toDomain() {
		return this;
	}

}
package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas4;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.ekuitas.ekuitas4.DataMasterRekeningEkuitas4;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.ekuitas.ekuitas4.SipdMasterRekeningEkuitas4;
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
@Table(name = SipdMasterRekeningEkuitas4.TABLE_NAME)
public class SipdMasterRekeningEkuitas4Entity extends AbstractSipdMasterRekening4Entity<SipdMasterRekeningEkuitas4, DataMasterRekeningEkuitas4> implements SipdMasterRekeningEkuitas4 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningEkuitas4Entity subject;

	@Override
	public SipdMasterRekeningEkuitas4 toDomain() {
		return this;
	}

}
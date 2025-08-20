package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas5;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.ekuitas.ekuitas5.DataMasterRekeningEkuitas5;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.ekuitas.ekuitas5.SipdMasterRekeningEkuitas5;
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
@Table(name = SipdMasterRekeningEkuitas5.TABLE_NAME)
public class SipdMasterRekeningEkuitas5Entity extends AbstractSipdMasterRekening5Entity<SipdMasterRekeningEkuitas5, DataMasterRekeningEkuitas5> implements SipdMasterRekeningEkuitas5 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningEkuitas5Entity subject;

	@Override
	public SipdMasterRekeningEkuitas5 toDomain() {
		return this;
	}

}
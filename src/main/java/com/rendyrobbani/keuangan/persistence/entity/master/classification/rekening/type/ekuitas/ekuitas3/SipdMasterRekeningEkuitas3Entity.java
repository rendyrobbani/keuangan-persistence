package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas3;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.ekuitas.ekuitas3.DataMasterRekeningEkuitas3;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.ekuitas.ekuitas3.SipdMasterRekeningEkuitas3;
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
@Table(name = SipdMasterRekeningEkuitas3.TABLE_NAME)
public class SipdMasterRekeningEkuitas3Entity extends AbstractSipdMasterRekening3Entity<SipdMasterRekeningEkuitas3, DataMasterRekeningEkuitas3> implements SipdMasterRekeningEkuitas3 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningEkuitas3Entity subject;

	@Override
	public SipdMasterRekeningEkuitas3 toDomain() {
		return this;
	}

}
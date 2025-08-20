package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja3;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja3.DataMasterRekeningBelanja3;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja3.SipdMasterRekeningBelanja3;
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
@Table(name = SipdMasterRekeningBelanja3.TABLE_NAME)
public class SipdMasterRekeningBelanja3Entity extends AbstractSipdMasterRekening3Entity<SipdMasterRekeningBelanja3, DataMasterRekeningBelanja3> implements SipdMasterRekeningBelanja3 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningBelanja3Entity subject;

	@Override
	public SipdMasterRekeningBelanja3 toDomain() {
		return this;
	}

}
package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan3;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan.pendapatan3.DataMasterRekeningPendapatan3;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan.pendapatan3.SipdMasterRekeningPendapatan3;
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
@Table(name = SipdMasterRekeningPendapatan3.TABLE_NAME)
public class SipdMasterRekeningPendapatan3Entity extends AbstractSipdMasterRekening3Entity<SipdMasterRekeningPendapatan3, DataMasterRekeningPendapatan3> implements SipdMasterRekeningPendapatan3 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningPendapatan3Entity subject;

	@Override
	public SipdMasterRekeningPendapatan3 toDomain() {
		return this;
	}

}
package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban3;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.kewajiban.kewajiban3.DataMasterRekeningKewajiban3;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.kewajiban.kewajiban3.SipdMasterRekeningKewajiban3;
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
@Table(name = SipdMasterRekeningKewajiban3.TABLE_NAME)
public class SipdMasterRekeningKewajiban3Entity extends AbstractSipdMasterRekening3Entity<SipdMasterRekeningKewajiban3, DataMasterRekeningKewajiban3> implements SipdMasterRekeningKewajiban3 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningKewajiban3Entity subject;

	@Override
	public SipdMasterRekeningKewajiban3 toDomain() {
		return this;
	}

}
package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban5;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.kewajiban.kewajiban5.DataMasterRekeningKewajiban5;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.kewajiban.kewajiban5.SipdMasterRekeningKewajiban5;
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
@Table(name = SipdMasterRekeningKewajiban5.TABLE_NAME)
public class SipdMasterRekeningKewajiban5Entity extends AbstractSipdMasterRekening5Entity<SipdMasterRekeningKewajiban5, DataMasterRekeningKewajiban5> implements SipdMasterRekeningKewajiban5 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningKewajiban5Entity subject;

	@Override
	public SipdMasterRekeningKewajiban5 toDomain() {
		return this;
	}

}
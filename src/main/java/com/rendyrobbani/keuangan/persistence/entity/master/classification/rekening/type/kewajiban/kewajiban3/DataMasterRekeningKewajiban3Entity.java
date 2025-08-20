package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban3;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.kewajiban.kewajiban3.DataMasterRekeningKewajiban3;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.base.rekening3.AbstractDataMasterRekening3Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban1.DataMasterRekeningKewajiban1Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban2.DataMasterRekeningKewajiban2Entity;
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
@Table(name = DataMasterRekeningKewajiban3.TABLE_NAME, uniqueConstraints = {@UniqueConstraint(columnNames = {"rekening1_id", "rekening2_id", "id"})})
public class DataMasterRekeningKewajiban3Entity extends AbstractDataMasterRekening3Entity<DataMasterRekeningKewajiban3> implements DataMasterRekeningKewajiban3 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "rekening1_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningKewajiban1Entity rekening1;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "rekening1_id", referencedColumnName = "rekening1_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening2_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningKewajiban2Entity rekening2;

	@Override
	public DataMasterRekeningKewajiban3 toDomain() {
		return this;
	}

}
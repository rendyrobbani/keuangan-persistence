package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban4;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.kewajiban.kewajiban4.DataMasterRekeningKewajiban4;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.base.rekening4.AbstractDataMasterRekening4Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban1.DataMasterRekeningKewajiban1Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban2.DataMasterRekeningKewajiban2Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban3.DataMasterRekeningKewajiban3Entity;
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
@Table(name = DataMasterRekeningKewajiban4.TABLE_NAME, uniqueConstraints = {@UniqueConstraint(columnNames = {"rekening1_id", "rekening2_id", "rekening3_id", "id"})})
public class DataMasterRekeningKewajiban4Entity extends AbstractDataMasterRekening4Entity<DataMasterRekeningKewajiban4> implements DataMasterRekeningKewajiban4 {

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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "rekening1_id", referencedColumnName = "rekening1_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening2_id", referencedColumnName = "rekening2_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening3_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningKewajiban3Entity rekening3;

	@Override
	public DataMasterRekeningKewajiban4 toDomain() {
		return this;
	}

}
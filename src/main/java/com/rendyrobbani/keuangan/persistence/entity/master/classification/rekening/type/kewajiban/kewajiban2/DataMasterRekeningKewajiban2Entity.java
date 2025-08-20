package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban2;

import com.rendyrobbani.keuangan.core.common.classification.rekening.RekeningClassification;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.kewajiban.kewajiban2.DataMasterRekeningKewajiban2;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.base.rekening2.AbstractDataMasterRekening2Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban1.DataMasterRekeningKewajiban1Entity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Data
@Setter(AccessLevel.NONE)
@Accessors(fluent = true)
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = DataMasterRekeningKewajiban2.TABLE_NAME, uniqueConstraints = {@UniqueConstraint(columnNames = {"rekening1_id", "id"})})
public class DataMasterRekeningKewajiban2Entity extends AbstractDataMasterRekening2Entity<DataMasterRekeningKewajiban2> implements DataMasterRekeningKewajiban2 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "rekening1_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningKewajiban1Entity rekening1;

	@Override
	public DataMasterRekeningKewajiban2 toDomain() {
		return this;
	}

	@Override
	public void create(RekeningClassification classification, String name, LocalDateTime createdAt, String createdBy) {
		if (!classification.isKewajiban()) throw new RuntimeException("Invalid classification");
		super.create(classification, name, createdAt, createdBy);
	}

}
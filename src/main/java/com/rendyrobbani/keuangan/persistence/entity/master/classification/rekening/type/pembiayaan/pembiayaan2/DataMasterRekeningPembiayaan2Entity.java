package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pembiayaan.pembiayaan2;

import com.rendyrobbani.keuangan.core.common.classification.rekening.RekeningClassification;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pembiayaan.pembiayaan2.DataMasterRekeningPembiayaan2;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.base.rekening2.AbstractDataMasterRekening2Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pembiayaan.pembiayaan1.DataMasterRekeningPembiayaan1Entity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.hibernate.annotations.Check;

import java.time.LocalDateTime;

@Data
@Setter(AccessLevel.NONE)
@Accessors(fluent = true)
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = DataMasterRekeningPembiayaan2.TABLE_NAME, uniqueConstraints = {@UniqueConstraint(columnNames = {"rekening1_id", "id"})})
public class DataMasterRekeningPembiayaan2Entity extends AbstractDataMasterRekening2Entity<DataMasterRekeningPembiayaan2> implements DataMasterRekeningPembiayaan2 {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "rekening1_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterRekeningPembiayaan1Entity rekening1;

	@Check(constraints = "id like '6.1%'")
	@Column(name = "is_income", nullable = false)
	private boolean isIncome;

	@Check(constraints = "id like '6.2%'")
	@Column(name = "is_expend", nullable = false)
	private boolean isExpend;

	@Override
	public DataMasterRekeningPembiayaan2 toDomain() {
		return this;
	}

	@Override
	public void create(RekeningClassification classification, String name, LocalDateTime createdAt, String createdBy) {
		if (!classification.isPembiayaan()) throw new RuntimeException("Invalid classification");
		this.isIncome = classification.rekening2Code().equals("6.1");
		this.isExpend = classification.rekening2Code().equals("6.2");
		super.create(classification, name, createdAt, createdBy);
	}

}